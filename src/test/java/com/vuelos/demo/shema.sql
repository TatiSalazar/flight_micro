--
-- PostgreSQL database dump
--

-- Dumped from database version 13.3
-- Dumped by pg_dump version 13.3

-- Started on 2021-07-19 11:03:32

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 200 (class 1259 OID 17997)
-- Name: aeropuerto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.aeropuerto (
    id integer NOT NULL,
    aeropuerto_activo character varying(2),
    ciudad character varying(50),
    nombre character varying(50),
    numero_pistas integer
);


ALTER TABLE public.aeropuerto OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 18002)
-- Name: avion; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.avion (
    id integer NOT NULL,
    capacidad integer,
    modelo character varying(50),
    aeropuerto integer NOT NULL,
    compania integer NOT NULL
);


ALTER TABLE public.avion OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 18007)
-- Name: compania; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.compania (
    id integer NOT NULL,
    nombre_compania character varying(50)
);


ALTER TABLE public.compania OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 18012)
-- Name: destino_origen; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.destino_origen (
    id integer NOT NULL,
    nombre_aeropuert_origen character varying(50),
    nombre_aeropuerto_destino character varying(50),
    nombre_ciudad_destino character varying(50),
    nombre_ciudad_origen character varying(50)
);


ALTER TABLE public.destino_origen OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 18017)
-- Name: itinerario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.itinerario (
    id integer NOT NULL,
    fecha_llegada character varying(255),
    fecha_salida character varying(255),
    destino_origen integer NOT NULL
);


ALTER TABLE public.itinerario OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 18043)
-- Name: native; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.native
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.native OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 18025)
-- Name: pasaje; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pasaje (
    id integer NOT NULL,
    asiento character varying(255),
    clase character varying(255),
    valor real,
    pasajero integer NOT NULL,
    vuelo integer NOT NULL
);


ALTER TABLE public.pasaje OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 18033)
-- Name: pasajero; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pasajero (
    id integer NOT NULL,
    documento character varying(50),
    email character varying(50),
    nombre character varying(50),
    telefono character varying(50)
);


ALTER TABLE public.pasajero OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 18038)
-- Name: vuelo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vuelo (
    id integer NOT NULL,
    capacidad integer,
    numero_vuelo character varying(255),
    avion integer NOT NULL,
    compania integer NOT NULL,
    itinerario integer NOT NULL
);


ALTER TABLE public.vuelo OWNER TO postgres;

--
-- TOC entry 3034 (class 0 OID 17997)
-- Dependencies: 200
-- Data for Name: aeropuerto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.aeropuerto (id, aeropuerto_activo, ciudad, nombre, numero_pistas) FROM stdin;
1	si	Armenia	Aeropuerto Internacional El Eden	2
2	si	Pereira	Aeropuerto Internacional Matecaña	3
3	si	Manizales	Aeropuerto Nacional La Nubia	3
4	si	Cali	Aeropuerto Internacional Alfonso Bonilla Aragón	3
\.


--
-- TOC entry 3035 (class 0 OID 18002)
-- Dependencies: 201
-- Data for Name: avion; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.avion (id, capacidad, modelo, aeropuerto, compania) FROM stdin;
1	74	ATR-72	1	1
2	180	Airbus A320	1	2
3	74	ATR-72	2	1
4	74	ATR-72	3	1
5	74	ATR-72	4	1
\.


--
-- TOC entry 3036 (class 0 OID 18007)
-- Dependencies: 202
-- Data for Name: compania; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.compania (id, nombre_compania) FROM stdin;
1	Avianca
2	Viva Air
\.


--
-- TOC entry 3037 (class 0 OID 18012)
-- Dependencies: 203
-- Data for Name: destino_origen; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.destino_origen (id, nombre_aeropuert_origen, nombre_aeropuerto_destino, nombre_ciudad_destino, nombre_ciudad_origen) FROM stdin;
1	Aeropuerto Internacional El Eden	Aeropuerto Internacional Alfonso Bonilla Aragón	Cali	Armenia
2	Aeropuerto Internacional Alfonso Bonilla Aragón	Aeropuerto Internacional El Eden	Armenia	Cali
3	Aeropuerto Internacional Matecaña	Aeropuerto Internacional Alfonso Bonilla Aragón	Cali	Pereira
4	Aeropuerto Nacional La Nubia	Aeropuerto Internacional El Eden	Armenia	Manizales
\.


--
-- TOC entry 3038 (class 0 OID 18017)
-- Dependencies: 204
-- Data for Name: itinerario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.itinerario (id, fecha_llegada, fecha_salida, destino_origen) FROM stdin;
1	2021-06-29 05:00:00	2021-06-29 03:00:00	1
2	2021-06-30 03:00:00	2021-06-30 01:00:00	2
3	2021-07-01 07:00:00	2021-07-01 06:00:00	3
\.


--
-- TOC entry 3039 (class 0 OID 18025)
-- Dependencies: 205
-- Data for Name: pasaje; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pasaje (id, asiento, clase, valor, pasajero, vuelo) FROM stdin;
1	45	turista	200	1	1
2	15	economica	100	2	1
3	22	turista	400	3	1
\.


--
-- TOC entry 3040 (class 0 OID 18033)
-- Dependencies: 206
-- Data for Name: pasajero; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pasajero (id, documento, email, nombre, telefono) FROM stdin;
1	10100123	jorgesalazar@gmail.com	Eduardo Crosthwaite	321818732
2	41768023	mariaalazar@gmail.com	Maria Pineda	3019084563
3	1095967409	gjaramillo@hotmail.com	Geraldine Jaramillo	312450945
4	111111	daniel@hotmail.com	Daniel Beltran Gomez	31352
\.


--
-- TOC entry 3041 (class 0 OID 18038)
-- Dependencies: 207
-- Data for Name: vuelo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.vuelo (id, capacidad, numero_vuelo, avion, compania, itinerario) FROM stdin;
1	74	1	1	1	1
2	74	2	1	1	1
3	180	3	1	2	1
\.


--
-- TOC entry 3048 (class 0 OID 0)
-- Dependencies: 208
-- Name: native; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.native', 5, true);


--
-- TOC entry 2881 (class 2606 OID 18001)
-- Name: aeropuerto aeropuerto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.aeropuerto
    ADD CONSTRAINT aeropuerto_pkey PRIMARY KEY (id);


--
-- TOC entry 2883 (class 2606 OID 18006)
-- Name: avion avion_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.avion
    ADD CONSTRAINT avion_pkey PRIMARY KEY (id);


--
-- TOC entry 2885 (class 2606 OID 18011)
-- Name: compania compania_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compania
    ADD CONSTRAINT compania_pkey PRIMARY KEY (id);


--
-- TOC entry 2887 (class 2606 OID 18016)
-- Name: destino_origen destino_origen_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.destino_origen
    ADD CONSTRAINT destino_origen_pkey PRIMARY KEY (id);


--
-- TOC entry 2889 (class 2606 OID 18024)
-- Name: itinerario itinerario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itinerario
    ADD CONSTRAINT itinerario_pkey PRIMARY KEY (id);


--
-- TOC entry 2891 (class 2606 OID 18032)
-- Name: pasaje pasaje_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pasaje
    ADD CONSTRAINT pasaje_pkey PRIMARY KEY (id);


--
-- TOC entry 2893 (class 2606 OID 18037)
-- Name: pasajero pasajero_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pasajero
    ADD CONSTRAINT pasajero_pkey PRIMARY KEY (id);


--
-- TOC entry 2895 (class 2606 OID 18042)
-- Name: vuelo vuelo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vuelo
    ADD CONSTRAINT vuelo_pkey PRIMARY KEY (id);


--
-- TOC entry 2899 (class 2606 OID 18060)
-- Name: pasaje fk1wx21h63wqtqs7j5v6gfqg13n; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pasaje
    ADD CONSTRAINT fk1wx21h63wqtqs7j5v6gfqg13n FOREIGN KEY (pasajero) REFERENCES public.pasajero(id) ON DELETE CASCADE;


--
-- TOC entry 2901 (class 2606 OID 18070)
-- Name: vuelo fk6l81vp3v4x89pabfnwai9250f; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vuelo
    ADD CONSTRAINT fk6l81vp3v4x89pabfnwai9250f FOREIGN KEY (avion) REFERENCES public.avion(id);


--
-- TOC entry 2897 (class 2606 OID 18050)
-- Name: avion fk8vi4ciu46jn55gx9gduxb0s8g; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.avion
    ADD CONSTRAINT fk8vi4ciu46jn55gx9gduxb0s8g FOREIGN KEY (compania) REFERENCES public.compania(id);


--
-- TOC entry 2902 (class 2606 OID 18075)
-- Name: vuelo fk9g0soqhcxh447pmmwxmgal0gr; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vuelo
    ADD CONSTRAINT fk9g0soqhcxh447pmmwxmgal0gr FOREIGN KEY (compania) REFERENCES public.compania(id);


--
-- TOC entry 2896 (class 2606 OID 18045)
-- Name: avion fkgxu33rgut9wrx5k1bv6qtge5i; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.avion
    ADD CONSTRAINT fkgxu33rgut9wrx5k1bv6qtge5i FOREIGN KEY (aeropuerto) REFERENCES public.aeropuerto(id);


--
-- TOC entry 2898 (class 2606 OID 18055)
-- Name: itinerario fki5lyvvh9au1fi2w0rly17tkbg; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.itinerario
    ADD CONSTRAINT fki5lyvvh9au1fi2w0rly17tkbg FOREIGN KEY (destino_origen) REFERENCES public.destino_origen(id);


--
-- TOC entry 2900 (class 2606 OID 18065)
-- Name: pasaje fkq956k7psm8yw4in6eyx35b6rt; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pasaje
    ADD CONSTRAINT fkq956k7psm8yw4in6eyx35b6rt FOREIGN KEY (vuelo) REFERENCES public.vuelo(id);


--
-- TOC entry 2903 (class 2606 OID 18080)
-- Name: vuelo fkrt2osbflwiuqs7b6hcwy1nu7i; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vuelo
    ADD CONSTRAINT fkrt2osbflwiuqs7b6hcwy1nu7i FOREIGN KEY (itinerario) REFERENCES public.itinerario(id);


-- Completed on 2021-07-19 11:03:33

--
-- PostgreSQL database dump complete
--

