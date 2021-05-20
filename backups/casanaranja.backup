--
-- PostgreSQL database dump
--

-- Dumped from database version 10.15 (Ubuntu 10.15-0ubuntu0.18.04.1)
-- Dumped by pg_dump version 10.15 (Ubuntu 10.15-0ubuntu0.18.04.1)

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

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: atributos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.atributos (
    id bigint NOT NULL,
    valor character varying(255),
    valor_numerico double precision NOT NULL
);


ALTER TABLE public.atributos OWNER TO postgres;

--
-- Name: atributos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.atributos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.atributos_id_seq OWNER TO postgres;

--
-- Name: atributos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.atributos_id_seq OWNED BY public.atributos.id;


--
-- Name: caja; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.caja (
    id bigint NOT NULL,
    descripcion character varying(255),
    diferencia double precision NOT NULL,
    existencia_fisica double precision NOT NULL,
    existencia_inicial double precision NOT NULL,
    fecha character varying(255),
    monto_facturado double precision NOT NULL,
    salidas_no_contabilizadas double precision NOT NULL,
    sucursal_id bigint
);


ALTER TABLE public.caja OWNER TO postgres;

--
-- Name: caja_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.caja_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.caja_id_seq OWNER TO postgres;

--
-- Name: caja_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.caja_id_seq OWNED BY public.caja.id;


--
-- Name: cliente_sucursal; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cliente_sucursal (
    id_cliente bigint NOT NULL,
    id_sucursal bigint NOT NULL
);


ALTER TABLE public.cliente_sucursal OWNER TO postgres;

--
-- Name: clientes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.clientes (
    id bigint NOT NULL,
    cuit character varying(255),
    direccion character varying(255),
    email character varying(255),
    estado character varying(255),
    nombre character varying(255),
    nombre_contacto character varying(255),
    pais character varying(255),
    razon_social character varying(255),
    region character varying(255),
    telefono character varying(255),
    telefono_alternativo character varying(255),
    tipo_persona integer NOT NULL,
    condicion_iva_id bigint,
    alic_ing_brutos numeric(10,2) DEFAULT 0.00
);


ALTER TABLE public.clientes OWNER TO postgres;

--
-- Name: clientes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.clientes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.clientes_id_seq OWNER TO postgres;

--
-- Name: clientes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.clientes_id_seq OWNED BY public.clientes.id;


--
-- Name: comprobantes_fiscales; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.comprobantes_fiscales (
    id bigint NOT NULL,
    bar_code character varying(255),
    cae character varying(255),
    cerrado character varying(255),
    condicion_venta boolean,
    fecha_emision character varying(255),
    fecha_vto character varying(255),
    letra character varying(255),
    nombre_documento character varying(255),
    numero_cbte character varying(255) NOT NULL,
    productos bytea,
    total_venta double precision,
    cliente_id bigint,
    documento_comercial_id bigint,
    empresa_id bigint,
    punto_venta_id bigint,
    sucursal_id bigint,
    ingresos_brutos numeric(10,2) DEFAULT 0.00,
    producto_description bytea,
    productos_detalle bytea
);


ALTER TABLE public.comprobantes_fiscales OWNER TO postgres;

--
-- Name: comprobantes_fiscales_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.comprobantes_fiscales_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.comprobantes_fiscales_id_seq OWNER TO postgres;

--
-- Name: comprobantes_fiscales_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.comprobantes_fiscales_id_seq OWNED BY public.comprobantes_fiscales.id;


--
-- Name: comprobantes_medios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.comprobantes_medios (
    id_comprobante bigint NOT NULL,
    id_medio bigint NOT NULL
);


ALTER TABLE public.comprobantes_medios OWNER TO postgres;

--
-- Name: comprobantes_planes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.comprobantes_planes (
    id_comprobante bigint NOT NULL,
    id_plan bigint NOT NULL
);


ALTER TABLE public.comprobantes_planes OWNER TO postgres;

--
-- Name: condiciones_documentos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.condiciones_documentos (
    id_condicion bigint NOT NULL,
    id_documento bigint NOT NULL
);


ALTER TABLE public.condiciones_documentos OWNER TO postgres;

--
-- Name: condiciones_fiscales; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.condiciones_fiscales (
    id bigint NOT NULL,
    nombre character varying(255) NOT NULL
);


ALTER TABLE public.condiciones_fiscales OWNER TO postgres;

--
-- Name: condiciones_fiscales_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.condiciones_fiscales_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.condiciones_fiscales_id_seq OWNER TO postgres;

--
-- Name: condiciones_fiscales_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.condiciones_fiscales_id_seq OWNED BY public.condiciones_fiscales.id;


--
-- Name: depositos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.depositos (
    id bigint NOT NULL,
    default_deposit character varying(255),
    direccion character varying(255) NOT NULL,
    nombre character varying(255) NOT NULL,
    telefono character varying(255),
    sucursales_id bigint
);


ALTER TABLE public.depositos OWNER TO postgres;

--
-- Name: depositos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.depositos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.depositos_id_seq OWNER TO postgres;

--
-- Name: depositos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.depositos_id_seq OWNED BY public.depositos.id;


--
-- Name: devoluciones; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.devoluciones (
    id bigint NOT NULL,
    descripcion character varying(255),
    fecha character varying(255),
    productos bytea,
    productos_salientes bytea,
    total_devolucion double precision NOT NULL,
    comprobante_id bigint,
    empresa_id bigint,
    sucursal_id bigint
);


ALTER TABLE public.devoluciones OWNER TO postgres;

--
-- Name: devoluciones_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.devoluciones_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.devoluciones_id_seq OWNER TO postgres;

--
-- Name: devoluciones_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.devoluciones_id_seq OWNED BY public.devoluciones.id;


--
-- Name: distribuidores; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.distribuidores (
    id bigint NOT NULL,
    cuit character varying(255),
    direccion character varying(255),
    email character varying(255),
    estado character varying(255),
    nombre character varying(255),
    nombre_contacto character varying(255),
    pais character varying(255),
    razon_social character varying(255),
    region character varying(255),
    telefono character varying(255),
    telefono_alternativo character varying(255),
    tipo_persona integer NOT NULL,
    condicion_iva_id bigint
);


ALTER TABLE public.distribuidores OWNER TO postgres;

--
-- Name: distribuidores_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.distribuidores_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.distribuidores_id_seq OWNER TO postgres;

--
-- Name: distribuidores_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.distribuidores_id_seq OWNED BY public.distribuidores.id;


--
-- Name: documentos_comerciales; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.documentos_comerciales (
    id bigint NOT NULL,
    activo boolean NOT NULL,
    codigo_documento character varying(255) NOT NULL,
    iva_cat integer NOT NULL,
    letra character varying(255),
    nombre character varying(255) NOT NULL,
    tipo boolean NOT NULL,
    ticket boolean DEFAULT false
);


ALTER TABLE public.documentos_comerciales OWNER TO postgres;

--
-- Name: documentos_comerciales_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.documentos_comerciales_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.documentos_comerciales_id_seq OWNER TO postgres;

--
-- Name: documentos_comerciales_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.documentos_comerciales_id_seq OWNED BY public.documentos_comerciales.id;


--
-- Name: empresas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.empresas (
    id bigint NOT NULL,
    alias character varying(255),
    cuit character varying(255) NOT NULL,
    fecha_inicio_act timestamp without time zone,
    ing_bruto integer NOT NULL,
    razon_social character varying(255) NOT NULL,
    condicion_iva_id bigint
);


ALTER TABLE public.empresas OWNER TO postgres;

--
-- Name: empresas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.empresas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.empresas_id_seq OWNER TO postgres;

--
-- Name: empresas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.empresas_id_seq OWNED BY public.empresas.id;


--
-- Name: historial_movimientos_stock; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.historial_movimientos_stock (
    id bigint NOT NULL,
    descripcion character varying(255),
    fecha character varying(255),
    stocks bytea,
    usuario character varying(255),
    sucursal_id bigint
);


ALTER TABLE public.historial_movimientos_stock OWNER TO postgres;

--
-- Name: historial_movimientos_stock_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.historial_movimientos_stock_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.historial_movimientos_stock_id_seq OWNER TO postgres;

--
-- Name: historial_movimientos_stock_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.historial_movimientos_stock_id_seq OWNED BY public.historial_movimientos_stock.id;


--
-- Name: ivas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ivas (
    id bigint NOT NULL,
    nombre character varying(255),
    porcentaje double precision NOT NULL,
    tipo boolean DEFAULT false NOT NULL
);


ALTER TABLE public.ivas OWNER TO postgres;

--
-- Name: ivas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.ivas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.ivas_id_seq OWNER TO postgres;

--
-- Name: ivas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.ivas_id_seq OWNED BY public.ivas.id;


--
-- Name: marcas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.marcas (
    id bigint NOT NULL,
    nombre character varying(255) NOT NULL
);


ALTER TABLE public.marcas OWNER TO postgres;

--
-- Name: marcas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.marcas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.marcas_id_seq OWNER TO postgres;

--
-- Name: marcas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.marcas_id_seq OWNED BY public.marcas.id;


--
-- Name: medios_pagos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.medios_pagos (
    id bigint NOT NULL,
    nombre character varying(255) NOT NULL,
    sucursal_id bigint,
    suma_en_cierre_de_caja boolean DEFAULT false
);


ALTER TABLE public.medios_pagos OWNER TO postgres;

--
-- Name: medios_pagos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.medios_pagos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.medios_pagos_id_seq OWNER TO postgres;

--
-- Name: medios_pagos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.medios_pagos_id_seq OWNED BY public.medios_pagos.id;


--
-- Name: medios_planes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.medios_planes (
    id_medio bigint NOT NULL,
    id_plan bigint NOT NULL
);


ALTER TABLE public.medios_planes OWNER TO postgres;

--
-- Name: mensajes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.mensajes (
    id bigint NOT NULL,
    contact_phone_or_email character varying(255),
    date character varying(255),
    message character varying(255),
    name_and_last_name character varying(255)
);


ALTER TABLE public.mensajes OWNER TO postgres;

--
-- Name: mensajes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.mensajes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.mensajes_id_seq OWNER TO postgres;

--
-- Name: mensajes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.mensajes_id_seq OWNED BY public.mensajes.id;


--
-- Name: modulos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.modulos (
    id bigint NOT NULL,
    nombre character varying(255) NOT NULL
);


ALTER TABLE public.modulos OWNER TO postgres;

--
-- Name: modulos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.modulos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.modulos_id_seq OWNER TO postgres;

--
-- Name: modulos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.modulos_id_seq OWNED BY public.modulos.id;


--
-- Name: note; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.note (
    id bigint NOT NULL,
    details character varying(255),
    end_event character varying(255),
    name character varying(255),
    start_event character varying(255)
);


ALTER TABLE public.note OWNER TO postgres;

--
-- Name: note_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.note_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.note_id_seq OWNER TO postgres;

--
-- Name: note_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.note_id_seq OWNED BY public.note.id;


--
-- Name: perfiles; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.perfiles (
    id bigint NOT NULL,
    nombre character varying(255) NOT NULL
);


ALTER TABLE public.perfiles OWNER TO postgres;

--
-- Name: perfiles_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.perfiles_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.perfiles_id_seq OWNER TO postgres;

--
-- Name: perfiles_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.perfiles_id_seq OWNED BY public.perfiles.id;


--
-- Name: perfiles_modulos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.perfiles_modulos (
    perfil_id bigint NOT NULL,
    modulos_id bigint NOT NULL
);


ALTER TABLE public.perfiles_modulos OWNER TO postgres;

--
-- Name: planes_pagos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.planes_pagos (
    id bigint NOT NULL,
    cuotas integer NOT NULL,
    nombre character varying(255) NOT NULL,
    porcentaje double precision NOT NULL,
    sucursal_id bigint
);


ALTER TABLE public.planes_pagos OWNER TO postgres;

--
-- Name: planes_pagos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.planes_pagos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.planes_pagos_id_seq OWNER TO postgres;

--
-- Name: planes_pagos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.planes_pagos_id_seq OWNED BY public.planes_pagos.id;


--
-- Name: preguntas_frecuentes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.preguntas_frecuentes (
    id bigint NOT NULL,
    pregunta character varying(255),
    respuesta character varying(255)
);


ALTER TABLE public.preguntas_frecuentes OWNER TO postgres;

--
-- Name: preguntas_frecuentes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.preguntas_frecuentes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.preguntas_frecuentes_id_seq OWNER TO postgres;

--
-- Name: preguntas_frecuentes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.preguntas_frecuentes_id_seq OWNED BY public.preguntas_frecuentes.id;


--
-- Name: productos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.productos (
    id bigint NOT NULL,
    codigo_barra character varying(255) NOT NULL,
    codigo_producto character varying(255) NOT NULL,
    costo_bruto double precision NOT NULL,
    costo_neto double precision NOT NULL,
    estado integer NOT NULL,
    ganancia double precision NOT NULL,
    iva_compra double precision NOT NULL,
    iva_venta double precision NOT NULL,
    nombre character varying(255) NOT NULL,
    precio_costo double precision NOT NULL,
    precio_sin_iva double precision NOT NULL,
    precio_total double precision NOT NULL,
    propiedad integer NOT NULL,
    iva_compras_object_id bigint,
    iva_ventas_object_id bigint,
    marca_id bigint,
    rubro_id bigint,
    editable boolean DEFAULT false
);


ALTER TABLE public.productos OWNER TO postgres;

--
-- Name: productos_atributos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.productos_atributos (
    id_producto bigint NOT NULL,
    id_atributo bigint NOT NULL
);


ALTER TABLE public.productos_atributos OWNER TO postgres;

--
-- Name: productos_depositos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.productos_depositos (
    id_producto bigint NOT NULL,
    id_deposito bigint NOT NULL
);


ALTER TABLE public.productos_depositos OWNER TO postgres;

--
-- Name: productos_distribuidores; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.productos_distribuidores (
    id_producto bigint NOT NULL,
    id_distribuidor bigint NOT NULL
);


ALTER TABLE public.productos_distribuidores OWNER TO postgres;

--
-- Name: productos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.productos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.productos_id_seq OWNER TO postgres;

--
-- Name: productos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.productos_id_seq OWNED BY public.productos.id;


--
-- Name: productos_propiedades; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.productos_propiedades (
    id_producto bigint NOT NULL,
    id_propiedad bigint NOT NULL
);


ALTER TABLE public.productos_propiedades OWNER TO postgres;

--
-- Name: productos_variaciones; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.productos_variaciones (
    id bigint NOT NULL,
    nombre character varying(255) NOT NULL,
    porcentaje double precision NOT NULL,
    producto_id bigint NOT NULL
);


ALTER TABLE public.productos_variaciones OWNER TO postgres;

--
-- Name: productos_variaciones_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.productos_variaciones_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.productos_variaciones_id_seq OWNER TO postgres;

--
-- Name: productos_variaciones_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.productos_variaciones_id_seq OWNED BY public.productos_variaciones.id;


--
-- Name: propiedades; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.propiedades (
    id bigint NOT NULL,
    nombre character varying(255)
);


ALTER TABLE public.propiedades OWNER TO postgres;

--
-- Name: propiedades_atributos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.propiedades_atributos (
    id_propiedad bigint NOT NULL,
    id_atributo bigint NOT NULL
);


ALTER TABLE public.propiedades_atributos OWNER TO postgres;

--
-- Name: propiedades_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.propiedades_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.propiedades_id_seq OWNER TO postgres;

--
-- Name: propiedades_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.propiedades_id_seq OWNED BY public.propiedades.id;


--
-- Name: proveedor_sucursal; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.proveedor_sucursal (
    id_proveedor bigint NOT NULL,
    id_sucursal bigint NOT NULL
);


ALTER TABLE public.proveedor_sucursal OWNER TO postgres;

--
-- Name: punto_ventas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.punto_ventas (
    id bigint NOT NULL,
    id_fiscal integer NOT NULL,
    nombre character varying(255) NOT NULL,
    sucursal_id bigint NOT NULL,
    ip_local character varying(255)
);


ALTER TABLE public.punto_ventas OWNER TO postgres;

--
-- Name: punto_ventas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.punto_ventas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.punto_ventas_id_seq OWNER TO postgres;

--
-- Name: punto_ventas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.punto_ventas_id_seq OWNED BY public.punto_ventas.id;


--
-- Name: rubros; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.rubros (
    id bigint NOT NULL,
    nombre character varying(255) NOT NULL
);


ALTER TABLE public.rubros OWNER TO postgres;

--
-- Name: rubros_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.rubros_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.rubros_id_seq OWNER TO postgres;

--
-- Name: rubros_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.rubros_id_seq OWNED BY public.rubros.id;


--
-- Name: stocks; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.stocks (
    id bigint NOT NULL,
    algorim character varying(255),
    cantidad double precision NOT NULL,
    cantidad_minima character varying(255),
    deposito_id bigint,
    producto_id bigint,
    sucursal_id bigint
);


ALTER TABLE public.stocks OWNER TO postgres;

--
-- Name: stocks_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.stocks_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.stocks_id_seq OWNER TO postgres;

--
-- Name: stocks_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.stocks_id_seq OWNED BY public.stocks.id;


--
-- Name: sucursales; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sucursales (
    id bigint NOT NULL,
    ciudad character varying(255),
    cuit character varying(255),
    direccion character varying(255) NOT NULL,
    email character varying(255),
    fecha_inicio_act timestamp without time zone,
    ing_bruto integer,
    nombre character varying(255) NOT NULL,
    nombre_contacto character varying(255),
    provincia character varying(255),
    razon_social character varying(255),
    telefono character varying(255),
    telefono_alternativo character varying(255),
    condicion_iva_id bigint,
    empresa_id bigint NOT NULL,
    variacion_ganancia numeric(10,2) DEFAULT 0.00
);


ALTER TABLE public.sucursales OWNER TO postgres;

--
-- Name: sucursales_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.sucursales_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sucursales_id_seq OWNER TO postgres;

--
-- Name: sucursales_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.sucursales_id_seq OWNED BY public.sucursales.id;


--
-- Name: transportista_sucursal; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.transportista_sucursal (
    id_transportista bigint NOT NULL,
    id_sucursal bigint NOT NULL
);


ALTER TABLE public.transportista_sucursal OWNER TO postgres;

--
-- Name: transportistas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.transportistas (
    id bigint NOT NULL,
    cuit character varying(255),
    direccion character varying(255),
    email character varying(255),
    estado character varying(255),
    nombre character varying(255),
    nombre_contacto character varying(255),
    pais character varying(255),
    razon_social character varying(255),
    region character varying(255),
    telefono character varying(255),
    telefono_alternativo character varying(255),
    tipo_persona integer NOT NULL,
    condicion_iva_id bigint
);


ALTER TABLE public.transportistas OWNER TO postgres;

--
-- Name: transportistas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.transportistas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.transportistas_id_seq OWNER TO postgres;

--
-- Name: transportistas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.transportistas_id_seq OWNED BY public.transportistas.id;


--
-- Name: usuarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuarios (
    id bigint NOT NULL,
    nombre character varying(255) NOT NULL,
    password character varying(255),
    username character varying(255),
    empresa_id bigint,
    perfil_id bigint,
    punto_venta_id bigint,
    sucursal_id bigint
);


ALTER TABLE public.usuarios OWNER TO postgres;

--
-- Name: usuarios_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuarios_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.usuarios_id_seq OWNER TO postgres;

--
-- Name: usuarios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuarios_id_seq OWNED BY public.usuarios.id;


--
-- Name: vendedor_sucursal; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vendedor_sucursal (
    id_vendedor bigint NOT NULL,
    id_sucursal bigint NOT NULL
);


ALTER TABLE public.vendedor_sucursal OWNER TO postgres;

--
-- Name: vendedores; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vendedores (
    id bigint NOT NULL,
    cuit character varying(255),
    direccion character varying(255),
    email character varying(255),
    estado character varying(255),
    nombre character varying(255),
    nombre_contacto character varying(255),
    pais character varying(255),
    razon_social character varying(255),
    region character varying(255),
    telefono character varying(255),
    telefono_alternativo character varying(255),
    tipo_persona integer NOT NULL,
    condicion_iva_id bigint
);


ALTER TABLE public.vendedores OWNER TO postgres;

--
-- Name: vendedores_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.vendedores_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.vendedores_id_seq OWNER TO postgres;

--
-- Name: vendedores_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.vendedores_id_seq OWNED BY public.vendedores.id;


--
-- Name: atributos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.atributos ALTER COLUMN id SET DEFAULT nextval('public.atributos_id_seq'::regclass);


--
-- Name: caja id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.caja ALTER COLUMN id SET DEFAULT nextval('public.caja_id_seq'::regclass);


--
-- Name: clientes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes ALTER COLUMN id SET DEFAULT nextval('public.clientes_id_seq'::regclass);


--
-- Name: comprobantes_fiscales id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_fiscales ALTER COLUMN id SET DEFAULT nextval('public.comprobantes_fiscales_id_seq'::regclass);


--
-- Name: condiciones_fiscales id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.condiciones_fiscales ALTER COLUMN id SET DEFAULT nextval('public.condiciones_fiscales_id_seq'::regclass);


--
-- Name: depositos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.depositos ALTER COLUMN id SET DEFAULT nextval('public.depositos_id_seq'::regclass);


--
-- Name: devoluciones id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.devoluciones ALTER COLUMN id SET DEFAULT nextval('public.devoluciones_id_seq'::regclass);


--
-- Name: distribuidores id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.distribuidores ALTER COLUMN id SET DEFAULT nextval('public.distribuidores_id_seq'::regclass);


--
-- Name: documentos_comerciales id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.documentos_comerciales ALTER COLUMN id SET DEFAULT nextval('public.documentos_comerciales_id_seq'::regclass);


--
-- Name: empresas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empresas ALTER COLUMN id SET DEFAULT nextval('public.empresas_id_seq'::regclass);


--
-- Name: historial_movimientos_stock id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.historial_movimientos_stock ALTER COLUMN id SET DEFAULT nextval('public.historial_movimientos_stock_id_seq'::regclass);


--
-- Name: ivas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ivas ALTER COLUMN id SET DEFAULT nextval('public.ivas_id_seq'::regclass);


--
-- Name: marcas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcas ALTER COLUMN id SET DEFAULT nextval('public.marcas_id_seq'::regclass);


--
-- Name: medios_pagos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.medios_pagos ALTER COLUMN id SET DEFAULT nextval('public.medios_pagos_id_seq'::regclass);


--
-- Name: mensajes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mensajes ALTER COLUMN id SET DEFAULT nextval('public.mensajes_id_seq'::regclass);


--
-- Name: modulos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modulos ALTER COLUMN id SET DEFAULT nextval('public.modulos_id_seq'::regclass);


--
-- Name: note id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.note ALTER COLUMN id SET DEFAULT nextval('public.note_id_seq'::regclass);


--
-- Name: perfiles id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfiles ALTER COLUMN id SET DEFAULT nextval('public.perfiles_id_seq'::regclass);


--
-- Name: planes_pagos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.planes_pagos ALTER COLUMN id SET DEFAULT nextval('public.planes_pagos_id_seq'::regclass);


--
-- Name: preguntas_frecuentes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.preguntas_frecuentes ALTER COLUMN id SET DEFAULT nextval('public.preguntas_frecuentes_id_seq'::regclass);


--
-- Name: productos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos ALTER COLUMN id SET DEFAULT nextval('public.productos_id_seq'::regclass);


--
-- Name: productos_variaciones id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_variaciones ALTER COLUMN id SET DEFAULT nextval('public.productos_variaciones_id_seq'::regclass);


--
-- Name: propiedades id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.propiedades ALTER COLUMN id SET DEFAULT nextval('public.propiedades_id_seq'::regclass);


--
-- Name: punto_ventas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.punto_ventas ALTER COLUMN id SET DEFAULT nextval('public.punto_ventas_id_seq'::regclass);


--
-- Name: rubros id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.rubros ALTER COLUMN id SET DEFAULT nextval('public.rubros_id_seq'::regclass);


--
-- Name: stocks id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stocks ALTER COLUMN id SET DEFAULT nextval('public.stocks_id_seq'::regclass);


--
-- Name: sucursales id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sucursales ALTER COLUMN id SET DEFAULT nextval('public.sucursales_id_seq'::regclass);


--
-- Name: transportistas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transportistas ALTER COLUMN id SET DEFAULT nextval('public.transportistas_id_seq'::regclass);


--
-- Name: usuarios id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios ALTER COLUMN id SET DEFAULT nextval('public.usuarios_id_seq'::regclass);


--
-- Name: vendedores id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendedores ALTER COLUMN id SET DEFAULT nextval('public.vendedores_id_seq'::regclass);


--
-- Data for Name: atributos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.atributos (id, valor, valor_numerico) FROM stdin;
2	1 plaza	0
1	1 1/2 plaza	0
\.


--
-- Data for Name: caja; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.caja (id, descripcion, diferencia, existencia_fisica, existencia_inicial, fecha, monto_facturado, salidas_no_contabilizadas, sucursal_id) FROM stdin;
\.


--
-- Data for Name: cliente_sucursal; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cliente_sucursal (id_cliente, id_sucursal) FROM stdin;
1	1
\.


--
-- Data for Name: clientes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.clientes (id, cuit, direccion, email, estado, nombre, nombre_contacto, pais, razon_social, region, telefono, telefono_alternativo, tipo_persona, condicion_iva_id, alic_ing_brutos) FROM stdin;
1	0000000000000000	\N	\N	\N	Consumidor Final	\N	\N	Consumidor Final	\N	\N	\N	1	3	0.00
\.


--
-- Data for Name: comprobantes_fiscales; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.comprobantes_fiscales (id, bar_code, cae, cerrado, condicion_venta, fecha_emision, fecha_vto, letra, nombre_documento, numero_cbte, productos, total_venta, cliente_id, documento_comercial_id, empresa_id, punto_venta_id, sucursal_id, ingresos_brutos, producto_description, productos_detalle) FROM stdin;
\.


--
-- Data for Name: comprobantes_medios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.comprobantes_medios (id_comprobante, id_medio) FROM stdin;
\.


--
-- Data for Name: comprobantes_planes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.comprobantes_planes (id_comprobante, id_plan) FROM stdin;
\.


--
-- Data for Name: condiciones_documentos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.condiciones_documentos (id_condicion, id_documento) FROM stdin;
1	1
1	2
1	3
1	4
1	5
1	6
1	7
1	8
1	13
1	14
1	16
1	17
1	18
1	21
1	22
1	24
1	25
1	27
1	28
1	29
2	9
2	10
2	11
2	12
2	15
2	16
2	19
2	20
2	23
2	26
2	27
2	28
2	29
3	5
3	6
3	7
3	8
3	9
3	10
3	11
3	12
3	14
3	15
3	18
3	19
3	20
3	22
3	23
3	25
3	26
3	27
3	28
3	29
\.


--
-- Data for Name: condiciones_fiscales; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.condiciones_fiscales (id, nombre) FROM stdin;
1	Responsable Inscrípto
2	Monotributista
3	Consumidor Final
\.


--
-- Data for Name: depositos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.depositos (id, default_deposit, direccion, nombre, telefono, sucursales_id) FROM stdin;
1	1	Habegger 865	Casa central	03482449449	1
2	\N	Iriondo 865	Sector iriondo	111111111	1
\.


--
-- Data for Name: devoluciones; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.devoluciones (id, descripcion, fecha, productos, productos_salientes, total_devolucion, comprobante_id, empresa_id, sucursal_id) FROM stdin;
\.


--
-- Data for Name: distribuidores; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.distribuidores (id, cuit, direccion, email, estado, nombre, nombre_contacto, pais, razon_social, region, telefono, telefono_alternativo, tipo_persona, condicion_iva_id) FROM stdin;
1	1234579821	\N	\N	\N	Claudia Adornos	\N	\N	Claudia Adornos	\N	\N	\N	1	1
\.


--
-- Data for Name: documentos_comerciales; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.documentos_comerciales (id, activo, codigo_documento, iva_cat, letra, nombre, tipo, ticket) FROM stdin;
1	t	001	1	A	FACTURAS A	t	f
2	t	002	1	A	NOTAS DE DEBITO A	t	f
3	t	003	1	A	NOTAS DE CREDITO A	t	f
4	t	004	1	A	RECIBOS A	t	f
5	t	006	2	B	FACTURAS B	t	f
6	t	007	2	B	NOTAS DE DEBITO B	t	f
7	t	008	2	B	NOTAS DE CREDITO B	t	f
8	t	009	2	B	RECIBOS B	t	f
9	t	011	3	C	FACTURAS C	t	f
10	t	012	3	C	NOTAS DE DEBITO C	t	f
11	t	013	3	C	NOTAS DE CREDITO C	t	f
12	t	015	3	C	RECIBOS C	t	f
13	t	063	1	A	LIQUIDACIONES A	t	f
14	t	064	2	B	LIQUIDACIONES B	t	f
15	t	068	3	C	LIQUIDACION C	t	f
16	t	080	4	Z	INFORME DIARIO DE CIERRE (ZETA) - CONTROLADORES FISCALES	t	f
17	t	081	1	A	TIQUE FACTURA A	t	f
18	t	082	2	B	TIQUE FACTURA B	t	f
19	t	091	4	R	REMITOS R	t	f
20	t	111	3	C	TIQUE FACTURA C	t	f
21	t	112	1	A	TIQUE NOTA DE CREDITO A	t	f
22	t	113	2	B	TIQUE NOTA DE CREDITO B	t	f
23	t	114	3	C	TIQUE NOTA DE CREDITO C	t	f
24	t	115	1	A	TIQUE NOTA DE DEBITO A	t	f
25	t	116	2	B	TIQUE NOTA DE DEBITO B	t	f
26	t	117	3	C	TIQUE NOTA DE DEBITO C	t	f
27	t	9999	4	X	Ticket X	f	f
28	t	998	4	NX	Nota de débito x	f	f
29	t	999	4	NX	Nota de crédito x	f	f
\.


--
-- Data for Name: empresas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.empresas (id, alias, cuit, fecha_inicio_act, ing_bruto, razon_social, condicion_iva_id) FROM stdin;
1	CASA NARANJA	33333333	2020-03-09 00:00:00	1418585	CASA NARANJA	1
\.


--
-- Data for Name: historial_movimientos_stock; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.historial_movimientos_stock (id, descripcion, fecha, stocks, usuario, sucursal_id) FROM stdin;
3	Migración de productos	08/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b78703ff00000000000007400164761746f73204465636f7261646f7320353020636d31740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e000378707400013174000c4861626567676572203836357372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000c436173612063656e7472616c707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e00037870542e57a074000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000002017400033030377371007e00100000000000000006740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e01000000010174000330303171007e00127400014174000a464143545552415320417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417871007e0012740016526573706f6e7361626c6520496e736372c3ad70746f74000833333232343435357074001a43616c6c652048616265676765722c206ec3ba6d65726f207878740015636173616e6172616e6a6140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b59741903000078707708000001703c7d27807871007e001274001843415341204e4152414e4a41205245434f4e515549535441740011c3816c7661726f2043656c657374696e6f74000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001274001a50554e544f2044452056454e5441205245434f4e515549535441707874001843415341204e4152414e4a41205245434f4e51554953544174000634343434343474000634343434343574000b303334383234343934343971007e00127372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870408bfc000000000040861b999999999a000000014034000000000000406781999999999a406c3570a3d70a3d40861b999999999a4090ca6666666666409451147ae147ae000000007371007e001c770c000000013f400000000000007874000d36383530303030303434363635740004343436367371007e001c770c000000013f40000000000000787371007e001c770c000000013f400000000000007871007e00127372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000171007e003f740007497661203231257371007e009d40350000000000000171007e003f740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e00127400084172616b4d6164757400154761746f73204465636f7261646f7320353020636d7371007e001c770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001274000a4465636f726163696f6e707371007e001c770c000000013f40000000000000787371007e0014542e57a074000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000331313571007e0030740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000331313371007e006b740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000004007400043939393971007e003a740001587400085469636b657420587371007e001e01000000010174000330303471007e003f7400014174000952454349424f5320417371007e001e01000000040174000330383071007e00487400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000040074000339393871007e00577400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000040074000339393971007e00757400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330303271007e004d740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000331313271007e007f740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330363371007e00527400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303871007e0061740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000330303171007e00127400014174000a464143545552415320417371007e001e01000000020174000330303971007e00217400014274000952454349424f5320427371007e001e01000000020174000331313671007e002b740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330383271007e007a7400014274000f5449515545204641435455524120427371007e001e01000000010174000330383171007e00667400014174000f5449515545204641435455524120417371007e001e01000000010174000330303371007e005c740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330363471007e00707400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303671007e00357400014274000a464143545552415320427371007e001e01000000020174000330303771007e0026740001427400114e4f5441532044452044454249544f20427871007e0012740016526573706f6e7361626c6520496e736372c3ad70746f74000833333232343435357074001a43616c6c652048616265676765722c206ec3ba6d65726f207878740015636173616e6172616e6a6140676d61696c2e636f6d707371007e00867708000001703c7d27807871007e001274001843415341204e4152414e4a41205245434f4e515549535441740011c3816c7661726f2043656c657374696e6f74000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e001274001a50554e544f2044452056454e5441205245434f4e515549535441707874001843415341204e4152414e4a41205245434f4e51554953544174000634343434343474000634343434343578	Admin	1
2	Migración de productos	08/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b78703ff00000000000007400164761746f73204465636f7261646f7320353020636d31740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e000378707074000b4972696f6e646f203836357372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000274000e536563746f72206972696f6e646f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e00037870542e57a074000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d0100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427371007e001d0100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427371007e001d0100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001d0100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d0100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417371007e001d0100000001017400033030317371007e000f00000000000000017400014174000a464143545552415320417371007e001d0100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000010174000330303271007e0011740001417400114e4f5441532044452044454249544f20417371007e001d0100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427871007e0066740016526573706f6e7361626c6520496e736372c3ad70746f74000833333232343435357074001a43616c6c652048616265676765722c206ec3ba6d65726f207878740015636173616e6172616e6a6140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b59741903000078707708000001703c7d27807871007e006674001843415341204e4152414e4a41205245434f4e515549535441740011c3816c7661726f2043656c657374696e6f74000853616e74612046657371007e001b770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e006674001a50554e544f2044452056454e5441205245434f4e515549535441707874001843415341204e4152414e4a41205245434f4e51554953544174000634343434343474000634343434343574000931313131313131313171007e00667372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00934c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870408bfc000000000040861b999999999a000000014034000000000000406781999999999a406c3570a3d70a3d40861b999999999a4090ca6666666666409451147ae147ae000000007371007e001b770c000000013f400000000000007874000d36383530303030303434363635740004343436367371007e001b770c000000013f40000000000000787371007e001b770c000000013f400000000000007871007e00667372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000171007e004d740007497661203231257371007e009c40350000000000000171007e004d740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e00667400084172616b4d6164757400154761746f73204465636f7261646f7320353020636d7371007e001b770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006674000a4465636f726163696f6e707371007e001b770c000000013f40000000000000787371007e0013542e57a074000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000010174000330303171007e00667400014174000a464143545552415320417371007e001d01000000010174000331313271007e0052740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330303271007e0011740001417400114e4f5441532044452044454249544f20417371007e001d01000000020174000331313671007e0074740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000040174000330383071007e00347400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000330383171007e00207400014174000f5449515545204641435455524120417371007e001d01000000010174000330363371007e002f7400014174000f4c49515549444143494f4e455320417371007e001d01000000020174000330383271007e00437400014274000f5449515545204641435455524120427371007e001d01000000020174000330303771007e007e740001427400114e4f5441532044452044454249544f20427371007e001d01000000010174000330303371007e0061740001417400124e4f544153204445204352454449544f20417371007e001d01000000040074000339393871007e00577400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000004007400043939393971007e002a740001587400085469636b657420587371007e001d01000000020174000330363471007e00487400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000330303471007e004d7400014174000952454349424f5320417371007e001d01000000010174000331313571007e0079740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000330303671007e00257400014274000a464143545552415320427371007e001d01000000020174000330303871007e0039740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000331313371007e006b740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000020174000330303971007e003e7400014274000952454349424f5320427371007e001d01000000040074000339393971007e005c7400024e587400124e6f7461206465206372c3a96469746f20787871007e0066740016526573706f6e7361626c6520496e736372c3ad70746f74000833333232343435357074001a43616c6c652048616265676765722c206ec3ba6d65726f207878740015636173616e6172616e6a6140676d61696c2e636f6d707371007e00857708000001703c7d27807871007e006674001843415341204e4152414e4a41205245434f4e515549535441740011c3816c7661726f2043656c657374696e6f74000853616e74612046657371007e001b770c000000023f400000000000017371007e008b0000000471007e006674001a50554e544f2044452056454e5441205245434f4e515549535441707874001843415341204e4152414e4a41205245434f4e51554953544174000634343434343474000634343434343578	Admin	1
1	Carga de stock	08/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b78703ff00000000000007400164761746f73204465636f7261646f7320353020636d31740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e000378707400013174000c4861626567676572203836357372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000c436173612063656e7472616c707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e00037870542e57a074000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033030377371007e00100000000000000006740001427400114e4f5441532044452044454249544f20427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e01000000010174000330303171007e00127400014174000a464143545552415320417371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787871007e0012740016526573706f6e7361626c6520496e736372c3ad70746f74000833333232343435357074001a43616c6c652048616265676765722c206ec3ba6d65726f207878740015636173616e6172616e6a6140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b59741903000078707708000001703c7d27807871007e001274001843415341204e4152414e4a41205245434f4e515549535441740011c3816c7661726f2043656c657374696e6f74000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001274001a50554e544f2044452056454e5441205245434f4e515549535441707874001843415341204e4152414e4a41205245434f4e51554953544174000634343434343474000634343434343574000b3033343832343439343439707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870408bfc000000000040861b999999999a000000014034000000000000406781999999999a406c3570a3d70a3d40861b999999999a4090ca6666666666409451147ae147ae000000007371007e001c770c000000013f400000000000007874000d36383530303030303434363635740004343436367371007e001c770c000000013f40000000000000787371007e001c770c000000013f400000000000007871007e00127372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000171007e0058740007497661203231257371007e009d40350000000000000171007e0058740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e00127400084172616b4d6164757400154761746f73204465636f7261646f7320353020636d7371007e001c770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001274000a4465636f726163696f6e707371007e001c770c000000013f40000000000000787371007e0014542e57a074000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330303971007e00717400014274000952454349424f5320427371007e001e01000000020174000330363471007e00307400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303671007e00267400014274000a464143545552415320427371007e001e01000000010174000331313271007e0035740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040074000339393871007e00447400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330363371007e002b7400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330303371007e007a740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330303871007e003a740001427400124e4f544153204445204352454449544f20427371007e001e01000000040074000339393971007e007f7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000331313571007e006c740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330383271007e005d7400014274000f5449515545204641435455524120427371007e001e01000000010174000330383171007e004e7400014174000f5449515545204641435455524120417371007e001e01000000020174000331313671007e0021740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330303771007e0053740001427400114e4f5441532044452044454249544f20427371007e001e0100000004007400043939393971007e003f740001587400085469636b657420587371007e001e01000000020174000331313371007e0062740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000040174000330383071007e00497400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330303271007e0067740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330303171007e00127400014174000a464143545552415320417371007e001e01000000010174000330303471007e00587400014174000952454349424f5320417871007e0012740016526573706f6e7361626c6520496e736372c3ad70746f74000833333232343435357074001a43616c6c652048616265676765722c206ec3ba6d65726f207878740015636173616e6172616e6a6140676d61696c2e636f6d707371007e00867708000001703c7d27807871007e001274001843415341204e4152414e4a41205245434f4e515549535441740011c3816c7661726f2043656c657374696e6f74000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e001274001a50554e544f2044452056454e5441205245434f4e515549535441707874001843415341204e4152414e4a41205245434f4e51554953544174000634343434343474000634343434343578	Admin	1
\.


--
-- Data for Name: ivas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.ivas (id, nombre, porcentaje, tipo) FROM stdin;
1	Iva 21%	21	f
2	Iva 10,5%	10.5	f
3	Iva 27%	27	f
4	Iva 21%	21	t
5	Iva 10,5%	10.5	t
6	Iva 27%	27	t
7	iva 0%	0	f
8	iva 0 %	0	t
\.


--
-- Data for Name: marcas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.marcas (id, nombre) FROM stdin;
1	ArakMadu
\.


--
-- Data for Name: medios_pagos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.medios_pagos (id, nombre, sucursal_id, suma_en_cierre_de_caja) FROM stdin;
1	Contado Efectivo	1	f
2	Tarjeta VISA	1	f
\.


--
-- Data for Name: medios_planes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.medios_planes (id_medio, id_plan) FROM stdin;
1	1
2	2
2	3
\.


--
-- Data for Name: mensajes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.mensajes (id, contact_phone_or_email, date, message, name_and_last_name) FROM stdin;
\.


--
-- Data for Name: modulos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.modulos (id, nombre) FROM stdin;
1	ventas
2	ventasForm
3	productos
4	marcas
5	rubros
6	depositos
7	documentos
8	mediosPago
9	planesPago
10	personas
11	clientes
12	vendedores
13	distribuidores
14	transportistas
15	relaciones
16	condicionesFiscales
17	usuarios
18	perfiles
19	configuraciones
20	empresas
21	sucursales
22	puntosVenta
23	stock
24	devoluciones
25	modulos
26	soporte
27	preguntasFrecuentes
28	manuales
29	mensajes
30	caja
31	atributos
32	propiedades
33	ivas
\.


--
-- Data for Name: note; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.note (id, details, end_event, name, start_event) FROM stdin;
\.


--
-- Data for Name: perfiles; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.perfiles (id, nombre) FROM stdin;
1	Super Admin
2	Admin
3	Franquiciado
4	Cajero
\.


--
-- Data for Name: perfiles_modulos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.perfiles_modulos (perfil_id, modulos_id) FROM stdin;
1	1
1	2
1	3
1	4
1	5
1	6
1	7
1	8
1	9
1	10
1	11
1	12
1	13
1	14
1	15
1	16
1	17
1	18
1	19
1	20
1	21
1	22
1	23
1	24
1	25
1	26
1	27
1	28
1	29
1	30
1	31
1	32
1	33
2	1
2	2
2	3
2	4
2	5
2	8
2	9
2	19
2	21
2	22
2	24
3	1
3	2
3	3
3	6
3	8
3	9
3	10
3	11
3	19
3	21
3	22
3	23
3	24
4	1
4	2
4	24
2	30
2	12
2	10
2	20
2	11
2	23
2	6
2	13
2	28
2	27
2	26
2	32
2	31
2	14
4	26
4	27
4	28
\.


--
-- Data for Name: planes_pagos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.planes_pagos (id, cuotas, nombre, porcentaje, sucursal_id) FROM stdin;
1	1	Efectivo	0	1
3	12	Plan 12 cuotas	15	1
2	6	Plan 6 cuotas	8	1
\.


--
-- Data for Name: preguntas_frecuentes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.preguntas_frecuentes (id, pregunta, respuesta) FROM stdin;
\.


--
-- Data for Name: productos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.productos (id, codigo_barra, codigo_producto, costo_bruto, costo_neto, estado, ganancia, iva_compra, iva_venta, nombre, precio_costo, precio_sin_iva, precio_total, propiedad, iva_compras_object_id, iva_ventas_object_id, marca_id, rubro_id, editable) FROM stdin;
1	6850000044665	4466	950	750.5	1	20	199.5	239.400000000000006	Gatos Decorados 50 cm	750.5	1140	1379.40000000000009	0	4	4	1	1	f
\.


--
-- Data for Name: productos_atributos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.productos_atributos (id_producto, id_atributo) FROM stdin;
\.


--
-- Data for Name: productos_depositos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.productos_depositos (id_producto, id_deposito) FROM stdin;
\.


--
-- Data for Name: productos_distribuidores; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.productos_distribuidores (id_producto, id_distribuidor) FROM stdin;
\.


--
-- Data for Name: productos_propiedades; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.productos_propiedades (id_producto, id_propiedad) FROM stdin;
\.


--
-- Data for Name: productos_variaciones; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.productos_variaciones (id, nombre, porcentaje, producto_id) FROM stdin;
\.


--
-- Data for Name: propiedades; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.propiedades (id, nombre) FROM stdin;
1	Tamaño
\.


--
-- Data for Name: propiedades_atributos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.propiedades_atributos (id_propiedad, id_atributo) FROM stdin;
1	1
1	2
\.


--
-- Data for Name: proveedor_sucursal; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.proveedor_sucursal (id_proveedor, id_sucursal) FROM stdin;
1	1
\.


--
-- Data for Name: punto_ventas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.punto_ventas (id, id_fiscal, nombre, sucursal_id, ip_local) FROM stdin;
1	4	PUNTO DE VENTA RECONQUISTA	1	\N
\.


--
-- Data for Name: rubros; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.rubros (id, nombre) FROM stdin;
1	Decoracion
\.


--
-- Data for Name: stocks; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.stocks (id, algorim, cantidad, cantidad_minima, deposito_id, producto_id, sucursal_id) FROM stdin;
1	68500000446651	1	1	1	1	1
\.


--
-- Data for Name: sucursales; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.sucursales (id, ciudad, cuit, direccion, email, fecha_inicio_act, ing_bruto, nombre, nombre_contacto, provincia, razon_social, telefono, telefono_alternativo, condicion_iva_id, empresa_id, variacion_ganancia) FROM stdin;
1	Reconquista	33224455	Calle Habegger, número xx	casanaranja@gmail.com	2020-02-13 00:00:00	1412323232	CASA NARANJA RECONQUISTA	Álvaro Celestino	Santa Fe	CASA NARANJA RECONQUISTA	444444	444445	1	1	0.00
\.


--
-- Data for Name: transportista_sucursal; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.transportista_sucursal (id_transportista, id_sucursal) FROM stdin;
\.


--
-- Data for Name: transportistas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.transportistas (id, cuit, direccion, email, estado, nombre, nombre_contacto, pais, razon_social, region, telefono, telefono_alternativo, tipo_persona, condicion_iva_id) FROM stdin;
\.


--
-- Data for Name: usuarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.usuarios (id, nombre, password, username, empresa_id, perfil_id, punto_venta_id, sucursal_id) FROM stdin;
1	Super Admin	$2y$12$XV5dAvr8X92rQVbzViWyB.TQv/fGebULe.M/MEXEbzIE/3ZCIejLK	prysoft	\N	1	\N	\N
4	Cajero	$2y$12$MQfxsOL1Ub4iJMCUNyZx1u2gabW6X1a7mEJzR4bCGpOMh2ou.bylu	cajero	1	4	1	1
2	Admin	$2a$10$cySGPr.gzIQkJlnSd1IVmeORHbZmxaiOpirlJNWRicV/cq9D4MRFe	admin	1	2	1	1
\.


--
-- Data for Name: vendedor_sucursal; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.vendedor_sucursal (id_vendedor, id_sucursal) FROM stdin;
\.


--
-- Data for Name: vendedores; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.vendedores (id, cuit, direccion, email, estado, nombre, nombre_contacto, pais, razon_social, region, telefono, telefono_alternativo, tipo_persona, condicion_iva_id) FROM stdin;
\.


--
-- Name: atributos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.atributos_id_seq', 2, true);


--
-- Name: caja_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.caja_id_seq', 1, false);


--
-- Name: clientes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.clientes_id_seq', 1, true);


--
-- Name: comprobantes_fiscales_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.comprobantes_fiscales_id_seq', 1, false);


--
-- Name: condiciones_fiscales_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.condiciones_fiscales_id_seq', 1, false);


--
-- Name: depositos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.depositos_id_seq', 2, true);


--
-- Name: devoluciones_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.devoluciones_id_seq', 1, false);


--
-- Name: distribuidores_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.distribuidores_id_seq', 1, true);


--
-- Name: documentos_comerciales_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.documentos_comerciales_id_seq', 1, false);


--
-- Name: empresas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.empresas_id_seq', 1, true);


--
-- Name: historial_movimientos_stock_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.historial_movimientos_stock_id_seq', 3, true);


--
-- Name: ivas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.ivas_id_seq', 8, true);


--
-- Name: marcas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.marcas_id_seq', 1, true);


--
-- Name: medios_pagos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.medios_pagos_id_seq', 2, true);


--
-- Name: mensajes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.mensajes_id_seq', 1, false);


--
-- Name: modulos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.modulos_id_seq', 1, false);


--
-- Name: note_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.note_id_seq', 1, false);


--
-- Name: perfiles_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.perfiles_id_seq', 1, false);


--
-- Name: planes_pagos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.planes_pagos_id_seq', 3, true);


--
-- Name: preguntas_frecuentes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.preguntas_frecuentes_id_seq', 1, false);


--
-- Name: productos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.productos_id_seq', 1, true);


--
-- Name: productos_variaciones_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.productos_variaciones_id_seq', 1, false);


--
-- Name: propiedades_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.propiedades_id_seq', 1, true);


--
-- Name: punto_ventas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.punto_ventas_id_seq', 1, true);


--
-- Name: rubros_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.rubros_id_seq', 1, true);


--
-- Name: stocks_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.stocks_id_seq', 1, true);


--
-- Name: sucursales_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.sucursales_id_seq', 1, true);


--
-- Name: transportistas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.transportistas_id_seq', 1, false);


--
-- Name: usuarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuarios_id_seq', 1, false);


--
-- Name: vendedores_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.vendedores_id_seq', 1, false);


--
-- Name: atributos atributos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.atributos
    ADD CONSTRAINT atributos_pkey PRIMARY KEY (id);


--
-- Name: caja caja_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.caja
    ADD CONSTRAINT caja_pkey PRIMARY KEY (id);


--
-- Name: cliente_sucursal cliente_sucursal_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente_sucursal
    ADD CONSTRAINT cliente_sucursal_pkey PRIMARY KEY (id_cliente, id_sucursal);


--
-- Name: clientes clientes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_pkey PRIMARY KEY (id);


--
-- Name: comprobantes_fiscales comprobantes_fiscales_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_fiscales
    ADD CONSTRAINT comprobantes_fiscales_pkey PRIMARY KEY (id);


--
-- Name: comprobantes_medios comprobantes_medios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_medios
    ADD CONSTRAINT comprobantes_medios_pkey PRIMARY KEY (id_comprobante, id_medio);


--
-- Name: comprobantes_planes comprobantes_planes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_planes
    ADD CONSTRAINT comprobantes_planes_pkey PRIMARY KEY (id_comprobante, id_plan);


--
-- Name: condiciones_documentos condiciones_documentos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.condiciones_documentos
    ADD CONSTRAINT condiciones_documentos_pkey PRIMARY KEY (id_condicion, id_documento);


--
-- Name: condiciones_fiscales condiciones_fiscales_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.condiciones_fiscales
    ADD CONSTRAINT condiciones_fiscales_pkey PRIMARY KEY (id);


--
-- Name: depositos depositos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.depositos
    ADD CONSTRAINT depositos_pkey PRIMARY KEY (id);


--
-- Name: devoluciones devoluciones_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.devoluciones
    ADD CONSTRAINT devoluciones_pkey PRIMARY KEY (id);


--
-- Name: distribuidores distribuidores_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.distribuidores
    ADD CONSTRAINT distribuidores_pkey PRIMARY KEY (id);


--
-- Name: documentos_comerciales documentos_comerciales_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.documentos_comerciales
    ADD CONSTRAINT documentos_comerciales_pkey PRIMARY KEY (id);


--
-- Name: empresas empresas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empresas
    ADD CONSTRAINT empresas_pkey PRIMARY KEY (id);


--
-- Name: historial_movimientos_stock historial_movimientos_stock_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.historial_movimientos_stock
    ADD CONSTRAINT historial_movimientos_stock_pkey PRIMARY KEY (id);


--
-- Name: ivas ivas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ivas
    ADD CONSTRAINT ivas_pkey PRIMARY KEY (id);


--
-- Name: marcas marcas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcas
    ADD CONSTRAINT marcas_pkey PRIMARY KEY (id);


--
-- Name: medios_pagos medios_pagos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.medios_pagos
    ADD CONSTRAINT medios_pagos_pkey PRIMARY KEY (id);


--
-- Name: medios_planes medios_planes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.medios_planes
    ADD CONSTRAINT medios_planes_pkey PRIMARY KEY (id_medio, id_plan);


--
-- Name: mensajes mensajes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mensajes
    ADD CONSTRAINT mensajes_pkey PRIMARY KEY (id);


--
-- Name: modulos modulos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modulos
    ADD CONSTRAINT modulos_pkey PRIMARY KEY (id);


--
-- Name: note note_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.note
    ADD CONSTRAINT note_pkey PRIMARY KEY (id);


--
-- Name: perfiles_modulos perfiles_modulos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfiles_modulos
    ADD CONSTRAINT perfiles_modulos_pkey PRIMARY KEY (perfil_id, modulos_id);


--
-- Name: perfiles perfiles_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfiles
    ADD CONSTRAINT perfiles_pkey PRIMARY KEY (id);


--
-- Name: planes_pagos planes_pagos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.planes_pagos
    ADD CONSTRAINT planes_pagos_pkey PRIMARY KEY (id);


--
-- Name: preguntas_frecuentes preguntas_frecuentes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.preguntas_frecuentes
    ADD CONSTRAINT preguntas_frecuentes_pkey PRIMARY KEY (id);


--
-- Name: productos_atributos productos_atributos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_atributos
    ADD CONSTRAINT productos_atributos_pkey PRIMARY KEY (id_producto, id_atributo);


--
-- Name: productos_depositos productos_depositos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_depositos
    ADD CONSTRAINT productos_depositos_pkey PRIMARY KEY (id_producto, id_deposito);


--
-- Name: productos_distribuidores productos_distribuidores_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_distribuidores
    ADD CONSTRAINT productos_distribuidores_pkey PRIMARY KEY (id_producto, id_distribuidor);


--
-- Name: productos productos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos
    ADD CONSTRAINT productos_pkey PRIMARY KEY (id);


--
-- Name: productos_propiedades productos_propiedades_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_propiedades
    ADD CONSTRAINT productos_propiedades_pkey PRIMARY KEY (id_producto, id_propiedad);


--
-- Name: productos_variaciones productos_variaciones_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_variaciones
    ADD CONSTRAINT productos_variaciones_pkey PRIMARY KEY (id);


--
-- Name: propiedades_atributos propiedades_atributos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.propiedades_atributos
    ADD CONSTRAINT propiedades_atributos_pkey PRIMARY KEY (id_propiedad, id_atributo);


--
-- Name: propiedades propiedades_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.propiedades
    ADD CONSTRAINT propiedades_pkey PRIMARY KEY (id);


--
-- Name: proveedor_sucursal proveedor_sucursal_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proveedor_sucursal
    ADD CONSTRAINT proveedor_sucursal_pkey PRIMARY KEY (id_proveedor, id_sucursal);


--
-- Name: punto_ventas punto_ventas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.punto_ventas
    ADD CONSTRAINT punto_ventas_pkey PRIMARY KEY (id);


--
-- Name: rubros rubros_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.rubros
    ADD CONSTRAINT rubros_pkey PRIMARY KEY (id);


--
-- Name: stocks stocks_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stocks
    ADD CONSTRAINT stocks_pkey PRIMARY KEY (id);


--
-- Name: sucursales sucursales_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sucursales
    ADD CONSTRAINT sucursales_pkey PRIMARY KEY (id);


--
-- Name: transportista_sucursal transportista_sucursal_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transportista_sucursal
    ADD CONSTRAINT transportista_sucursal_pkey PRIMARY KEY (id_transportista, id_sucursal);


--
-- Name: transportistas transportistas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transportistas
    ADD CONSTRAINT transportistas_pkey PRIMARY KEY (id);


--
-- Name: productos uk_32na5w2p6aidantnxlv5ray68; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos
    ADD CONSTRAINT uk_32na5w2p6aidantnxlv5ray68 UNIQUE (codigo_barra);


--
-- Name: productos_variaciones uk_56t6njn6p2f9cctshogrje44; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_variaciones
    ADD CONSTRAINT uk_56t6njn6p2f9cctshogrje44 UNIQUE (nombre);


--
-- Name: depositos uk_7uf5n6b6lan3um4l24gvh7qx4; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.depositos
    ADD CONSTRAINT uk_7uf5n6b6lan3um4l24gvh7qx4 UNIQUE (direccion);


--
-- Name: sucursales uk_8bv0gcsxqwmc5r68oriq9l759; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sucursales
    ADD CONSTRAINT uk_8bv0gcsxqwmc5r68oriq9l759 UNIQUE (nombre);


--
-- Name: depositos uk_afgj8c41w7231mrdm94keh38n; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.depositos
    ADD CONSTRAINT uk_afgj8c41w7231mrdm94keh38n UNIQUE (nombre);


--
-- Name: sucursales uk_dcad22sngrjk2ukw58htijnb0; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sucursales
    ADD CONSTRAINT uk_dcad22sngrjk2ukw58htijnb0 UNIQUE (direccion);


--
-- Name: empresas uk_di4dnbgcpjfnme3q7dav85ani; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empresas
    ADD CONSTRAINT uk_di4dnbgcpjfnme3q7dav85ani UNIQUE (ing_bruto);


--
-- Name: marcas uk_f9j5vnky0egidx9qqqa4gbf85; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcas
    ADD CONSTRAINT uk_f9j5vnky0egidx9qqqa4gbf85 UNIQUE (nombre);


--
-- Name: condiciones_fiscales uk_hncxclcvt3ko1ye39ivfhj3su; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.condiciones_fiscales
    ADD CONSTRAINT uk_hncxclcvt3ko1ye39ivfhj3su UNIQUE (nombre);


--
-- Name: usuarios uk_io49vjba68pmbgpy9vtw8vm81; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT uk_io49vjba68pmbgpy9vtw8vm81 UNIQUE (nombre);


--
-- Name: rubros uk_laj7lr5ake0hann40gju15i9v; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.rubros
    ADD CONSTRAINT uk_laj7lr5ake0hann40gju15i9v UNIQUE (nombre);


--
-- Name: empresas uk_n7eoj3klpbnacndhifwyhxpso; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empresas
    ADD CONSTRAINT uk_n7eoj3klpbnacndhifwyhxpso UNIQUE (cuit);


--
-- Name: documentos_comerciales uk_puyba4qpujs4ykqrvo6ly8b85; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.documentos_comerciales
    ADD CONSTRAINT uk_puyba4qpujs4ykqrvo6ly8b85 UNIQUE (codigo_documento);


--
-- Name: medios_pagos uk_qdfboldq62pnelkdgq89ik0df; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.medios_pagos
    ADD CONSTRAINT uk_qdfboldq62pnelkdgq89ik0df UNIQUE (nombre);


--
-- Name: empresas uk_qpbwdn6icj2ktae57joulkfpm; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empresas
    ADD CONSTRAINT uk_qpbwdn6icj2ktae57joulkfpm UNIQUE (razon_social);


--
-- Name: documentos_comerciales uk_rvkypp2tds5so85h02y4rvphy; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.documentos_comerciales
    ADD CONSTRAINT uk_rvkypp2tds5so85h02y4rvphy UNIQUE (nombre);


--
-- Name: perfiles uk_s6vi850lietn5du2jxehielom; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfiles
    ADD CONSTRAINT uk_s6vi850lietn5du2jxehielom UNIQUE (nombre);


--
-- Name: modulos uk_t5wsps1raxojltdfevtcpwr2v; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modulos
    ADD CONSTRAINT uk_t5wsps1raxojltdfevtcpwr2v UNIQUE (nombre);


--
-- Name: usuarios usuarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id);


--
-- Name: vendedor_sucursal vendedor_sucursal_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendedor_sucursal
    ADD CONSTRAINT vendedor_sucursal_pkey PRIMARY KEY (id_vendedor, id_sucursal);


--
-- Name: vendedores vendedores_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendedores
    ADD CONSTRAINT vendedores_pkey PRIMARY KEY (id);


--
-- Name: sucursales fk1lvdc7c03abpsud6rvdp53ugf; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sucursales
    ADD CONSTRAINT fk1lvdc7c03abpsud6rvdp53ugf FOREIGN KEY (condicion_iva_id) REFERENCES public.condiciones_fiscales(id);


--
-- Name: comprobantes_fiscales fk1rlcfwo6cohgeeey0sy95crvk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_fiscales
    ADD CONSTRAINT fk1rlcfwo6cohgeeey0sy95crvk FOREIGN KEY (sucursal_id) REFERENCES public.sucursales(id);


--
-- Name: productos fk2k6lj04qqala7kgd526xduxgn; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos
    ADD CONSTRAINT fk2k6lj04qqala7kgd526xduxgn FOREIGN KEY (marca_id) REFERENCES public.marcas(id);


--
-- Name: productos fk3aqf224x9cq30xqp4ua3fjufc; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos
    ADD CONSTRAINT fk3aqf224x9cq30xqp4ua3fjufc FOREIGN KEY (rubro_id) REFERENCES public.rubros(id);


--
-- Name: medios_planes fk3e69hp8a8x1m0ke5ixi3jxfgh; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.medios_planes
    ADD CONSTRAINT fk3e69hp8a8x1m0ke5ixi3jxfgh FOREIGN KEY (id_medio) REFERENCES public.medios_pagos(id);


--
-- Name: clientes fk5o2dut52p8apcfbyiiw06m0et; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT fk5o2dut52p8apcfbyiiw06m0et FOREIGN KEY (condicion_iva_id) REFERENCES public.condiciones_fiscales(id);


--
-- Name: vendedor_sucursal fk64ih5et959cccm9o8ux5q442r; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendedor_sucursal
    ADD CONSTRAINT fk64ih5et959cccm9o8ux5q442r FOREIGN KEY (id_vendedor) REFERENCES public.vendedores(id);


--
-- Name: productos_depositos fk65luf00xfmjil536l19hgxflf; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_depositos
    ADD CONSTRAINT fk65luf00xfmjil536l19hgxflf FOREIGN KEY (id_producto) REFERENCES public.productos(id);


--
-- Name: proveedor_sucursal fk7qetk1i2krfr99y1kfldn9g1j; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proveedor_sucursal
    ADD CONSTRAINT fk7qetk1i2krfr99y1kfldn9g1j FOREIGN KEY (id_sucursal) REFERENCES public.sucursales(id);


--
-- Name: stocks fk7r3b5c5smrb881rs5tv20oba; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stocks
    ADD CONSTRAINT fk7r3b5c5smrb881rs5tv20oba FOREIGN KEY (producto_id) REFERENCES public.productos(id);


--
-- Name: comprobantes_planes fk8e9dos65j9ywgjt1427tuclhu; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_planes
    ADD CONSTRAINT fk8e9dos65j9ywgjt1427tuclhu FOREIGN KEY (id_comprobante) REFERENCES public.comprobantes_fiscales(id);


--
-- Name: productos_propiedades fk8wu8chepejwfs3t8i5pb8n38o; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_propiedades
    ADD CONSTRAINT fk8wu8chepejwfs3t8i5pb8n38o FOREIGN KEY (id_producto) REFERENCES public.productos(id);


--
-- Name: medios_planes fk91by3unkswncgshcryyruyi6s; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.medios_planes
    ADD CONSTRAINT fk91by3unkswncgshcryyruyi6s FOREIGN KEY (id_plan) REFERENCES public.planes_pagos(id);


--
-- Name: productos_propiedades fk928mtdmogr5u47k1lnfkfeb60; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_propiedades
    ADD CONSTRAINT fk928mtdmogr5u47k1lnfkfeb60 FOREIGN KEY (id_propiedad) REFERENCES public.propiedades(id);


--
-- Name: productos fk94garc1kvytwippfdrmrtghj4; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos
    ADD CONSTRAINT fk94garc1kvytwippfdrmrtghj4 FOREIGN KEY (iva_compras_object_id) REFERENCES public.ivas(id);


--
-- Name: medios_pagos fk98ia4mhw41m8eqjt0egvk2lmk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.medios_pagos
    ADD CONSTRAINT fk98ia4mhw41m8eqjt0egvk2lmk FOREIGN KEY (sucursal_id) REFERENCES public.sucursales(id);


--
-- Name: usuarios fk9v93lqnass5yqhhsyprr9fdv2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT fk9v93lqnass5yqhhsyprr9fdv2 FOREIGN KEY (empresa_id) REFERENCES public.empresas(id);


--
-- Name: perfiles_modulos fkapxhbk8n0v98kwstln90x0ml4; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfiles_modulos
    ADD CONSTRAINT fkapxhbk8n0v98kwstln90x0ml4 FOREIGN KEY (perfil_id) REFERENCES public.perfiles(id);


--
-- Name: comprobantes_medios fkc0352mr8fommrbgqsyk3u93pu; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_medios
    ADD CONSTRAINT fkc0352mr8fommrbgqsyk3u93pu FOREIGN KEY (id_comprobante) REFERENCES public.comprobantes_fiscales(id);


--
-- Name: historial_movimientos_stock fkd12xavpdyp6jub9xxbqm1iag0; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.historial_movimientos_stock
    ADD CONSTRAINT fkd12xavpdyp6jub9xxbqm1iag0 FOREIGN KEY (sucursal_id) REFERENCES public.sucursales(id);


--
-- Name: productos fkd9782nibrvjqpjp9lwkqg8gov; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos
    ADD CONSTRAINT fkd9782nibrvjqpjp9lwkqg8gov FOREIGN KEY (iva_ventas_object_id) REFERENCES public.ivas(id);


--
-- Name: cliente_sucursal fkdfcdjyqieorth42h6t31pgp5j; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente_sucursal
    ADD CONSTRAINT fkdfcdjyqieorth42h6t31pgp5j FOREIGN KEY (id_cliente) REFERENCES public.clientes(id);


--
-- Name: vendedores fkdnxmsmowfqbkhn1er4ofglxau; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendedores
    ADD CONSTRAINT fkdnxmsmowfqbkhn1er4ofglxau FOREIGN KEY (condicion_iva_id) REFERENCES public.condiciones_fiscales(id);


--
-- Name: comprobantes_medios fkdru68vsbujwyfbp5iso5njeh3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_medios
    ADD CONSTRAINT fkdru68vsbujwyfbp5iso5njeh3 FOREIGN KEY (id_medio) REFERENCES public.medios_pagos(id);


--
-- Name: propiedades_atributos fke358rg4aqb1s1md41kg6wcxwr; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.propiedades_atributos
    ADD CONSTRAINT fke358rg4aqb1s1md41kg6wcxwr FOREIGN KEY (id_atributo) REFERENCES public.atributos(id);


--
-- Name: depositos fkfs9x6wuf60j4a69wpxikh7qf2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.depositos
    ADD CONSTRAINT fkfs9x6wuf60j4a69wpxikh7qf2 FOREIGN KEY (sucursales_id) REFERENCES public.sucursales(id);


--
-- Name: transportista_sucursal fkfya7yilrwe9cyry9x6119rakd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transportista_sucursal
    ADD CONSTRAINT fkfya7yilrwe9cyry9x6119rakd FOREIGN KEY (id_sucursal) REFERENCES public.sucursales(id);


--
-- Name: condiciones_documentos fkgcedd1w4nthttnsgxnb4qsuhf; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.condiciones_documentos
    ADD CONSTRAINT fkgcedd1w4nthttnsgxnb4qsuhf FOREIGN KEY (id_condicion) REFERENCES public.condiciones_fiscales(id);


--
-- Name: stocks fkgq0gxk7shiyg72ejw8u2xli8m; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stocks
    ADD CONSTRAINT fkgq0gxk7shiyg72ejw8u2xli8m FOREIGN KEY (deposito_id) REFERENCES public.depositos(id);


--
-- Name: punto_ventas fkgw45m6v5cl0gulh2r9symxruv; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.punto_ventas
    ADD CONSTRAINT fkgw45m6v5cl0gulh2r9symxruv FOREIGN KEY (sucursal_id) REFERENCES public.sucursales(id);


--
-- Name: productos_atributos fkh51okwn44ua8blfkh6lkyms8b; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_atributos
    ADD CONSTRAINT fkh51okwn44ua8blfkh6lkyms8b FOREIGN KEY (id_producto) REFERENCES public.productos(id);


--
-- Name: vendedor_sucursal fkhgdc53ov4rld49cfengqc75by; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendedor_sucursal
    ADD CONSTRAINT fkhgdc53ov4rld49cfengqc75by FOREIGN KEY (id_sucursal) REFERENCES public.sucursales(id);


--
-- Name: devoluciones fki0xh6v2vhpcvdhvn2p63nwc5y; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.devoluciones
    ADD CONSTRAINT fki0xh6v2vhpcvdhvn2p63nwc5y FOREIGN KEY (empresa_id) REFERENCES public.empresas(id);


--
-- Name: productos_distribuidores fki3k7xogki15rk437s1k8l95pt; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_distribuidores
    ADD CONSTRAINT fki3k7xogki15rk437s1k8l95pt FOREIGN KEY (id_producto) REFERENCES public.productos(id);


--
-- Name: comprobantes_fiscales fki4sfd4bwsqj10etgmf39mvi90; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_fiscales
    ADD CONSTRAINT fki4sfd4bwsqj10etgmf39mvi90 FOREIGN KEY (cliente_id) REFERENCES public.clientes(id);


--
-- Name: planes_pagos fkijdqy7mp6n4axoyp28sec2tq6; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.planes_pagos
    ADD CONSTRAINT fkijdqy7mp6n4axoyp28sec2tq6 FOREIGN KEY (sucursal_id) REFERENCES public.sucursales(id);


--
-- Name: stocks fkjj5v1cuoay7aeaq1diol9pmri; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.stocks
    ADD CONSTRAINT fkjj5v1cuoay7aeaq1diol9pmri FOREIGN KEY (sucursal_id) REFERENCES public.sucursales(id);


--
-- Name: proveedor_sucursal fkl6lfcao131gjttcfgovmaxkcs; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proveedor_sucursal
    ADD CONSTRAINT fkl6lfcao131gjttcfgovmaxkcs FOREIGN KEY (id_proveedor) REFERENCES public.distribuidores(id);


--
-- Name: transportista_sucursal fkl80miueqg9hlqe59cnigyadh6; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transportista_sucursal
    ADD CONSTRAINT fkl80miueqg9hlqe59cnigyadh6 FOREIGN KEY (id_transportista) REFERENCES public.transportistas(id);


--
-- Name: empresas fkltr0q6uk2wt3yl3lsdlg5doi; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empresas
    ADD CONSTRAINT fkltr0q6uk2wt3yl3lsdlg5doi FOREIGN KEY (condicion_iva_id) REFERENCES public.condiciones_fiscales(id);


--
-- Name: propiedades_atributos fkm2onrr5rqhbgeum9jvcb4rgd1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.propiedades_atributos
    ADD CONSTRAINT fkm2onrr5rqhbgeum9jvcb4rgd1 FOREIGN KEY (id_propiedad) REFERENCES public.propiedades(id);


--
-- Name: comprobantes_fiscales fko8e03oqfxq7cry85wh4fy3ys7; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_fiscales
    ADD CONSTRAINT fko8e03oqfxq7cry85wh4fy3ys7 FOREIGN KEY (empresa_id) REFERENCES public.empresas(id);


--
-- Name: perfiles_modulos fkohcif2727uebw2aw3bkpt7dfx; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfiles_modulos
    ADD CONSTRAINT fkohcif2727uebw2aw3bkpt7dfx FOREIGN KEY (modulos_id) REFERENCES public.modulos(id);


--
-- Name: distribuidores fkoyshca5d84csmdyfshlohxk1w; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.distribuidores
    ADD CONSTRAINT fkoyshca5d84csmdyfshlohxk1w FOREIGN KEY (condicion_iva_id) REFERENCES public.condiciones_fiscales(id);


--
-- Name: condiciones_documentos fkp27oepm8a9lrkywww4929n6kl; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.condiciones_documentos
    ADD CONSTRAINT fkp27oepm8a9lrkywww4929n6kl FOREIGN KEY (id_documento) REFERENCES public.documentos_comerciales(id);


--
-- Name: comprobantes_fiscales fkp2ggoma5bgad6de9ai2r55o83; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_fiscales
    ADD CONSTRAINT fkp2ggoma5bgad6de9ai2r55o83 FOREIGN KEY (punto_venta_id) REFERENCES public.punto_ventas(id);


--
-- Name: devoluciones fkpj47svwj4u22onyy9gw4v2rj5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.devoluciones
    ADD CONSTRAINT fkpj47svwj4u22onyy9gw4v2rj5 FOREIGN KEY (sucursal_id) REFERENCES public.sucursales(id);


--
-- Name: comprobantes_fiscales fkpvs5qbbi3v3yefge5v6y8egyx; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_fiscales
    ADD CONSTRAINT fkpvs5qbbi3v3yefge5v6y8egyx FOREIGN KEY (documento_comercial_id) REFERENCES public.documentos_comerciales(id);


--
-- Name: usuarios fkq3a59nsli56gq634i3235693d; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT fkq3a59nsli56gq634i3235693d FOREIGN KEY (perfil_id) REFERENCES public.perfiles(id);


--
-- Name: transportistas fkqtpl9kpf4uwno6gbhfcmnnesm; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transportistas
    ADD CONSTRAINT fkqtpl9kpf4uwno6gbhfcmnnesm FOREIGN KEY (condicion_iva_id) REFERENCES public.condiciones_fiscales(id);


--
-- Name: productos_depositos fkr7vybfi9up6lug3gu3708lqv5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_depositos
    ADD CONSTRAINT fkr7vybfi9up6lug3gu3708lqv5 FOREIGN KEY (id_deposito) REFERENCES public.depositos(id);


--
-- Name: productos_variaciones fkrjr0lb1alyv0vjnvu86med1gy; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_variaciones
    ADD CONSTRAINT fkrjr0lb1alyv0vjnvu86med1gy FOREIGN KEY (producto_id) REFERENCES public.productos(id);


--
-- Name: usuarios fkrod71kje33p5jysx10u0t9elc; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT fkrod71kje33p5jysx10u0t9elc FOREIGN KEY (sucursal_id) REFERENCES public.sucursales(id);


--
-- Name: cliente_sucursal fks3w72jtf40py4h47l11qwgiw9; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente_sucursal
    ADD CONSTRAINT fks3w72jtf40py4h47l11qwgiw9 FOREIGN KEY (id_sucursal) REFERENCES public.sucursales(id);


--
-- Name: productos_atributos fksbfdnpsut7srurdh5sfbc92gx; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_atributos
    ADD CONSTRAINT fksbfdnpsut7srurdh5sfbc92gx FOREIGN KEY (id_atributo) REFERENCES public.atributos(id);


--
-- Name: comprobantes_planes fksmf2yfwmbbefn254fbrosf95w; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comprobantes_planes
    ADD CONSTRAINT fksmf2yfwmbbefn254fbrosf95w FOREIGN KEY (id_plan) REFERENCES public.planes_pagos(id);


--
-- Name: devoluciones fksxnw8hhqub1v30pvm4o47fjek; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.devoluciones
    ADD CONSTRAINT fksxnw8hhqub1v30pvm4o47fjek FOREIGN KEY (comprobante_id) REFERENCES public.comprobantes_fiscales(id);


--
-- Name: productos_distribuidores fkt1i00y5eqb6q353ojngys0boo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos_distribuidores
    ADD CONSTRAINT fkt1i00y5eqb6q353ojngys0boo FOREIGN KEY (id_distribuidor) REFERENCES public.distribuidores(id);


--
-- Name: caja fkt8g2qfvby42797nmtup5fe92s; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.caja
    ADD CONSTRAINT fkt8g2qfvby42797nmtup5fe92s FOREIGN KEY (sucursal_id) REFERENCES public.sucursales(id);


--
-- Name: usuarios fkte2xpywmiwnrba1shdyqai9pw; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT fkte2xpywmiwnrba1shdyqai9pw FOREIGN KEY (punto_venta_id) REFERENCES public.punto_ventas(id);


--
-- Name: sucursales fkton5w97opm4m88m7ifvl1mc11; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sucursales
    ADD CONSTRAINT fkton5w97opm4m88m7ifvl1mc11 FOREIGN KEY (empresa_id) REFERENCES public.empresas(id);


--
-- PostgreSQL database dump complete
--

