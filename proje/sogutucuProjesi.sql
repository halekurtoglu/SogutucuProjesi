--
-- PostgreSQL database dump
--

-- Dumped from database version 13.2
-- Dumped by pg_dump version 13.1

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
-- Name: kullanicilar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.kullanicilar (
    ad character varying NOT NULL,
    adres character varying,
    id integer NOT NULL,
    email character varying,
    sifre character varying NOT NULL,
    telefon character varying
);


ALTER TABLE public.kullanicilar OWNER TO postgres;

--
-- Data for Name: kullanicilar; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.kullanicilar VALUES
	('cem', 'istanbul', 1, 'cem@gmail.com', '34dv0744', '05381111111'),
	('halenur', 'kocaeli', 2, NULL, 'g191210067', NULL),
	('begüm', 'kocaeli', 3, 'begum@gmail.com', '12345', NULL),
	('sude', 'istanbul', 4, NULL, 'sude123', '05568989891'),
	('şevval', 'sakarya', 7, 'sevval@gmail.com', 'sevval321', NULL),
	('mehmet', 'izmir', 5, 'mehmet@gmail.com', '35mehmet', NULL),
	('engin', 'ankara', 6, NULL, 'engin06', '05591111111'),
	('hazal', 'bursa', 8, 'hazal@gmail.com', 'hzl123', '05357777777');


--
-- PostgreSQL database dump complete
--

