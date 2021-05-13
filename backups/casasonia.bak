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
2	S	0
11	\N	38
12	\N	40
16	\N	42
17	\N	44
18	\N	48
20	\N	54
21	\N	56
22	\N	58
23	\N	60
24	\N	62
25	\N	64
26	\N	66
27	\N	68
28	\N	70
29	NEGRO	0
30	BLANCO	0
31	AMARILLO	0
32	GRIS	0
33	VERDE	0
34	ROSA	0
37	MOSTAZA	0
38	EXTRA SLIM	0
39	SLIM	0
40	RECTO	0
41	CELESTE	0
43	CHINO	0
44	AZUL OSCURO	0
42	MARRÓN	0
45	\N	46
46	40	0
47	S/38/1	0
48	M/40/2	0
49	L/42/3	0
50	XL/44/4	0
51	XXL/46/5	0
52	3XL/48/6	0
53	4XL/50/7	0
54	5XL/52/8	0
6	ROJO	0
5	AZUL 	0
35	BORDEAUX	0
55	CUELLO V	0
56	CUELLO O	0
57	M. LARGAS	0
58	M. CORTAS	0
36	BEIGE	0
59	TURQUESA	0
60	FLOREADO	0
61	ESTAMPA	0
62	LISO	0
63	RAYADO	0
64	CARGO	0
66	6XL/54/9	0
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
\.


--
-- Data for Name: clientes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.clientes (id, cuit, direccion, email, estado, nombre, nombre_contacto, pais, razon_social, region, telefono, telefono_alternativo, tipo_persona, condicion_iva_id, alic_ing_brutos) FROM stdin;
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
1	\N	Hipolito Irigoyen 436	Ruta Deposito	421445	1
6	1	HipolitoIrigoyen 436	Ruta Exibicion	421445	1
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
1	CASA SONIA	33333333	2020-09-24 00:00:00	14133445	CASA SONIA	1
\.


--
-- Data for Name: historial_movimientos_stock; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.historial_movimientos_stock (id, descripcion, fecha, stocks, usuario, sucursal_id) FROM stdin;
11	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b78703ff00000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427871007e0021740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e002174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e002174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e00100000000000000028740005524543544f7371007e0099404500000000000071007e0066707371007e0099000000000000000071007e0048740004417a756c7874000c30313432383731322e3033327400044a4134327371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e001000000000000000517372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0021740007497661203231257371007e00a540350000000000000171007e0075740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002174000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000037371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e0099000000000000000071007e009b740005524543544f7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7871007e005774000543414c43457371007e00af7371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0048740004417a756c7371007e0099000000000000000071007e0012740004526f6a6f7871007e003e740005434f4c4f527371007e00af7371007e001c770c000000103f400000000000047371007e0099000000000000000071007e0048740004417a756c7371007e0099000000000000000071007e003e740001537371007e0099000000000000000071007e00577400014c7371007e0099000000000000000071007e0075740002584c7871007e002174000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003e74000850616e74616c6f6e707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330383271007e002b7400014274000f5449515545204641435455524120427371007e001e01000000010174000331313271007e0030740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040174000330383071007e00667400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330383171007e00437400014174000f5449515545204641435455524120417371007e001e01000000020174000331313671007e0026740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330363371007e007a7400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330363471007e007f7400014274000f4c49515549444143494f4e455320427371007e001e01000000040074000339393971007e00527400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330303171007e00217400014174000a464143545552415320417371007e001e01000000010174000330303271007e003e740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000331313371007e0070740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330303871007e006b740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330303971007e00397400014274000952454349424f5320427371007e001e01000000020174000330303671007e00487400014274000a464143545552415320427371007e001e01000000010174000330303371007e0057740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000331313571007e005c740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330303471007e00757400014174000952454349424f5320417371007e001e01000000040074000339393871007e004d7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000004007400043939393971007e0061740001587400085469636b657420587871007e0021740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e002174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e002174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
12	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427871007e0048740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e004874000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e004874001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000103f400000000000027372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870404500000000000071007e0034707371007e0099000000000000000071007e00577400054e4547524f7874000c30313432383638332e3033327400044a4e34327371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000005d7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0048740007497661203231257371007e00a240350000000000000171007e0066740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004874000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000047371007e0099000000000000000071007e0043740001537371007e0099000000000000000071007e0021740004417a756c7371007e0099000000000000000071007e003e7400014c7371007e0099000000000000000071007e0066740002584c7871007e004874000554414c4c457371007e00ac7371007e001c770c000000103f400000000000037371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e009900000000000000007371007e00100000000000000028740005524543544f7871007e003e74000543414c43457371007e00ac7371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7371007e0099000000000000000071007e0021740004417a756c7871007e0043740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004374000850616e74616c6f6e707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000040074000339393871007e00707400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330303271007e0043740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303671007e00217400014274000a464143545552415320427371007e001e01000000010174000330363371007e00267400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303971007e00397400014274000952454349424f5320427371007e001e01000000020174000330303871007e004d740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000331313671007e002f740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330383171007e00757400014174000f5449515545204641435455524120417371007e001e01000000010174000330303371007e003e740001417400124e4f544153204445204352454449544f20417371007e001e01000000040074000339393971007e00577400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000331313371007e007a740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330363471007e00617400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303171007e00487400014174000a464143545552415320417371007e001e01000000010174000331313571007e005c740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330303471007e00667400014174000952454349424f5320417371007e001e0100000004007400043939393971007e006b740001587400085469636b657420587371007e001e01000000020174000330383271007e007f7400014274000f5449515545204641435455524120427371007e001e01000000010174000331313271007e0052740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040174000330383071007e00347400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537871007e0048740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004874000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e004874001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
13	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787871007e006b740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e006b74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e006b74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787040470000000000007371007e0010000000000000002d707371007e009900000000000000007371007e00100000000000000028740005524543544f7371007e0099000000000000000071007e00537400054e4547524f7874000c30313432383638332e3033367400044a4e34367371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000005b7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e006b740007497661203231257371007e00a640350000000000000171007e007a740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006b74000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000047371007e0099000000000000000071007e007a740002584c7371007e0099000000000000000071007e002b740004417a756c7371007e0099000000000000000071007e00707400014c7371007e0099000000000000000071007e0026740001537871007e006b74000554414c4c457371007e00b07371007e001c770c000000103f400000000000037371007e0099000000000000000071007e0012740004526f6a6f7371007e0099000000000000000071007e002b740004417a756c7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7871007e0026740005434f4c4f527371007e00b07371007e001c770c000000103f400000000000037371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e0099000000000000000071007e009d740005524543544f7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7871007e007074000543414c4345787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002674000850616e74616c6f6e707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330383271007e00757400014274000f5449515545204641435455524120427371007e001e01000000010174000330303271007e0026740001417400114e4f5441532044452044454249544f20417371007e001e01000000040074000339393871007e007f7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330363371007e003f7400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330383171007e00357400014174000f5449515545204641435455524120417371007e001e01000000020174000330303671007e002b7400014274000a464143545552415320427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330363471007e004e7400014274000f4c49515549444143494f4e455320427371007e001e01000000040074000339393971007e00537400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330303371007e0070740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330303871007e0044740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000331313571007e0061740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000004007400043939393971007e003a740001587400085469636b657420587371007e001e01000000020174000331313371007e0030740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303971007e00667400014274000952454349424f5320427371007e001e01000000010174000330303471007e007a7400014174000952454349424f5320417371007e001e01000000010174000331313271007e0058740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040174000330383071007e00217400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000331313671007e0049740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330303171007e006b7400014174000a464143545552415320417871007e006b740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e006b74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e006b74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
14	Cambio en stock de JEAN	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787871007e0035740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e003574000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e003574001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00757372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870000000000000000071007e007f7400054e4547524f7371007e009940470000000000007371007e0010000000000000002d707371007e009900000000000000007371007e00100000000000000028740005524543544f7874000c30313432383638332e3033367400044a4e34367371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000005b7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0035740007497661203231257371007e00a640350000000000000171007e0075740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003574000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7371007e0099000000000000000071007e002b740004417a756c7871007e0026740005434f4c4f527371007e00b07371007e001c770c000000103f400000000000037371007e0099000000000000000071007e009f740005524543544f7371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7871007e006674000543414c43457371007e00b07371007e001c770c000000103f400000000000047371007e0099000000000000000071007e002b740004417a756c7371007e0099000000000000000071007e0026740001537371007e0099000000000000000071007e0075740002584c7371007e0099000000000000000071007e00667400014c7871007e003574000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002674000850616e74616c6f6e707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000331313571007e005c740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330363371007e00307400014174000f4c49515549444143494f4e455320417371007e001e01000000040074000339393871007e00527400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330363471007e00447400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330303971007e00577400014274000952454349424f5320427371007e001e01000000010174000330303471007e00757400014174000952454349424f5320417371007e001e01000000010174000330303371007e0066740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330383271007e00707400014274000f5449515545204641435455524120427371007e001e01000000020174000330303671007e002b7400014274000a464143545552415320427371007e001e0100000004007400043939393971007e0061740001587400085469636b657420587371007e001e01000000040074000339393971007e007f7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330383171007e006b7400014174000f5449515545204641435455524120417371007e001e01000000020174000331313371007e0021740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303171007e00357400014174000a464143545552415320417371007e001e01000000010174000330303271007e0026740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000331313271007e003a740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000331313671007e004d740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040174000330383071007e003f7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330303871007e007a740001427400124e4f544153204445204352454449544f20427871007e0035740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e003574000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e003574001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
15	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417871007e007f740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e007f74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e007f74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870000000000000000071007e00447400054e4547524f7371007e009940470000000000007371007e0010000000000000002d707371007e009900000000000000007371007e00100000000000000028740005524543544f7874000c30313432383638332e3033367400044a4e34367371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000005b7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e007f740007497661203231257371007e00a640350000000000000171007e0070740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e007f74000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000047371007e0099000000000000000071007e00617400014c7371007e0099000000000000000071007e004e740001537371007e0099000000000000000071007e007a740004417a756c7371007e0099000000000000000071007e0070740002584c7871007e007f74000554414c4c457371007e00b07371007e001c770c000000103f400000000000037371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e0099000000000000000071007e009f740005524543544f7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7871007e006174000543414c43457371007e00b07371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7371007e0099000000000000000071007e007a740004417a756c7871007e004e740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004e74000850616e74616c6f6e707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000331313271007e0049740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000331313571007e0035740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303671007e007a7400014274000a464143545552415320427371007e001e0100000004007400043939393971007e0053740001587400085469636b657420587371007e001e01000000040074000339393971007e00447400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303971007e00267400014274000952454349424f5320427371007e001e01000000020174000330363471007e002b7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330363371007e00587400014174000f4c49515549444143494f4e455320417371007e001e01000000040174000330383071007e00217400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330303371007e0061740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330383171007e003a7400014174000f5449515545204641435455524120417371007e001e01000000020174000330303871007e0030740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000331313371007e0075740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000331313671007e0066740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330383271007e006b7400014274000f5449515545204641435455524120427371007e001e01000000010174000330303271007e004e740001417400114e4f5441532044452044454249544f20417371007e001e01000000040074000339393871007e003f7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330303471007e00707400014174000952454349424f5320417371007e001e01000000010174000330303171007e007f7400014174000a464143545552415320417871007e007f740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e007f74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e007f74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
16	Cambio en stock de JEAN	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417871007e005d740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e005d74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e005d74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00717372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787040470000000000007371007e0010000000000000002d707371007e009900000000000000007371007e00100000000000000028740005524543544f7371007e0099000000000000000071007e00307400054e4547524f7874000c30313432383638332e3033367400044a4e34367371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000005b7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e005d740007497661203231257371007e00a640350000000000000171007e0071740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005d74000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7371007e0099000000000000000071007e0053740004417a756c7871007e006c740005434f4c4f527371007e00b07371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e0099000000000000000071007e009d740005524543544f7371007e009900000000000000007371007e00100000000000000027740004534c494d7871007e004974000543414c43457371007e00b07371007e001c770c000000103f400000000000047371007e0099000000000000000071007e006c740001537371007e0099000000000000000071007e0053740004417a756c7371007e0099000000000000000071007e00497400014c7371007e0099000000000000000071007e0071740002584c7871007e005d74000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006c74000850616e74616c6f6e707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303371007e0049740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330303271007e006c740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330303471007e00717400014174000952454349424f5320417371007e001e01000000020174000330303971007e00587400014274000952454349424f5320427371007e001e01000000020174000330303871007e0044740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000331313271007e0026740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000331313671007e0062740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330303671007e00537400014274000a464143545552415320427371007e001e01000000010174000331313571007e004e740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330303171007e005d7400014174000a464143545552415320417371007e001e01000000020174000331313371007e0067740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000040174000330383071007e00357400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000040074000339393871007e002b7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000004007400043939393971007e0076740001587400085469636b657420587371007e001e01000000040074000339393971007e00307400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330383171007e003a7400014174000f5449515545204641435455524120417371007e001e01000000020174000330363471007e003f7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330363371007e007f7400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330383271007e00217400014274000f5449515545204641435455524120427871007e005d740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e005d74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e005d74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
17	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537871007e005c740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e005c74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e005c74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000103f400000000000027372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870404500000000000071007e007f707371007e0099000000000000000071007e00577400054e4547524f7874000c30313432383638332e3033327400044a4e34327371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000005d7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e005c740007497661203231257371007e00a240350000000000000171007e007a740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005c74000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000037371007e0099000000000000000071007e0012740004526f6a6f7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0039740004417a756c7871007e0066740005434f4c4f527371007e00ac7371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e009900000000000000007371007e00100000000000000028740005524543544f7371007e009900000000000000007371007e00100000000000000027740004534c494d7871007e004374000543414c43457371007e00ac7371007e001c770c000000103f400000000000047371007e0099000000000000000071007e0066740001537371007e0099000000000000000071007e0039740004417a756c7371007e0099000000000000000071007e00437400014c7371007e0099000000000000000071007e007a740002584c7871007e005c74000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006674000850616e74616c6f6e707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303371007e0043740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330363471007e00527400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330383171007e00617400014174000f5449515545204641435455524120417371007e001e01000000010174000330303471007e007a7400014174000952454349424f5320417371007e001e01000000020174000330303671007e00397400014274000a464143545552415320427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330303271007e0066740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330363371007e006b7400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303971007e00707400014274000952454349424f5320427371007e001e01000000020174000330303871007e0075740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000331313271007e0034740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000331313371007e004d740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000331313571007e0048740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330383271007e00217400014274000f5449515545204641435455524120427371007e001e01000000040074000339393871007e003e7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000331313671007e0026740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330303171007e005c7400014174000a464143545552415320417371007e001e01000000040174000330383071007e007f7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000004007400043939393971007e002f740001587400085469636b657420587371007e001e01000000040074000339393971007e00577400024e587400124e6f7461206465206372c3a96469746f20787871007e005c740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e005c74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e005c74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
18	Cambio en stock de JEAN	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e00037870010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417871007e0075740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e007574000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e007574001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000103f400000000000027372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870000000000000000071007e00587400054e4547524f7371007e0099404500000000000071007e0049707874000c30313432383638332e3033327400044a4e34327371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000005d7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0075740007497661203231257371007e00a240350000000000000171007e0070740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e007574000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000037371007e009900000000000000007371007e00100000000000000028740005524543544f7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e009900000000000000007371007e00100000000000000027740004534c494d7871007e007f74000543414c43457371007e00ac7371007e001c770c000000103f400000000000037371007e0099000000000000000071007e0035740004417a756c7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7871007e006b740005434f4c4f527371007e00ac7371007e001c770c000000103f400000000000047371007e0099000000000000000071007e007f7400014c7371007e0099000000000000000071007e0070740002584c7371007e0099000000000000000071007e006b740001537371007e0099000000000000000071007e0035740004417a756c7871007e007574000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006b74000850616e74616c6f6e707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330383271007e00667400014274000f5449515545204641435455524120427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000040174000330383071007e00497400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330303471007e00707400014174000952454349424f5320417371007e001e01000000010174000330303171007e00757400014174000a464143545552415320417371007e001e01000000010174000330303271007e006b740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303871007e007a740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000331313271007e002b740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000331313671007e0030740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330363471007e003f7400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303971007e005d7400014274000952454349424f5320427371007e001e0100000004007400043939393971007e0021740001587400085469636b657420587371007e001e01000000010174000330363371007e004e7400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000331313571007e003a740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330383171007e00537400014174000f5449515545204641435455524120417371007e001e01000000020174000330303671007e00357400014274000a464143545552415320427371007e001e01000000010174000330303371007e007f740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000331313371007e0026740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000040074000339393971007e00587400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000040074000339393871007e00447400024e587400114e6f74612064652064c3a96269746f20787871007e0075740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e007574000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e007574001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
19	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427871007e0026740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e002674000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e002674001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000103f400000000000027372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870000000000000000071007e006b7400054e4547524f7371007e0099404500000000000071007e003a707874000c30313432383638332e3033327400044a4e34327371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000005d7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0026740007497661203231257371007e00a240350000000000000171007e005c740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002674000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000047371007e0099000000000000000071007e005c740002584c7371007e0099000000000000000071007e00667400014c7371007e0099000000000000000071007e007a740004417a756c7371007e0099000000000000000071007e0049740001537871007e002674000554414c4c457371007e00ac7371007e001c770c000000103f400000000000037371007e0099000000000000000071007e007a740004417a756c7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7871007e0049740005434f4c4f527371007e00ac7371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e00100000000000000028740005524543544f7871007e006674000543414c4345787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004974000850616e74616c6f6e707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303171007e00267400014174000a464143545552415320417371007e001e01000000010174000330303471007e005c7400014174000952454349424f5320417371007e001e01000000020174000330383271007e00527400014274000f5449515545204641435455524120427371007e001e01000000020174000330303671007e007a7400014274000a464143545552415320427371007e001e01000000010174000330303271007e0049740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000331313671007e0061740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000331313371007e0070740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000040074000339393871007e00307400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330363371007e00447400014174000f4c49515549444143494f4e455320417371007e001e01000000040174000330383071007e003a7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330303371007e0066740001417400124e4f544153204445204352454449544f20417371007e001e0100000004007400043939393971007e002b740001587400085469636b657420587371007e001e01000000020174000330363471007e00217400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000331313271007e0057740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040074000339393971007e006b7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303971007e00357400014274000952454349424f5320427371007e001e01000000010174000330383171007e00757400014174000f5449515545204641435455524120417371007e001e01000000020174000330303871007e007f740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000331313571007e003f740001417400165449515545204e4f54412044452044454249544f20417871007e0026740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e002674000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e002674001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
20	Cambio en stock de JEAN	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417871007e006c740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e006c74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e006c74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e005d7372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000103f400000000000027372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870000000000000000071007e00357400054e4547524f7371007e0099404500000000000071007e002b707874000c30313432383638332e3033327400044a4e34327371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000005d7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e006c740007497661203231257371007e00a240350000000000000171007e005d740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006c74000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000047371007e0099000000000000000071007e00307400014c7371007e0099000000000000000071007e0053740001537371007e0099000000000000000071007e005d740002584c7371007e0099000000000000000071007e003f740004417a756c7871007e006c74000554414c4c457371007e00ac7371007e001c770c000000103f400000000000037371007e0099000000000000000071007e003f740004417a756c7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7871007e0053740005434f4c4f527371007e00ac7371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e00100000000000000028740005524543544f7871007e003074000543414c4345787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005374000850616e74616c6f6e707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303471007e005d7400014174000952454349424f5320417371007e001e01000000020174000331313671007e0021740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330363471007e003a7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303371007e0030740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330303171007e006c7400014174000a464143545552415320417371007e001e0100000004007400043939393971007e0049740001587400085469636b657420587371007e001e01000000020174000330303871007e0044740001427400124e4f544153204445204352454449544f20427371007e001e01000000040174000330383071007e002b7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330383271007e00717400014274000f5449515545204641435455524120427371007e001e01000000040074000339393971007e00357400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303671007e003f7400014274000a464143545552415320427371007e001e01000000020174000330303971007e00587400014274000952454349424f5320427371007e001e01000000010174000331313571007e004e740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000040074000339393871007e00677400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330303271007e0053740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330363371007e00627400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000331313271007e007f740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000331313371007e0026740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330383171007e00767400014174000f5449515545204641435455524120417871007e006c740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e006c74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e006c74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
43	Migración de productos	11/03/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000027704000000027372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e31740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870707400154869706f6c69746f20497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000d52757461204465706f7369746f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001d0100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d0100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417371007e001d0100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d0100000001017400033030327371007e000f0000000000000002740001417400114e4f5441532044452044454249544f20417371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001d0100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d0100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d0100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427371007e001d0100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e4941205255544174000634343434343474000634343434343574000634323134343571007e00657372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00934c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001b770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e000f0000000000000027740004534c494d7371007e009800000000000000007371007e000f000000000000002f740006532f33382f317371007e009800000000000000007371007e000f000000000000002c74000b415a554c204f534355524f7874000c31313438363233372e3032387400054a414f33387371007e001b770c000000103f40000000000000787371007e001b770c000000103f40000000000000787371007e000f000000000000031f7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0011740007497661203231257371007e00a740350000000000000171007e0043740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001174000954617665726e6974697400044a45414e7371007e001b770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001b770c000000203f4000000000000f7371007e009800000000000000007371007e000f000000000000001f740008414d4152494c4c4f7371007e009800000000000000007371007e000f0000000000000022740004524f53417371007e009800000000000000007371007e000f000000000000003b74000854555251554553417371007e009800000000000000007371007e000f000000000000002174000556455244457371007e009800000000000000007371007e000f000000000000001e740006424c414e434f7371007e0098000000000000000071007e00487400054e4547524f7371007e009800000000000000007371007e000f0000000000000023740008424f5244454155587371007e009800000000000000007371007e000f000000000000002a7400074d415252c3934e7371007e009800000000000000007371007e000f000000000000002474000542454947457371007e009800000000000000007371007e000f00000000000000257400074d4f5354415a417371007e0098000000000000000071007e00a074000b415a554c204f534355524f7371007e0098000000000000000071007e0074740004524f4a4f7371007e0098000000000000000071007e0079740005415a554c207371007e009800000000000000007371007e000f000000000000002974000743454c455354457371007e009800000000000000007371007e000f0000000000000020740004475249537871007e005b740005434f4c4f527371007e00b17371007e001b770c000000103f400000000000037371007e0098000000000000000071007e009a740004534c494d7371007e009800000000000000007371007e000f000000000000002674000a455854524120534c494d7371007e009800000000000000007371007e000f0000000000000028740005524543544f7871007e007e74000543414c43457371007e00b17371007e001b770c000000103f400000000000087371007e009800000000000000007371007e000f000000000000003474000833584c2f34382f367371007e009800000000000000007371007e000f00000000000000307400064d2f34302f327371007e009800000000000000007371007e000f000000000000003574000834584c2f35302f377371007e009800000000000000007371007e000f00000000000000317400064c2f34322f337371007e009800000000000000007371007e000f000000000000003674000835584c2f35322f387371007e0098000000000000000071007e009d740006532f33382f317371007e009800000000000000007371007e000f0000000000000032740007584c2f34342f347371007e009800000000000000007371007e000f000000000000003374000858584c2f34362f357871007e001174000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005b74000f50414e54414c4f4e20484f4d425245707371007e001b770c000000103f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000020174000330383271007e002f7400014274000f5449515545204641435455524120427371007e001d01000000010174000331313271007e0060740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330303371007e007e740001417400124e4f544153204445204352454449544f20417371007e001d01000000020174000330303671007e00797400014274000a464143545552415320427371007e001d01000000040074000339393971007e00487400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000040074000339393871007e00527400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000004007400043939393971007e0034740001587400085469636b657420587371007e001d01000000020174000330303771007e0074740001427400114e4f5441532044452044454249544f20427371007e001d01000000020174000330303871007e006f740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000330303971007e00207400014274000952454349424f5320427371007e001d01000000010174000330303471007e00437400014174000952454349424f5320417371007e001d01000000020174000331313671007e0039740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000040174000330383071007e003e7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000020174000331313371007e006a740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000010174000330303271007e005b740001417400114e4f5441532044452044454249544f20417371007e001d01000000010174000331313571007e004d740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000330363471007e00257400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000330383171007e002a7400014174000f5449515545204641435455524120417371007e001d01000000010174000330363371007e00657400014174000f4c49515549444143494f4e455320417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357371007e000240000000000000007400054a45414e31740001317371007e000b707400154869706f6c69746f20497269676f79656e2034333671007e001174000d52757461204465706f7369746f707371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000040174000330383071007e003e7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000330383171007e002a7400014174000f5449515545204641435455524120417371007e001d01000000040074000339393971007e00487400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000020174000330303871007e006f740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000330303971007e00207400014274000952454349424f5320427371007e001d01000000020174000330383271007e002f7400014274000f5449515545204641435455524120427371007e001d01000000010174000331313271007e0060740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000020174000330303771007e0074740001427400114e4f5441532044452044454249544f20427371007e001d01000000010174000330303371007e007e740001417400124e4f544153204445204352454449544f20417371007e001d01000000020174000330303671007e00797400014274000a464143545552415320427371007e001d01000000020174000331313371007e006a740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000010174000330303471007e00437400014174000952454349424f5320417371007e001d01000000010174000330363371007e00657400014174000f4c49515549444143494f4e455320417371007e001d01000000040074000339393871007e00527400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000020174000331313671007e0039740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000010174000331313571007e004d740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000004007400043939393971007e0034740001587400085469636b657420587371007e001d01000000020174000330363471007e00257400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000330303271007e005b740001417400114e4f5441532044452044454249544f20417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e4941205255544174000634343434343474000634343434343574000634323134343571007e00257371007e009240a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001b770c000000103f400000000000037371007e0098000000000000000071007e00a074000b415a554c204f534355524f7371007e0098000000000000000071007e009a740004534c494d7371007e0098000000000000000071007e00fd740007584c2f34342f347874000c31313438363233372e3033347400054a414f34347371007e001b770c000000103f40000000000000787371007e001b770c000000103f40000000000000787371007e000f00000000000003227371007e00a740350000000000000071007e0011740007497661203231257371007e00a740350000000000000171007e0043740007497661203231257371007e00ac71007e001174000954617665726e6974697400044a45414e7371007e001b770c000000103f400000000000037371007e00b17371007e001b770c000000103f400000000000037371007e0098000000000000000071007e009a740004534c494d7371007e0098000000000000000071007e00e6740005524543544f7371007e0098000000000000000071007e00e374000a455854524120534c494d7871007e007e74000543414c43457371007e00b17371007e001b770c000000203f4000000000000f7371007e0098000000000000000071007e00c97400074d415252c3934e7371007e0098000000000000000071007e00b5740008414d4152494c4c4f7371007e0098000000000000000071007e0079740005415a554c207371007e0098000000000000000071007e00a074000b415a554c204f534355524f7371007e0098000000000000000071007e00cf7400074d4f5354415a417371007e0098000000000000000071007e00db740004475249537371007e0098000000000000000071007e00c1740006424c414e434f7371007e0098000000000000000071007e00b8740004524f53417371007e0098000000000000000071007e00cc74000542454947457371007e0098000000000000000071007e00bb74000854555251554553417371007e0098000000000000000071007e00c6740008424f5244454155587371007e0098000000000000000071007e0074740004524f4a4f7371007e0098000000000000000071007e00be74000556455244457371007e0098000000000000000071007e00d874000743454c455354457371007e0098000000000000000071007e00487400054e4547524f7871007e005b740005434f4c4f527371007e00b17371007e001b770c000000103f400000000000087371007e0098000000000000000071007e00ec74000833584c2f34382f367371007e0098000000000000000071007e010074000858584c2f34362f357371007e0098000000000000000071007e00ef7400064d2f34302f327371007e0098000000000000000071007e00f274000834584c2f35302f377371007e0098000000000000000071007e00fd740007584c2f34342f347371007e0098000000000000000071007e00f57400064c2f34322f337371007e0098000000000000000071007e00f874000835584c2f35322f387371007e0098000000000000000071007e009d740006532f33382f317871007e001174000554414c4c45787371007e010371007e005b74000f50414e54414c4f4e20484f4d425245707371007e001b770c000000103f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d0100000004007400043939393971007e0034740001587400085469636b657420587371007e001d01000000020174000330363471007e00257400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000331313271007e0060740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000020174000330303971007e00207400014274000952454349424f5320427371007e001d01000000010174000330383171007e002a7400014174000f5449515545204641435455524120417371007e001d01000000020174000330303871007e006f740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000330303671007e00797400014274000a464143545552415320427371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000040174000330383071007e003e7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000020174000330303771007e0074740001427400114e4f5441532044452044454249544f20427371007e001d01000000020174000331313371007e006a740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000010174000330303371007e007e740001417400124e4f544153204445204352454449544f20417371007e001d01000000010174000330303471007e00437400014174000952454349424f5320417371007e001d01000000020174000331313671007e0039740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000040074000339393871007e00527400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000010174000330363371007e00657400014174000f4c49515549444143494f4e455320417371007e001d01000000010174000330303271007e005b740001417400114e4f5441532044452044454249544f20417371007e001d01000000020174000330383271007e002f7400014274000f5449515545204641435455524120427371007e001d01000000040074000339393971007e00487400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000331313571007e004d740001417400165449515545204e4f54412044452044454249544f20417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e4941205255544174000634343434343474000634343434343578	Administrador Casa Sonia	1
36	Carga de stock	24/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000027704000000027372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b78703ff000000000000074000752454d45524136740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587871007e0053740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e005374000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e005374001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c78704092c00000000000408da00000000000000000014080bc51eb851eb8406f8000000000004076c75c28f5c28f408da00000000000409b1e28f5c28f5c40a0680000000000000000007371007e001c770c000000083f400000000000057372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e001000000000000000387400084355454c4c4f204f7371007e009900000000000000007371007e0010000000000000003e7400044c49534f7371007e009900000000000000007371007e001000000000000000317400064c2f34322f337371007e009900000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7371007e009900000000000000007371007e001000000000000000397400094d2e204c41524741537874000a30363837343935352e6c74000952454d414f4c4c49537371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e001000000000000001757372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0053740007497661203231257371007e00ae40350000000000000171007e0035740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005374000954617665726e69746974000652454d4552417371007e001c770c000000083f4000000000000573720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000043f400000000000027371007e0099000000000000000071007e00a77400094d2e204c41524741537371007e009900000000000000007371007e0010000000000000003a7400094d2e20434f525441537871007e002b7400064d414e4741537371007e00b87371007e001c770c000000203f4000000000000f7371007e009900000000000000007371007e0010000000000000002974000743454c455354457371007e009900000000000000007371007e00100000000000000020740004475249537371007e009900000000000000007371007e0010000000000000001f740008414d4152494c4c4f7371007e009900000000000000007371007e0010000000000000003b74000854555251554553417371007e0099000000000000000071007e002b740005415a554c207371007e009900000000000000007371007e0010000000000000002474000542454947457371007e009900000000000000007371007e0010000000000000002174000556455244457371007e0099000000000000000071007e00a474000b415a554c204f534355524f7371007e0099000000000000000071007e0012740004524f4a4f7371007e009900000000000000007371007e001000000000000000257400074d4f5354415a417371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e00587400054e4547524f7371007e009900000000000000007371007e00100000000000000022740004524f53417371007e009900000000000000007371007e0010000000000000001e740006424c414e434f7371007e009900000000000000007371007e00100000000000000023740008424f5244454155587871007e0044740005434f4c4f527371007e00b87371007e001c770c000000083f400000000000047371007e009900000000000000007371007e0010000000000000003f74000652415941444f7371007e009900000000000000007371007e0010000000000000003d740007455354414d50417371007e0099000000000000000071007e009e7400044c49534f7371007e009900000000000000007371007e0010000000000000003c740008464c4f524541444f7871007e0012740006455354494c4f7371007e00b87371007e001c770c000000043f400000000000027371007e009900000000000000007371007e001000000000000000377400084355454c4c4f20567371007e0099000000000000000071007e009b7400084355454c4c4f204f7871007e00357400064355454c4c4f7371007e00b87371007e001c770c000000103f400000000000087371007e009900000000000000007371007e0010000000000000003674000835584c2f35322f387371007e0099000000000000000071007e00a17400064c2f34322f337371007e009900000000000000007371007e001000000000000000307400064d2f34302f327371007e009900000000000000007371007e0010000000000000003474000833584c2f34382f367371007e009900000000000000007371007e0010000000000000003574000834584c2f35302f377371007e009900000000000000007371007e0010000000000000002f740006532f33382f317371007e009900000000000000007371007e00100000000000000032740007584c2f34342f347371007e009900000000000000007371007e0010000000000000003374000858584c2f34362f357871007e005374000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001274000d52454d45524120484f4d425245707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000331313571007e003f740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303871007e0066740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000330303471007e00357400014174000952454349424f5320417371007e001e0100000004007400043939393971007e007f740001587400085469636b657420587371007e001e01000000010174000330303171007e00537400014174000a464143545552415320417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330363371007e00267400014174000f4c49515549444143494f4e455320417371007e001e01000000040074000339393971007e00587400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000040074000339393871007e007a7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000331313271007e0021740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303971007e004e7400014274000952454349424f5320427371007e001e01000000010174000330383171007e00707400014174000f5449515545204641435455524120417371007e001e01000000010174000330303271007e0044740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330303371007e0049740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000331313371007e005d740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000331313671007e006b740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330303671007e002b7400014274000a464143545552415320427371007e001e01000000020174000330363471007e003a7400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330383271007e00757400014274000f5449515545204641435455524120427371007e001e01000000040174000330383071007e00307400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537871007e0053740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e005374000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e005374001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e49417400063434343434347400063434343434357371007e00023ff000000000000074000752454d45524136740001317371007e000b740001317400144869706f6c69746f497269676f79656e2034333671007e001274000e5275746120457869626963696f6e707371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000331313271007e0021740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000331313571007e003f740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330363371007e00267400014174000f4c49515549444143494f4e455320417371007e001e01000000040074000339393871007e007a7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330383171007e00707400014174000f5449515545204641435455524120417371007e001e01000000010174000330303371007e0049740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330363471007e003a7400014274000f4c49515549444143494f4e455320427371007e001e01000000040074000339393971007e00587400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330383271007e00757400014274000f5449515545204641435455524120427371007e001e01000000010174000330303471007e00357400014174000952454349424f5320417371007e001e01000000020174000330303971007e004e7400014274000952454349424f5320427371007e001e01000000020174000330303671007e002b7400014274000a464143545552415320427371007e001e01000000010174000330303171007e00537400014174000a464143545552415320417371007e001e0100000004007400043939393971007e007f740001587400085469636b657420587371007e001e01000000010174000330303271007e0044740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303871007e0066740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000331313671007e006b740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040174000330383071007e00307400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000331313371007e005d740001427400175449515545204e4f5441204445204352454449544f20427871007e0053740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e005374000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e005374001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707371007e009340906800000000004089ec00000000000000000140856c51eb851eb8406b9000000000004076c75c28f5c28f4089ec0000000000409b1e28f5c28f5c40a0680000000000000000007371007e001c770c000000083f400000000000047371007e0099000000000000000071007e00a77400094d2e204c41524741537371007e0099000000000000000071007e009e7400044c49534f7371007e0099000000000000000071007e0117740007584c2f34342f347371007e0099000000000000000071007e00a474000b415a554c204f534355524f7874000b30363837343935352e786c74000a52454d414f584c4c49537371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e001000000000000001767371007e00ae40350000000000000071007e0053740007497661203231257371007e00ae40350000000000000171007e0035740007497661203231257371007e00b371007e005374000954617665726e69746974000652454d4552417371007e001c770c000000083f400000000000047371007e00b87371007e001c770c000000203f4000000000000f7371007e0099000000000000000071007e00d574000556455244457371007e0099000000000000000071007e002b740005415a554c207371007e0099000000000000000071007e00cd74000854555251554553417371007e0099000000000000000071007e00587400054e4547524f7371007e0099000000000000000071007e00c7740004475249537371007e0099000000000000000071007e00e4740004524f53417371007e0099000000000000000071007e00a474000b415a554c204f534355524f7371007e0099000000000000000071007e00ca740008414d4152494c4c4f7371007e0099000000000000000071007e00df7400074d415252c3934e7371007e0099000000000000000071007e00dc7400074d4f5354415a417371007e0099000000000000000071007e00e7740006424c414e434f7371007e0099000000000000000071007e0012740004524f4a4f7371007e0099000000000000000071007e00c474000743454c455354457371007e0099000000000000000071007e00d274000542454947457371007e0099000000000000000071007e00ea740008424f5244454155587871007e0044740005434f4c4f527371007e00b87371007e001c770c000000043f400000000000027371007e0099000000000000000071007e00a77400094d2e204c41524741537371007e0099000000000000000071007e00be7400094d2e20434f525441537871007e002b7400064d414e4741537371007e00b87371007e001c770c000000083f400000000000047371007e0099000000000000000071007e00f8740008464c4f524541444f7371007e0099000000000000000071007e009e7400044c49534f7371007e0099000000000000000071007e00f3740007455354414d50417371007e0099000000000000000071007e00f074000652415941444f7871007e0012740006455354494c4f7371007e00b87371007e001c770c000000103f400000000000087371007e0099000000000000000071007e010674000835584c2f35322f387371007e0099000000000000000071007e011a74000858584c2f34362f357371007e0099000000000000000071007e010b7400064d2f34302f327371007e0099000000000000000071007e010e74000833584c2f34382f367371007e0099000000000000000071007e0117740007584c2f34342f347371007e0099000000000000000071007e011174000834584c2f35302f377371007e0099000000000000000071007e0114740006532f33382f317371007e0099000000000000000071007e00a17400064c2f34322f337871007e005374000554414c4c45787371007e011d71007e001274000d52454d45524120484f4d425245707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000331313571007e003f740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330363371007e00267400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303871007e0066740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000331313271007e0021740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330363471007e003a7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330383171007e00707400014174000f5449515545204641435455524120417371007e001e01000000010174000330303171007e00537400014174000a464143545552415320417371007e001e01000000020174000331313671007e006b740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000004007400043939393971007e007f740001587400085469636b657420587371007e001e01000000040174000330383071007e00307400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000040074000339393971007e00587400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330303271007e0044740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303971007e004e7400014274000952454349424f5320427371007e001e01000000020174000330303671007e002b7400014274000a464143545552415320427371007e001e01000000010174000330303471007e00357400014174000952454349424f5320417371007e001e01000000020174000330383271007e00757400014274000f5449515545204641435455524120427371007e001e01000000020174000331313371007e005d740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303371007e0049740001417400124e4f544153204445204352454449544f20417371007e001e01000000040074000339393871007e007a7400024e587400114e6f74612064652064c3a96269746f20787871007e0053740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e005374000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e005374001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
35	Cambio en stock de JEAN	24/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417871007e007a740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e007a74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e007a74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00577372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001409846e147ae147b407a4000000000004087523d70a3d70a4098b0000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787040440000000000007371007e0010000000000000000c707371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7874000c30303430363932392e3032387400024a417371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e001000000000000000757372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e007a740007497661203231257371007e00a740350000000000000171007e0057740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e007a74000954617665726e6974697400044a45414e7371007e001c770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000043f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e0099000000000000000071007e009d740004534c494d7371007e009900000000000000007371007e00100000000000000028740005524543544f7871007e002674000543414c43457371007e00b17371007e001c770c000000103f400000000000087371007e009900000000000000007371007e00100000000000000032740007584c2f34342f347371007e009900000000000000007371007e0010000000000000003474000833584c2f34382f367371007e009900000000000000007371007e0010000000000000003674000835584c2f35322f387371007e009900000000000000007371007e0010000000000000003574000834584c2f35302f377371007e009900000000000000007371007e001000000000000000307400064d2f34302f327371007e009900000000000000007371007e0010000000000000002f740006532f33382f317371007e009900000000000000007371007e0010000000000000003374000858584c2f34362f357371007e009900000000000000007371007e001000000000000000317400064c2f34322f337871007e007a74000554414c4c457371007e00b17371007e001c770c000000203f4000000000000f7371007e009900000000000000007371007e0010000000000000001f740008414d4152494c4c4f7371007e009900000000000000007371007e0010000000000000002974000743454c455354457371007e0099000000000000000071007e0075740005415a554c207371007e0099000000000000000071007e00a074000b415a554c204f534355524f7371007e0099000000000000000071007e003f7400054e4547524f7371007e009900000000000000007371007e0010000000000000001e740006424c414e434f7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e009900000000000000007371007e001000000000000000257400074d4f5354415a417371007e009900000000000000007371007e00100000000000000020740004475249537371007e009900000000000000007371007e00100000000000000022740004524f53417371007e009900000000000000007371007e0010000000000000003b74000854555251554553417371007e009900000000000000007371007e0010000000000000002174000556455244457371007e009900000000000000007371007e00100000000000000023740008424f5244454155587371007e009900000000000000007371007e0010000000000000002474000542454947457371007e0099000000000000000071007e0012740004524f4a4f7871007e0066740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006674000f50414e54414c4f4e20484f4d425245707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e0100000004007400043939393971007e005c740001587400085469636b657420587371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330363471007e00217400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330383271007e00447400014274000f5449515545204641435455524120427371007e001e01000000010174000330363371007e007f7400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000331313671007e006b740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040174000330383071007e00617400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330383171007e003a7400014174000f5449515545204641435455524120417371007e001e01000000020174000330303871007e0049740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000330303371007e0026740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000331313571007e0035740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303971007e002b7400014274000952454349424f5320427371007e001e01000000020174000331313371007e0052740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303471007e00577400014174000952454349424f5320417371007e001e01000000020174000330303671007e00757400014274000a464143545552415320427371007e001e01000000040074000339393871007e00707400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330303171007e007a7400014174000a464143545552415320417371007e001e01000000010174000331313271007e0030740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303271007e0066740001417400114e4f5441532044452044454249544f20417371007e001e01000000040074000339393971007e003f7400024e587400124e6f7461206465206372c3a96469746f20787871007e007a740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e007a74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e007a74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
34	Carga de stock	24/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000027704000000027372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b78703ff00000000000007400054a45414e36740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e004974000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e00100000000000000027740004534c494d7371007e009940440000000000007371007e0010000000000000000c707371007e009900000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7874000c30303430363932392e3033307400054a414f34307371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e001000000000000000617372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0049740007497661203231257371007e00a740350000000000000171007e0066740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004974000954617665726e6974697400044a45414e7371007e001c770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000087371007e009900000000000000007371007e001000000000000000317400064c2f34322f337371007e009900000000000000007371007e0010000000000000002f740006532f33382f317371007e009900000000000000007371007e0010000000000000003674000835584c2f35322f387371007e009900000000000000007371007e0010000000000000003374000858584c2f34362f357371007e009900000000000000007371007e0010000000000000003474000833584c2f34382f367371007e009900000000000000007371007e00100000000000000032740007584c2f34342f347371007e009900000000000000007371007e001000000000000000307400064d2f34302f327371007e009900000000000000007371007e0010000000000000003574000834584c2f35302f377871007e004974000554414c4c457371007e00b17371007e001c770c000000203f4000000000000f7371007e009900000000000000007371007e0010000000000000002174000556455244457371007e009900000000000000007371007e0010000000000000001f740008414d4152494c4c4f7371007e009900000000000000007371007e0010000000000000003b74000854555251554553417371007e009900000000000000007371007e0010000000000000002974000743454c455354457371007e009900000000000000007371007e00100000000000000020740004475249537371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004524f4a4f7371007e0099000000000000000071007e007a7400054e4547524f7371007e009900000000000000007371007e001000000000000000257400074d4f5354415a417371007e009900000000000000007371007e00100000000000000022740004524f53417371007e0099000000000000000071007e0075740005415a554c207371007e009900000000000000007371007e0010000000000000001e740006424c414e434f7371007e009900000000000000007371007e0010000000000000002474000542454947457371007e0099000000000000000071007e00a074000b415a554c204f534355524f7371007e009900000000000000007371007e00100000000000000023740008424f5244454155587871007e005c740005434f4c4f527371007e00b17371007e001c770c000000043f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e0099000000000000000071007e009b740004534c494d7371007e009900000000000000007371007e00100000000000000028740005524543544f7871007e003f74000543414c4345787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005c74000f50414e54414c4f4e20484f4d425245707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303371007e003f740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000331313371007e003a740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000040074000339393871007e00707400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000331313271007e0030740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040174000330383071007e00447400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330383171007e00577400014174000f5449515545204641435455524120417371007e001e01000000010174000330363371007e00267400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330303271007e005c740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000331313571007e0061740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303671007e00757400014274000a464143545552415320427371007e001e01000000020174000331313671007e0052740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330363471007e006b7400014274000f4c49515549444143494f4e455320427371007e001e01000000040074000339393971007e007a7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303871007e007f740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000330303171007e00497400014174000a464143545552415320417371007e001e01000000010174000330303471007e00667400014174000952454349424f5320417371007e001e0100000004007400043939393971007e0035740001587400085469636b657420587371007e001e01000000020174000330303971007e00217400014274000952454349424f5320427371007e001e01000000020174000330383271007e002b7400014274000f5449515545204641435455524120427871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004974000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e49417400063434343434347400063434343434357371007e00023ff00000000000007400054a45414e36740001317371007e000b740001317400144869706f6c69746f497269676f79656e2034333671007e001274000e5275746120457869626963696f6e707371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000331313271007e0030740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303171007e00497400014174000a464143545552415320417371007e001e01000000020174000330303871007e007f740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330303971007e00217400014274000952454349424f5320427371007e001e01000000040174000330383071007e00447400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000331313371007e003a740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000004007400043939393971007e0035740001587400085469636b657420587371007e001e01000000010174000330303471007e00667400014174000952454349424f5320417371007e001e01000000020174000330363471007e006b7400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000331313671007e0052740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330383271007e002b7400014274000f5449515545204641435455524120427371007e001e01000000040074000339393971007e007a7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330303371007e003f740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330303671007e00757400014274000a464143545552415320427371007e001e01000000010174000330363371007e00267400014174000f4c49515549444143494f4e455320417371007e001e01000000040074000339393871007e00707400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000331313571007e0061740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330303271007e005c740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330383171007e00577400014174000f5449515545204641435455524120417871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004974000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707371007e0093409f4000000000004098b0000000000000000001409846e147ae147b407a4000000000004087523d70a3d70a4098b0000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000043f400000000000037371007e0099000000000000000071007e009b740004534c494d7371007e0099000000000000000071007e00a074000b415a554c204f534355524f7371007e0099404400000000000071007e009e707874000c30303430363932392e3032387400024a417371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e001000000000000000757371007e00a740350000000000000071007e0049740007497661203231257371007e00a740350000000000000171007e0066740007497661203231257371007e00ac71007e004974000954617665726e6974697400044a45414e7371007e001c770c000000043f400000000000037371007e00b17371007e001c770c000000203f4000000000000f7371007e0099000000000000000071007e00d674000854555251554553417371007e0099000000000000000071007e00d3740008414d4152494c4c4f7371007e0099000000000000000071007e00a074000b415a554c204f534355524f7371007e0099000000000000000071007e00df7400074d415252c3934e7371007e0099000000000000000071007e0075740005415a554c207371007e0099000000000000000071007e00f6740008424f5244454155587371007e0099000000000000000071007e00d074000556455244457371007e0099000000000000000071007e0012740004524f4a4f7371007e0099000000000000000071007e00d974000743454c455354457371007e0099000000000000000071007e007a7400054e4547524f7371007e0099000000000000000071007e00e9740004524f53417371007e0099000000000000000071007e00f174000542454947457371007e0099000000000000000071007e00e67400074d4f5354415a417371007e0099000000000000000071007e00ee740006424c414e434f7371007e0099000000000000000071007e00dc740004475249537871007e005c740005434f4c4f527371007e00b17371007e001c770c000000103f400000000000087371007e0099000000000000000071007e00b57400064c2f34322f337371007e0099000000000000000071007e00be74000858584c2f34362f357371007e0099000000000000000071007e00c77400064d2f34302f327371007e0099000000000000000071007e00bb74000835584c2f35322f387371007e0099000000000000000071007e00ca74000834584c2f35302f377371007e0099000000000000000071007e00c4740007584c2f34342f347371007e0099000000000000000071007e00b8740006532f33382f317371007e0099000000000000000071007e00c174000833584c2f34382f367871007e004974000554414c4c457371007e00b17371007e001c770c000000043f400000000000037371007e0099000000000000000071007e0101740005524543544f7371007e0099000000000000000071007e00fc74000a455854524120534c494d7371007e0099000000000000000071007e009b740004534c494d7871007e003f74000543414c4345787371007e010471007e005c74000f50414e54414c4f4e20484f4d425245707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330303971007e00217400014274000952454349424f5320427371007e001e01000000040074000339393971007e007a7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000331313271007e0030740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303371007e003f740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330303271007e005c740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330363471007e006b7400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000331313371007e003a740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000331313571007e0061740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330303171007e00497400014174000a464143545552415320417371007e001e01000000010174000330383171007e00577400014174000f5449515545204641435455524120417371007e001e01000000020174000331313671007e0052740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330303871007e007f740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000330303471007e00667400014174000952454349424f5320417371007e001e01000000040074000339393871007e00707400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330363371007e00267400014174000f4c49515549444143494f4e455320417371007e001e0100000004007400043939393971007e0035740001587400085469636b657420587371007e001e01000000020174000330383271007e002b7400014274000f5449515545204641435455524120427371007e001e01000000020174000330303671007e00757400014274000a464143545552415320427371007e001e01000000040174000330383071007e00447400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004974000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
33	Carga de stock	24/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b78703ff000000000000074000752454d45524136740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417871007e0030740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e003074000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e003074001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c78704092c00000000000408da00000000000000000014080bc51eb851eb8406f8000000000004076c75c28f5c28f408da00000000000409b1e28f5c28f5c40a0680000000000000000007371007e001c770c000000083f400000000000057372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7371007e009900000000000000007371007e0010000000000000003e7400044c49534f7371007e009900000000000000007371007e001000000000000000397400094d2e204c41524741537371007e009900000000000000007371007e001000000000000000317400064c2f34322f337371007e009900000000000000007371007e001000000000000000387400084355454c4c4f204f7874000a30363837343935352e6c74000952454d414f4c4c49537371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e001000000000000001757372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0030740007497661203231257371007e00ae40350000000000000171007e0070740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003074000954617665726e69746974000652454d4552417371007e001c770c000000083f4000000000000573720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000083f400000000000047371007e0099000000000000000071007e009e7400044c49534f7371007e009900000000000000007371007e0010000000000000003c740008464c4f524541444f7371007e009900000000000000007371007e0010000000000000003f74000652415941444f7371007e009900000000000000007371007e0010000000000000003d740007455354414d50417871007e0012740006455354494c4f7371007e00b87371007e001c770c000000203f4000000000000f7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e009900000000000000007371007e0010000000000000002174000556455244457371007e0099000000000000000071007e0012740004524f4a4f7371007e009900000000000000007371007e00100000000000000022740004524f53417371007e009900000000000000007371007e0010000000000000001e740006424c414e434f7371007e009900000000000000007371007e0010000000000000003b74000854555251554553417371007e009900000000000000007371007e0010000000000000002474000542454947457371007e0099000000000000000071007e0066740005415a554c207371007e009900000000000000007371007e0010000000000000002974000743454c455354457371007e0099000000000000000071007e00617400054e4547524f7371007e009900000000000000007371007e001000000000000000257400074d4f5354415a417371007e009900000000000000007371007e00100000000000000020740004475249537371007e009900000000000000007371007e00100000000000000023740008424f5244454155587371007e009900000000000000007371007e0010000000000000001f740008414d4152494c4c4f7871007e0043740005434f4c4f527371007e00b87371007e001c770c000000103f400000000000087371007e009900000000000000007371007e0010000000000000003474000833584c2f34382f367371007e009900000000000000007371007e0010000000000000002f740006532f33382f317371007e009900000000000000007371007e0010000000000000003574000834584c2f35302f377371007e009900000000000000007371007e001000000000000000307400064d2f34302f327371007e009900000000000000007371007e00100000000000000032740007584c2f34342f347371007e009900000000000000007371007e0010000000000000003374000858584c2f34362f357371007e0099000000000000000071007e00a47400064c2f34322f337371007e009900000000000000007371007e0010000000000000003674000835584c2f35322f387871007e003074000554414c4c457371007e00b87371007e001c770c000000043f400000000000027371007e009900000000000000007371007e001000000000000000377400084355454c4c4f20567371007e0099000000000000000071007e00a77400084355454c4c4f204f7871007e00707400064355454c4c4f7371007e00b87371007e001c770c000000043f400000000000027371007e009900000000000000007371007e0010000000000000003a7400094d2e20434f525441537371007e0099000000000000000071007e00a17400094d2e204c41524741537871007e00667400064d414e474153787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001274000d52454d45524120484f4d425245707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e0100000004007400043939393971007e007a740001587400085469636b657420587371007e001e01000000010174000330303371007e003e740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330303671007e00667400014274000a464143545552415320427371007e001e01000000010174000330383171007e00487400014174000f5449515545204641435455524120417371007e001e01000000040074000339393871007e00527400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000331313671007e0026740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000040074000339393971007e00617400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330383271007e005c7400014274000f5449515545204641435455524120427371007e001e01000000040174000330383071007e00217400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000331313271007e002b740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303471007e00707400014174000952454349424f5320417371007e001e01000000010174000330363371007e004d7400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330303271007e0043740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330303171007e00307400014174000a464143545552415320417371007e001e01000000020174000330363471007e006b7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000331313571007e007f740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000331313371007e0039740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303971007e00757400014274000952454349424f5320427371007e001e01000000020174000330303871007e0057740001427400124e4f544153204445204352454449544f20427871007e0030740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e003074000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e003074001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
32	Carga de stock	24/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b78703ff000000000000074000752454d45524136740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427871007e0053740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e005374000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e005374001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040906800000000004089ec00000000000000000140856c51eb851eb8406b9000000000004076c75c28f5c28f4089ec0000000000409b1e28f5c28f5c40a0680000000000000000007371007e001c770c000000083f400000000000047372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e00100000000000000032740007584c2f34342f347371007e009900000000000000007371007e001000000000000000397400094d2e204c41524741537371007e009900000000000000007371007e0010000000000000003e7400044c49534f7371007e009900000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7874000b30363837343935352e786c74000a52454d414f584c4c49537371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e001000000000000001767372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0053740007497661203231257371007e00ab40350000000000000171007e0030740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005374000954617665726e69746974000652454d4552417371007e001c770c000000083f4000000000000473720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000043f400000000000027371007e0099000000000000000071007e009e7400094d2e204c41524741537371007e009900000000000000007371007e0010000000000000003a7400094d2e20434f525441537871007e00707400064d414e4741537371007e00b57371007e001c770c000000103f400000000000087371007e0099000000000000000071007e009b740007584c2f34342f347371007e009900000000000000007371007e001000000000000000317400064c2f34322f337371007e009900000000000000007371007e001000000000000000307400064d2f34302f327371007e009900000000000000007371007e0010000000000000003374000858584c2f34362f357371007e009900000000000000007371007e0010000000000000003474000833584c2f34382f367371007e009900000000000000007371007e0010000000000000003674000835584c2f35322f387371007e009900000000000000007371007e0010000000000000003574000834584c2f35302f377371007e009900000000000000007371007e0010000000000000002f740006532f33382f317871007e005374000554414c4c457371007e00b57371007e001c770c000000083f400000000000047371007e009900000000000000007371007e0010000000000000003f74000652415941444f7371007e0099000000000000000071007e00a17400044c49534f7371007e009900000000000000007371007e0010000000000000003d740007455354414d50417371007e009900000000000000007371007e0010000000000000003c740008464c4f524541444f7871007e0012740006455354494c4f7371007e00b57371007e001c770c000000203f4000000000000f7371007e009900000000000000007371007e00100000000000000022740004524f53417371007e009900000000000000007371007e0010000000000000002174000556455244457371007e009900000000000000007371007e00100000000000000023740008424f5244454155587371007e009900000000000000007371007e0010000000000000002974000743454c455354457371007e0099000000000000000071007e0070740005415a554c207371007e0099000000000000000071007e0012740004524f4a4f7371007e009900000000000000007371007e00100000000000000020740004475249537371007e009900000000000000007371007e001000000000000000257400074d4f5354415a417371007e009900000000000000007371007e0010000000000000003b74000854555251554553417371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e009900000000000000007371007e0010000000000000001f740008414d4152494c4c4f7371007e0099000000000000000071007e006b7400054e4547524f7371007e009900000000000000007371007e0010000000000000002474000542454947457371007e0099000000000000000071007e00a474000b415a554c204f534355524f7371007e009900000000000000007371007e0010000000000000001e740006424c414e434f7871007e0044740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001274000d52454d45524120484f4d425245707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303471007e00307400014174000952454349424f5320417371007e001e01000000010174000330303371007e0049740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330303171007e00537400014174000a464143545552415320417371007e001e01000000020174000331313371007e003a740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000331313271007e0026740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303271007e0044740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303671007e00707400014274000a464143545552415320427371007e001e01000000020174000331313671007e0066740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330363471007e00757400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000040074000339393971007e006b7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303871007e002b740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330383271007e007f7400014274000f5449515545204641435455524120427371007e001e01000000020174000330303971007e004e7400014274000952454349424f5320427371007e001e01000000010174000330363371007e003f7400014174000f4c49515549444143494f4e455320417371007e001e01000000040074000339393871007e00357400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330383171007e007a7400014174000f5449515545204641435455524120417371007e001e01000000040174000330383071007e00217400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000004007400043939393971007e0058740001587400085469636b657420587371007e001e01000000010174000331313571007e0061740001417400165449515545204e4f54412044452044454249544f20417871007e0053740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e005374000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e005374001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
31	Carga de stock	24/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000027704000000027372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b78703ff000000000000074000752454d45524136740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427871007e003f740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e003f74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e003f74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040906800000000004089ec00000000000000000140856c51eb851eb8406b9000000000004076c75c28f5c28f4089ec0000000000409b1e28f5c28f5c40a0680000000000000000007371007e001c770c000000083f400000000000047372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7371007e009900000000000000007371007e00100000000000000032740007584c2f34342f347371007e009900000000000000007371007e001000000000000000397400094d2e204c41524741537371007e009900000000000000007371007e0010000000000000003e7400044c49534f7874000b30363837343935352e786c74000a52454d414f584c4c49537371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e001000000000000001767372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e003f740007497661203231257371007e00ab40350000000000000171007e003a740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003f74000954617665726e69746974000652454d4552417371007e001c770c000000083f4000000000000473720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000087371007e009900000000000000007371007e0010000000000000003474000833584c2f34382f367371007e009900000000000000007371007e0010000000000000003674000835584c2f35322f387371007e009900000000000000007371007e001000000000000000307400064d2f34302f327371007e009900000000000000007371007e0010000000000000002f740006532f33382f317371007e009900000000000000007371007e001000000000000000317400064c2f34322f337371007e0099000000000000000071007e009e740007584c2f34342f347371007e009900000000000000007371007e0010000000000000003374000858584c2f34362f357371007e009900000000000000007371007e0010000000000000003574000834584c2f35302f377871007e003f74000554414c4c457371007e00b57371007e001c770c000000203f4000000000000f7371007e009900000000000000007371007e0010000000000000002174000556455244457371007e009900000000000000007371007e0010000000000000001f740008414d4152494c4c4f7371007e009900000000000000007371007e001000000000000000257400074d4f5354415a417371007e009900000000000000007371007e00100000000000000023740008424f5244454155587371007e009900000000000000007371007e0010000000000000001e740006424c414e434f7371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e0099000000000000000071007e0012740004524f4a4f7371007e009900000000000000007371007e00100000000000000020740004475249537371007e0099000000000000000071007e00267400054e4547524f7371007e009900000000000000007371007e0010000000000000003b74000854555251554553417371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e009900000000000000007371007e0010000000000000002974000743454c455354457371007e009900000000000000007371007e00100000000000000022740004524f53417371007e0099000000000000000071007e005c740005415a554c207371007e009900000000000000007371007e0010000000000000002474000542454947457871007e0049740005434f4c4f527371007e00b57371007e001c770c000000043f400000000000027371007e0099000000000000000071007e00a17400094d2e204c41524741537371007e009900000000000000007371007e0010000000000000003a7400094d2e20434f525441537871007e005c7400064d414e4741537371007e00b57371007e001c770c000000083f400000000000047371007e009900000000000000007371007e0010000000000000003f74000652415941444f7371007e009900000000000000007371007e0010000000000000003c740008464c4f524541444f7371007e0099000000000000000071007e00a47400044c49534f7371007e009900000000000000007371007e0010000000000000003d740007455354414d50417871007e0012740006455354494c4f787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001274000d52454d45524120484f4d425245707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303471007e003a7400014174000952454349424f5320417371007e001e01000000020174000331313371007e002b740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330383171007e00577400014174000f5449515545204641435455524120417371007e001e01000000020174000330383271007e00617400014274000f5449515545204641435455524120427371007e001e01000000040074000339393971007e00267400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330363471007e007a7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000331313571007e0035740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000331313671007e007f740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000331313271007e0075740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303171007e003f7400014174000a464143545552415320417371007e001e0100000004007400043939393971007e0030740001587400085469636b657420587371007e001e01000000040074000339393871007e00667400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330303271007e0049740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330303371007e006b740001417400124e4f544153204445204352454449544f20417371007e001e01000000040174000330383071007e00527400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330303971007e00707400014274000952454349424f5320427371007e001e01000000010174000330363371007e00217400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303671007e005c7400014274000a464143545552415320427371007e001e01000000020174000330303871007e0044740001427400124e4f544153204445204352454449544f20427871007e003f740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e003f74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e003f74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e49417400063434343434347400063434343434357371007e00023ff000000000000074000752454d45524136740001317371007e000b740001317400144869706f6c69746f497269676f79656e2034333671007e001274000e5275746120457869626963696f6e707371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000331313571007e0035740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303671007e005c7400014274000a464143545552415320427371007e001e01000000040074000339393871007e00667400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000331313671007e007f740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000331313371007e002b740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303871007e0044740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000330303271007e0049740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330363371007e00217400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330303471007e003a7400014174000952454349424f5320417371007e001e01000000010174000330303371007e006b740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330363471007e007a7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000331313271007e0075740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330383271007e00617400014274000f5449515545204641435455524120427371007e001e01000000010174000330303171007e003f7400014174000a464143545552415320417371007e001e01000000020174000330303971007e00707400014274000952454349424f5320427371007e001e01000000040174000330383071007e00527400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330383171007e00577400014174000f5449515545204641435455524120417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000040074000339393971007e00267400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000004007400043939393971007e0030740001587400085469636b657420587871007e003f740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e003f74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e003f74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707371007e00934092c00000000000408da00000000000000000014080bc51eb851eb8406f8000000000004076c75c28f5c28f408da00000000000409b1e28f5c28f5c40a0680000000000000000007371007e001c770c000000083f400000000000057371007e0099000000000000000071007e00a17400094d2e204c41524741537371007e0099000000000000000071007e00c57400064c2f34322f337371007e009900000000000000007371007e001000000000000000387400084355454c4c4f204f7371007e0099000000000000000071007e00a47400044c49534f7371007e0099000000000000000071007e009b74000b415a554c204f534355524f7874000a30363837343935352e6c74000952454d414f4c4c49537371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e001000000000000001757371007e00ab40350000000000000071007e003f740007497661203231257371007e00ab40350000000000000171007e003a740007497661203231257371007e00b071007e003f74000954617665726e69746974000652454d4552417371007e001c770c000000083f400000000000057371007e00b57371007e001c770c000000203f4000000000000f7371007e0099000000000000000071007e00f174000743454c455354457371007e0099000000000000000071007e00f974000542454947457371007e0099000000000000000071007e00f4740004524f53417371007e0099000000000000000071007e00d97400074d4f5354415a417371007e0099000000000000000071007e00d374000556455244457371007e0099000000000000000071007e00eb74000854555251554553417371007e0099000000000000000071007e00df740006424c414e434f7371007e0099000000000000000071007e00267400054e4547524f7371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e0099000000000000000071007e00dc740008424f5244454155587371007e0099000000000000000071007e00d6740008414d4152494c4c4f7371007e0099000000000000000071007e0012740004524f4a4f7371007e0099000000000000000071007e00e6740004475249537371007e0099000000000000000071007e005c740005415a554c207371007e0099000000000000000071007e00ee7400074d415252c3934e7871007e0049740005434f4c4f527371007e00b57371007e001c770c000000043f400000000000027371007e009900000000000000007371007e001000000000000000377400084355454c4c4f20567371007e0099000000000000000071007e01e97400084355454c4c4f204f7871007e003a7400064355454c4c4f7371007e00b57371007e001c770c000000043f400000000000027371007e0099000000000000000071007e01017400094d2e20434f525441537371007e0099000000000000000071007e00a17400094d2e204c41524741537871007e005c7400064d414e4741537371007e00b57371007e001c770c000000083f400000000000047371007e0099000000000000000071007e010f740007455354414d50417371007e0099000000000000000071007e010774000652415941444f7371007e0099000000000000000071007e00a47400044c49534f7371007e0099000000000000000071007e010a740008464c4f524541444f7871007e0012740006455354494c4f7371007e00b57371007e001c770c000000103f400000000000087371007e0099000000000000000071007e00c2740006532f33382f317371007e0099000000000000000071007e00cd74000834584c2f35302f377371007e0099000000000000000071007e00bc74000835584c2f35322f387371007e0099000000000000000071007e00bf7400064d2f34302f327371007e0099000000000000000071007e00c57400064c2f34322f337371007e0099000000000000000071007e009e740007584c2f34342f347371007e0099000000000000000071007e00ca74000858584c2f34362f357371007e0099000000000000000071007e00b974000833584c2f34382f367871007e003f74000554414c4c45787371007e011271007e001274000d52454d45524120484f4d425245707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000040174000330383071007e00527400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000331313671007e007f740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330363471007e007a7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303471007e003a7400014174000952454349424f5320417371007e001e01000000010174000331313271007e0075740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303971007e00707400014274000952454349424f5320427371007e001e01000000010174000330303371007e006b740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330363371007e00217400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303871007e0044740001427400124e4f544153204445204352454449544f20427371007e001e0100000004007400043939393971007e0030740001587400085469636b657420587371007e001e01000000020174000331313371007e002b740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000040074000339393871007e00667400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000040074000339393971007e00267400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330383271007e00617400014274000f5449515545204641435455524120427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330303271007e0049740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000331313571007e0035740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330303171007e003f7400014174000a464143545552415320417371007e001e01000000020174000330303671007e005c7400014274000a464143545552415320427371007e001e01000000010174000330383171007e00577400014174000f5449515545204641435455524120417871007e003f740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e003f74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e003f74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
30	Cambio en stock de JEAN	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e31740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e0003787001000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427871007e0075740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e007574000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e007574001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e007f7372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e00100000000000000028740005524543544f7371007e0099000000000000000071007e00397400054e4547524f7371007e0099404600000000000071007e004d707874000c30313432383638332e3033347400044a4e34347371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e0010000000000000005a7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0075740007497661203231257371007e00a540350000000000000171007e0066740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e007574000954617665726e6974697400044a45414e7371007e001c770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000043f400000000000037371007e0099000000000000000071007e0012740004526f6a6f7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e007f740004417a756c7871007e002f740005434f4c4f527371007e00af7371007e001c770c000000043f400000000000037371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e0099000000000000000071007e009b740005524543544f7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7871007e004874000543414c43457371007e00af7371007e001c770c000000083f400000000000047371007e0099000000000000000071007e002f740001537371007e0099000000000000000071007e00487400014c7371007e0099000000000000000071007e007f740004417a756c7371007e0099000000000000000071007e0066740002584c7871007e007574000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002f74000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303371007e0048740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000331313271007e007a740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000004007400043939393971007e0025740001587400085469636b657420587371007e001e01000000020174000331313371007e0034740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330383171007e004d7400014174000f5449515545204641435455524120417371007e001e01000000040074000339393871007e003e7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000040174000330383071007e00437400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000331313571007e005c740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000040074000339393971007e00397400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330383271007e006b7400014274000f5449515545204641435455524120427371007e001e01000000010174000330303171007e00757400014174000a464143545552415320417371007e001e01000000020174000330303871007e0057740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330363471007e00617400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303971007e00527400014274000952454349424f5320427371007e001e01000000020174000331313671007e0070740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330303471007e00667400014174000952454349424f5320417371007e001e01000000020174000330303671007e007f7400014274000a464143545552415320427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330363371007e002a7400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330303271007e002f740001417400114e4f5441532044452044454249544f20417871007e0075740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e007574000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e007574001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
29	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e31740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870707400154869706f6c69746f20497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000d52757461204465706f7369746f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427371007e001d0100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417371007e001d0100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d0100000001017400033030327371007e000f0000000000000002740001417400114e4f5441532044452044454249544f20417371007e001d0100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d0100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427371007e001d0100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417371007e001d0100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00934c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001b770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e000f0000000000000028740005524543544f7371007e0098000000000000000071007e00667400054e4547524f7371007e0098404600000000000071007e0025707874000c30313432383638332e3033347400044a4e34347371007e001b770c000000013f40000000000000787371007e001b770c000000013f40000000000000787371007e000f000000000000005a7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0011740007497661203231257371007e00a440350000000000000171007e002a740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001174000954617665726e6974697400044a45414e7371007e001b770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001b770c000000043f400000000000037371007e0098000000000000000071007e009a740005524543544f7371007e009800000000000000007371007e000f000000000000002674000a455854524120534c494d7371007e009800000000000000007371007e000f0000000000000027740004534c494d7871007e006174000543414c43457371007e00ae7371007e001b770c000000043f400000000000037371007e0098000000000000000071007e005c740004417a756c7371007e0098000000000000000071007e0057740004526f6a6f7371007e009800000000000000007371007e000f000000000000002a7400074d415252c3934e7871007e0043740005434f4c4f527371007e00ae7371007e001b770c000000083f400000000000047371007e0098000000000000000071007e00617400014c7371007e0098000000000000000071007e005c740004417a756c7371007e0098000000000000000071007e002a740002584c7371007e0098000000000000000071007e0043740001537871007e001174000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004374000850616e74616c6f6e707371007e001b770c000000013f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000040074000339393871007e00347400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d0100000004007400043939393971007e003e740001587400085469636b657420587371007e001d01000000020174000330303871007e0020740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000331313371007e004d740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000020174000331313671007e0039740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000010174000331313571007e006b740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000040074000339393971007e00667400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000330363371007e00487400014174000f4c49515549444143494f4e455320417371007e001d01000000010174000330303471007e002a7400014174000952454349424f5320417371007e001d01000000010174000330303371007e0061740001417400124e4f544153204445204352454449544f20417371007e001d01000000010174000331313271007e0052740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000020174000330303671007e005c7400014274000a464143545552415320427371007e001d01000000020174000330303971007e002f7400014274000952454349424f5320427371007e001d01000000020174000330303771007e0057740001427400114e4f5441532044452044454249544f20427371007e001d01000000010174000330303271007e0043740001417400114e4f5441532044452044454249544f20417371007e001d01000000010174000330383171007e00257400014174000f5449515545204641435455524120417371007e001d01000000020174000330383271007e007e7400014274000f5449515545204641435455524120427371007e001d01000000020174000330363471007e00707400014274000f4c49515549444143494f4e455320427371007e001d01000000040174000330383071007e00757400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
10	Cambio en stock de Jean Taverniti Azul	12/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787000000000000000007400144a65616e2054617665726e69746920417a756c36740001337372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427871007e0066740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e006674000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e006674001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00447372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001c770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001c770c000000013f40000000000000787371007e001c770c000000013f400000000000007871007e00667372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0066740007497661203231257371007e009d40350000000000000171007e002b740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006674000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001c770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004474000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303471007e002b7400014174000952454349424f5320417371007e001e01000000020174000330303971007e007f7400014274000952454349424f5320427371007e001e01000000020174000331313671007e0075740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040174000330383071007e006b7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000040074000339393871007e005c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000331313571007e0053740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330383271007e00357400014274000f5449515545204641435455524120427371007e001e01000000010174000330303271007e0044740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330383171007e007a7400014174000f5449515545204641435455524120417371007e001e01000000010174000330363371007e003f7400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330303171007e00667400014174000a464143545552415320417371007e001e01000000020174000331313371007e003a740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303371007e0061740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000331313271007e0070740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303871007e0049740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330303671007e00217400014274000a464143545552415320427371007e001e01000000020174000330363471007e00307400014274000f4c49515549444143494f4e455320427371007e001e01000000040074000339393971007e00267400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000004007400043939393971007e004e740001587400085469636b657420587871007e0066740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e006674000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e006674001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
9	Cambio en stock de Jean Taverniti Azul	12/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787000000000000000007400144a65616e2054617665726e69746920417a756c31740001337372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870707400154869706f6c69746f20497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000d52757461204465706f7369746f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427371007e001d0100000001017400033030327371007e000f0000000000000002740001417400114e4f5441532044452044454249544f20417371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d0100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001d0100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427371007e001d0100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d0100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427371007e001d0100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427371007e001d0100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00117372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00934c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001b770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001b770c000000013f40000000000000787371007e001b770c000000013f400000000000007871007e00117372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0011740007497661203231257371007e009c40350000000000000171007e0042740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001174000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001b770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003874000850616e74616c6f6e707371007e001b770c000000013f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000010174000330383171007e00517400014174000f5449515545204641435455524120417371007e001d01000000020174000331313371007e005b740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000010174000330303371007e006f740001417400124e4f544153204445204352454449544f20417371007e001d01000000040074000339393971007e00657400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000020174000331313671007e004c740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000020174000330383271007e00337400014274000f5449515545204641435455524120427371007e001d01000000020174000330363471007e00567400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000331313571007e0047740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000010174000330363371007e00257400014174000f4c49515549444143494f4e455320417371007e001d01000000020174000330303971007e00797400014274000952454349424f5320427371007e001d01000000040174000330383071007e003d7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000330303471007e00427400014174000952454349424f5320417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000020174000330303671007e00607400014274000a464143545552415320427371007e001d01000000010174000331313271007e007e740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000020174000330303871007e006a740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000330303771007e0074740001427400114e4f5441532044452044454249544f20427371007e001d01000000010174000330303271007e0038740001417400114e4f5441532044452044454249544f20417371007e001d0100000004007400043939393971007e002e740001587400085469636b657420587371007e001d01000000040074000339393871007e00207400024e587400114e6f74612064652064c3a96269746f20787871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
8	Migración de productos	12/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040140000000000007400144a65616e2054617665726e69746920417a756c31740001337372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870707400154869706f6c69746f20497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000d52757461204465706f7369746f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417371007e001d0100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d0100000001017400033030327371007e000f0000000000000002740001417400114e4f5441532044452044454249544f20417371007e001d0100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427371007e001d0100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d0100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417371007e001d0100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d0100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427371007e001d0100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00117372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00934c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001b770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001b770c000000013f40000000000000787371007e001b770c000000013f400000000000007871007e00117372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0011740007497661203231257371007e009c40350000000000000171007e0066740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001174000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001b770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003474000850616e74616c6f6e707371007e001b770c000000013f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000040174000330383071007e00577400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000020174000330303671007e00797400014274000a464143545552415320427371007e001d01000000020174000330303971007e00257400014274000952454349424f5320427371007e001d01000000010174000331313571007e0061740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000010174000331313271007e0052740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330303471007e00667400014174000952454349424f5320417371007e001d01000000020174000330363471007e00397400014274000f4c49515549444143494f4e455320427371007e001d01000000020174000330383271007e003e7400014274000f5449515545204641435455524120427371007e001d01000000020174000331313671007e0070740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000010174000330383171007e00437400014174000f5449515545204641435455524120417371007e001d01000000020174000330303771007e002a740001427400114e4f5441532044452044454249544f20427371007e001d01000000040074000339393971007e00487400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000020174000330303871007e007e740001427400124e4f544153204445204352454449544f20427371007e001d01000000010174000330303271007e0034740001417400114e4f5441532044452044454249544f20417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000010174000330303371007e0020740001417400124e4f544153204445204352454449544f20417371007e001d01000000040074000339393871007e005c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000020174000331313371007e006b740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000010174000330363371007e004d7400014174000f4c49515549444143494f4e455320417371007e001d0100000004007400043939393971007e002f740001587400085469636b657420587871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
7	Movimiento masivo de stock entre depósitos	12/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040140000000000007400144a65616e2054617665726e69746920417a756c31740001337372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537871007e002b740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e002b74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e002b74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e002b7372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001c770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001c770c000000013f40000000000000787371007e001c770c000000013f400000000000007871007e002b7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e002b740007497661203231257371007e009d40350000000000000171007e007a740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002b74000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001c770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003574000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000040074000339393971007e00497400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000331313371007e0030740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303171007e002b7400014174000a464143545552415320417371007e001e01000000020174000330383271007e006b7400014274000f5449515545204641435455524120427371007e001e01000000020174000331313671007e005d740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040074000339393871007e003a7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330303271007e0035740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303971007e00267400014274000952454349424f5320427371007e001e01000000010174000330303371007e004e740001417400124e4f544153204445204352454449544f20417371007e001e01000000040174000330383071007e007f7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000331313571007e0053740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303871007e0075740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330363471007e003f7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303471007e007a7400014174000952454349424f5320417371007e001e01000000020174000330303671007e00587400014274000a464143545552415320427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330383171007e00627400014174000f5449515545204641435455524120417371007e001e01000000010174000330363371007e00707400014174000f4c49515549444143494f4e455320417371007e001e0100000004007400043939393971007e0044740001587400085469636b657420587371007e001e01000000010174000331313271007e0021740001417400175449515545204e4f5441204445204352454449544f20417871007e002b740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e002b74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e002b74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
6	Migración de productos	12/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040140000000000007400144a65616e2054617665726e69746920417a756c31740001337372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870707400154869706f6c69746f20497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000d52757461204465706f7369746f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d0100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d0100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417371007e001d0100000001017400033030327371007e000f0000000000000002740001417400114e4f5441532044452044454249544f20417371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417371007e001d0100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d0100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427371007e001d0100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427371007e001d0100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427371007e001d0100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00117372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00934c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001b770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001b770c000000013f40000000000000787371007e001b770c000000013f400000000000007871007e00117372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0011740007497661203231257371007e009c40350000000000000171007e0047740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001174000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001b770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004274000850616e74616c6f6e707371007e001b770c000000013f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000020174000330303871007e005b740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000330303671007e002f7400014274000a464143545552415320427371007e001d01000000020174000330303971007e00517400014274000952454349424f5320427371007e001d01000000020174000330363471007e002a7400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000331313571007e007e740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000010174000330303271007e0042740001417400114e4f5441532044452044454249544f20417371007e001d01000000020174000330383271007e00567400014274000f5449515545204641435455524120427371007e001d01000000020174000330303771007e006f740001427400114e4f5441532044452044454249544f20427371007e001d01000000040174000330383071007e00657400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000330383171007e00257400014174000f5449515545204641435455524120417371007e001d01000000020174000331313671007e0060740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000040074000339393871007e006a7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000004007400043939393971007e0034740001587400085469636b657420587371007e001d01000000010174000330363371007e00747400014174000f4c49515549444143494f4e455320417371007e001d01000000010174000331313271007e0079740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330303371007e003d740001417400124e4f544153204445204352454449544f20417371007e001d01000000010174000330303471007e00477400014174000952454349424f5320417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000020174000331313371007e004c740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000040074000339393971007e00207400024e587400124e6f7461206465206372c3a96469746f20787871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
5	Migración de productos	12/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040140000000000007400144a65616e2054617665726e69746920417a756c31740001337372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417871007e004d740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e004d74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e004d74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e004d7372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001c770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001c770c000000013f40000000000000787371007e001c770c000000013f400000000000007871007e004d7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e004d740007497661203231257371007e009d40350000000000000171007e0075740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004d74000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001c770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003974000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000331313671007e0057740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330303371007e0066740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330383271007e00617400014274000f5449515545204641435455524120427371007e001e01000000020174000330303871007e003e740001427400124e4f544153204445204352454449544f20427371007e001e01000000040074000339393971007e00707400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000004007400043939393971007e0043740001587400085469636b657420587371007e001e01000000010174000330383171007e006b7400014174000f5449515545204641435455524120417371007e001e01000000020174000331313371007e005c740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000040174000330383071007e00347400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330363471007e00487400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303471007e00757400014174000952454349424f5320417371007e001e01000000010174000330363371007e00267400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330303171007e004d7400014174000a464143545552415320417371007e001e01000000010174000330303271007e0039740001417400114e4f5441532044452044454249544f20417371007e001e01000000040074000339393871007e002b7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000331313271007e0021740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303671007e00527400014274000a464143545552415320427371007e001e01000000020174000330303971007e007a7400014274000952454349424f5320427371007e001e01000000010174000331313571007e007f740001417400165449515545204e4f54412044452044454249544f20417871007e004d740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004d74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e004d74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
4	Migración de productos	12/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040140000000000007400144a65616e2054617665726e69746920417a756c31740001337372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417871007e007a740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e007a74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e007a74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e007a7372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001c770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001c770c000000013f40000000000000787371007e001c770c000000013f400000000000007871007e007a7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e007a740007497661203231257371007e009d40350000000000000171007e0030740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e007a74000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001c770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005d74000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303471007e00307400014174000952454349424f5320417371007e001e01000000010174000330303171007e007a7400014174000a464143545552415320417371007e001e01000000040074000339393871007e00447400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000331313671007e003f740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040174000330383071007e00267400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000331313271007e007f740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330303871007e0075740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330383271007e00627400014274000f5449515545204641435455524120427371007e001e01000000010174000330383171007e00587400014174000f5449515545204641435455524120417371007e001e01000000010174000330303371007e003a740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000331313371007e0049740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330363471007e00357400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303271007e005d740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303671007e004e7400014274000a464143545552415320427371007e001e01000000020174000330303971007e00217400014274000952454349424f5320427371007e001e0100000004007400043939393971007e002b740001587400085469636b657420587371007e001e01000000040074000339393971007e00707400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000331313571007e0067740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330363371007e00537400014174000f4c49515549444143494f4e455320417871007e007a740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e007a74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e007a74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
3	Migración de productos	12/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040140000000000007400144a65616e2054617665726e69746920417a756c31740001337372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870707400154869706f6c69746f20497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000d52757461204465706f7369746f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d0100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417371007e001d0100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d0100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d0100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427371007e001d0100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d0100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427371007e001d0100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417371007e001d0100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d0100000001017400033030327371007e000f0000000000000002740001417400114e4f5441532044452044454249544f20417371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00117372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00934c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001b770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001b770c000000013f40000000000000787371007e001b770c000000013f400000000000007871007e00117372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0011740007497661203231257371007e009c40350000000000000171007e0047740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001174000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001b770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e007974000850616e74616c6f6e707371007e001b770c000000013f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000040074000339393971007e004c7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000020174000330363471007e00207400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000331313571007e0042740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000330303871007e005b740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000330303971007e00657400014274000952454349424f5320427371007e001d01000000010174000330363371007e00607400014174000f4c49515549444143494f4e455320417371007e001d01000000010174000330303471007e00477400014174000952454349424f5320417371007e001d01000000010174000331313271007e003d740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000020174000331313671007e0056740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000010174000330383171007e002e7400014174000f5449515545204641435455524120417371007e001d01000000020174000330383271007e006a7400014274000f5449515545204641435455524120427371007e001d01000000040174000330383071007e00387400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000330303271007e0079740001417400114e4f5441532044452044454249544f20417371007e001d01000000020174000331313371007e0074740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000020174000330303771007e0025740001427400114e4f5441532044452044454249544f20427371007e001d01000000020174000330303671007e007e7400014274000a464143545552415320427371007e001d01000000040074000339393871007e00337400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000010174000330303371007e006f740001417400124e4f544153204445204352454449544f20417371007e001d0100000004007400043939393971007e0051740001587400085469636b657420587871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
2	Migración de productos	12/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040140000000000007400144a65616e2054617665726e69746920417a756c31740001337372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e004974000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00497372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001c770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001c770c000000013f40000000000000787371007e001c770c000000013f400000000000007871007e00497372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0049740007497661203231257371007e009d40350000000000000171007e0044740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004974000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001c770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006774000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e0100000004007400043939393971007e0062740001587400085469636b657420587371007e001e01000000010174000330303271007e0067740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303971007e00587400014274000952454349424f5320427371007e001e01000000040074000339393871007e002b7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330303471007e00447400014174000952454349424f5320417371007e001e01000000020174000331313671007e0026740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040074000339393971007e00537400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330303371007e003a740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000331313271007e004e740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040174000330383071007e007b7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330303871007e0071740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000330383171007e006c7400014174000f5449515545204641435455524120417371007e001e01000000020174000330383271007e005d7400014274000f5449515545204641435455524120427371007e001e01000000010174000330303171007e00497400014174000a464143545552415320417371007e001e01000000020174000330303671007e00357400014274000a464143545552415320427371007e001e01000000020174000331313371007e0076740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330363371007e003f7400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330363471007e00307400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000331313571007e0021740001417400165449515545204e4f54412044452044454249544f20417871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004974000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
1	Carga de stock	12/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000027704000000027372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040140000000000007400144a65616e2054617665726e69746920417a756c31740001337372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870707400154869706f6c69746f20497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000d52757461204465706f7369746f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d0100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d0100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d0100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001d0100000001017400033030327371007e000f0000000000000002740001417400114e4f5441532044452044454249544f20417371007e001d0100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417371007e001d0100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001d0100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427371007e001d0100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00934c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001b770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001b770c000000013f40000000000000787371007e001b770c000000013f400000000000007871007e00117372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0011740007497661203231257371007e009c40350000000000000171007e007e740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001174000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001b770c000000013f40000000000000787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006074000850616e74616c6f6e707371007e001b770c000000013f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000020174000330303771007e002f740001427400114e4f5441532044452044454249544f20427371007e001d01000000020174000330383271007e00517400014274000f5449515545204641435455524120427371007e001d01000000010174000331313271007e005b740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330383171007e002a7400014174000f5449515545204641435455524120417371007e001d01000000040074000339393871007e006f7400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000010174000330303371007e0065740001417400124e4f544153204445204352454449544f20417371007e001d01000000040074000339393971007e00797400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000330363371007e00257400014174000f4c49515549444143494f4e455320417371007e001d01000000020174000330303971007e00427400014274000952454349424f5320427371007e001d01000000020174000330303671007e00397400014274000a464143545552415320427371007e001d01000000010174000331313571007e004c740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000040174000330383071007e00567400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000004007400043939393971007e0034740001587400085469636b657420587371007e001d01000000010174000330303471007e007e7400014174000952454349424f5320417371007e001d01000000020174000330303871007e0074740001427400124e4f544153204445204352454449544f20427371007e001d01000000010174000330303271007e0060740001417400114e4f5441532044452044454249544f20417371007e001d01000000020174000331313371007e0047740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000020174000331313671007e0020740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000020174000330363471007e006a7400014274000f4c49515549444143494f4e455320427871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e49417400063434343434347400063434343434357371007e000240140000000000007400144a65616e2054617665726e69746920417a756c36740001337371007e000b740001317400144869706f6c69746f497269676f79656e2034333671007e002f74000e5275746120457869626963696f6e707371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000020174000331313671007e0020740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000020174000330303771007e002f740001427400114e4f5441532044452044454249544f20427371007e001d01000000020174000330303871007e0074740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000331313371007e0047740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000020174000330303671007e00397400014274000a464143545552415320427371007e001d01000000010174000330303271007e0060740001417400114e4f5441532044452044454249544f20417371007e001d01000000020174000330383271007e00517400014274000f5449515545204641435455524120427371007e001d0100000004007400043939393971007e0034740001587400085469636b657420587371007e001d01000000010174000330383171007e002a7400014174000f5449515545204641435455524120417371007e001d01000000040174000330383071007e00567400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000010174000331313571007e004c740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000330363471007e006a7400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000330303371007e0065740001417400124e4f544153204445204352454449544f20417371007e001d01000000040074000339393971007e00797400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000331313271007e005b740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330303471007e007e7400014174000952454349424f5320417371007e001d01000000020174000330303971007e00427400014274000952454349424f5320427371007e001d01000000010174000330363371007e00257400014174000f4c49515549444143494f4e455320417371007e001d01000000040074000339393871007e006f7400024e587400114e6f74612064652064c3a96269746f20787871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707371007e0092409f4000000000004098b0000000000000000001404e000000000000407a40000000000040850000000000004098b0000000000040a900000000000040ae400000000000000000007371007e001b770c000000013f400000000000007874000c31303333353533362e30303874000531303333357371007e001b770c000000013f40000000000000787371007e001b770c000000013f400000000000007871007e00117371007e009c40350000000000000071007e0011740007497661203231257371007e009c40350000000000000171007e007e740007497661203231257371007e00a171007e001174000954617665726e6974697400134a65616e2054617665726e69746920417a756c7371007e001b770c000000013f40000000000000787371007e00a671007e006074000850616e74616c6f6e707371007e001b770c000000013f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000040074000339393971007e00797400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000331313271007e005b740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000020174000330303971007e00427400014274000952454349424f5320427371007e001d01000000020174000331313371007e0047740001427400175449515545204e4f5441204445204352454449544f20427371007e001d0100000004007400043939393971007e0034740001587400085469636b657420587371007e001d01000000020174000330303771007e002f740001427400114e4f5441532044452044454249544f20427371007e001d01000000010174000330303471007e007e7400014174000952454349424f5320417371007e001d01000000020174000330363471007e006a7400014274000f4c49515549444143494f4e455320427371007e001d01000000040174000330383071007e00567400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000330383171007e002a7400014174000f5449515545204641435455524120417371007e001d01000000010174000331313571007e004c740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000331313671007e0020740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000010174000330363371007e00257400014174000f4c49515549444143494f4e455320417371007e001d01000000010174000330303271007e0060740001417400114e4f5441532044452044454249544f20417371007e001d01000000040074000339393871007e006f7400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000020174000330303871007e0074740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000330303671007e00397400014274000a464143545552415320427371007e001d01000000020174000330383271007e00517400014274000f5449515545204641435455524120427371007e001d01000000010174000330303371007e0065740001417400124e4f544153204445204352454449544f20417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
28	Cambio en stock de JEAN	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787871007e0030740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e003074000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e003074001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00587372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e00100000000000000028740005524543544f7371007e0099404600000000000071007e004e707371007e0099000000000000000071007e007f7400054e4547524f7874000c30313432383638332e3033347400044a4e34347371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e0010000000000000005a7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0030740007497661203231257371007e00a540350000000000000171007e0058740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003074000954617665726e6974697400044a45414e7371007e001c770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000083f400000000000047371007e0099000000000000000071007e0075740001537371007e0099000000000000000071007e0035740004417a756c7371007e0099000000000000000071007e007a7400014c7371007e0099000000000000000071007e0058740002584c7871007e003074000554414c4c457371007e00af7371007e001c770c000000043f400000000000037371007e0099000000000000000071007e0012740004526f6a6f7371007e0099000000000000000071007e0035740004417a756c7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7871007e0075740005434f4c4f527371007e00af7371007e001c770c000000043f400000000000037371007e0099000000000000000071007e009b740005524543544f7371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7871007e007a74000543414c4345787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e007574000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303371007e007a740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330383171007e004e7400014174000f5449515545204641435455524120417371007e001e01000000010174000331313571007e003a740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303871007e003f740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000330303271007e0075740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000331313271007e0067740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000331313671007e0021740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040074000339393971007e007f7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000040174000330383071007e005d7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000040074000339393871007e00707400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330383271007e00447400014274000f5449515545204641435455524120427371007e001e01000000010174000330363371007e00627400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330303471007e00587400014174000952454349424f5320417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330363471007e00267400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000331313371007e0049740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303171007e00307400014174000a464143545552415320417371007e001e01000000020174000330303971007e00537400014274000952454349424f5320427371007e001e0100000004007400043939393971007e002b740001587400085469636b657420587371007e001e01000000020174000330303671007e00357400014274000a464143545552415320427871007e0030740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e003074000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e003074001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
27	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417871007e0043740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e004374000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e004374001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870000000000000000071007e00667400054e4547524f7371007e009900000000000000007371007e00100000000000000028740005524543544f7371007e0099404600000000000071007e0021707874000c30313432383638332e3033347400044a4e34347371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e0010000000000000005a7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0043740007497661203231257371007e00a540350000000000000171007e0061740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004374000954617665726e6974697400044a45414e7371007e001c770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000083f400000000000047371007e0099000000000000000071007e0061740002584c7371007e0099000000000000000071007e0052740004417a756c7371007e0099000000000000000071007e007f7400014c7371007e0099000000000000000071007e0075740001537871007e004374000554414c4c457371007e00af7371007e001c770c000000043f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e0099000000000000000071007e009d740005524543544f7371007e009900000000000000007371007e00100000000000000027740004534c494d7871007e007f74000543414c43457371007e00af7371007e001c770c000000043f400000000000037371007e0099000000000000000071007e0052740004417a756c7371007e0099000000000000000071007e0012740004526f6a6f7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7871007e0075740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e007574000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000040074000339393971007e00667400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000331313371007e005c740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303371007e007f740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330363371007e00577400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000331313671007e003a740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040174000330383071007e002b7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330303471007e00617400014174000952454349424f5320417371007e001e01000000020174000330303971007e00707400014274000952454349424f5320427371007e001e01000000010174000330383171007e00217400014174000f5449515545204641435455524120417371007e001e01000000020174000330383271007e00487400014274000f5449515545204641435455524120427371007e001e01000000010174000331313571007e004d740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330303271007e0075740001417400114e4f5441532044452044454249544f20417371007e001e0100000004007400043939393971007e006b740001587400085469636b657420587371007e001e01000000020174000330363471007e00267400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303171007e00437400014174000a464143545552415320417371007e001e01000000010174000331313271007e007a740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303671007e00527400014274000a464143545552415320427371007e001e01000000040074000339393871007e00307400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330303871007e0035740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427871007e0043740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004374000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e004374001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
37	Carga de stock	11/03/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b7870400000000000000074000d31313438363233372e30333636740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427871007e0053740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e005374000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e005374001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e49412052555441740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7371007e009900000000000000007371007e0010000000000000003374000858584c2f34362f357874000c31313438363233372e3033367400054a414f34367371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e001000000000000003237372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0053740007497661203231257371007e00a840350000000000000171007e007a740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005374000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000037371007e009900000000000000007371007e00100000000000000028740005524543544f7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e0099000000000000000071007e009b740004534c494d7871007e002674000543414c43457371007e00b27371007e001c770c000000103f400000000000087371007e009900000000000000007371007e00100000000000000032740007584c2f34342f347371007e009900000000000000007371007e001000000000000000317400064c2f34322f337371007e009900000000000000007371007e0010000000000000003474000833584c2f34382f367371007e009900000000000000007371007e001000000000000000307400064d2f34302f327371007e0099000000000000000071007e00a174000858584c2f34362f357371007e009900000000000000007371007e0010000000000000003674000835584c2f35322f387371007e009900000000000000007371007e0010000000000000003574000834584c2f35302f377371007e009900000000000000007371007e0010000000000000002f740006532f33382f317871007e005374000554414c4c457371007e00b27371007e001c770c000000203f4000000000000f7371007e009900000000000000007371007e0010000000000000002974000743454c455354457371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e00707400054e4547524f7371007e009900000000000000007371007e00100000000000000022740004524f53417371007e009900000000000000007371007e00100000000000000023740008424f5244454155587371007e009900000000000000007371007e00100000000000000020740004475249537371007e009900000000000000007371007e0010000000000000001e740006424c414e434f7371007e009900000000000000007371007e0010000000000000002474000542454947457371007e009900000000000000007371007e0010000000000000001f740008414d4152494c4c4f7371007e0099000000000000000071007e0012740004524f4a4f7371007e009900000000000000007371007e0010000000000000002174000556455244457371007e009900000000000000007371007e001000000000000000257400074d4f5354415a417371007e0099000000000000000071007e007f740005415a554c207371007e0099000000000000000071007e009e74000b415a554c204f534355524f7371007e009900000000000000007371007e0010000000000000003b74000854555251554553417871007e003f740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003f74000f50414e54414c4f4e20484f4d425245707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000331313371007e0030740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330383271007e00357400014274000f5449515545204641435455524120427371007e001e01000000020174000331313671007e003a740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000004007400043939393971007e0058740001587400085469636b657420587371007e001e01000000020174000330303671007e007f7400014274000a464143545552415320427371007e001e01000000020174000330303971007e006b7400014274000952454349424f5320427371007e001e01000000010174000331313571007e0049740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000331313271007e0066740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303471007e007a7400014174000952454349424f5320417371007e001e01000000020174000330303871007e0061740001427400124e4f544153204445204352454449544f20427371007e001e01000000040074000339393971007e00707400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000040174000330383071007e004e7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330363471007e002b7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303371007e0026740001417400124e4f544153204445204352454449544f20417371007e001e01000000040074000339393871007e00447400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330383171007e00757400014174000f5449515545204641435455524120417371007e001e01000000010174000330303171007e00537400014174000a464143545552415320417371007e001e01000000010174000330303271007e003f740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330363371007e00217400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427871007e0053740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e005374000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e005374001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e4941205255544174000634343434343474000634343434343578	Administrador Casa Sonia	1
38	Carga de stock	11/03/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b7870400000000000000074000d31313438363233372e30333436740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417871007e002b740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e002b74000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e002b74001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e49412052555441740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e00100000000000000032740007584c2f34342f347874000c31313438363233372e3033347400054a414f34347371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e001000000000000003227372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e002b740007497661203231257371007e00a840350000000000000171007e0053740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002b74000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000087371007e009900000000000000007371007e0010000000000000003574000834584c2f35302f377371007e009900000000000000007371007e0010000000000000003474000833584c2f34382f367371007e0099000000000000000071007e00a1740007584c2f34342f347371007e009900000000000000007371007e0010000000000000003674000835584c2f35322f387371007e009900000000000000007371007e001000000000000000307400064d2f34302f327371007e009900000000000000007371007e001000000000000000317400064c2f34322f337371007e009900000000000000007371007e0010000000000000002f740006532f33382f317371007e009900000000000000007371007e0010000000000000003374000858584c2f34362f357871007e002b74000554414c4c457371007e00b27371007e001c770c000000203f4000000000000f7371007e009900000000000000007371007e0010000000000000002174000556455244457371007e009900000000000000007371007e001000000000000000257400074d4f5354415a417371007e009900000000000000007371007e00100000000000000023740008424f5244454155587371007e009900000000000000007371007e0010000000000000002474000542454947457371007e0099000000000000000071007e00267400054e4547524f7371007e0099000000000000000071007e0044740005415a554c207371007e009900000000000000007371007e0010000000000000003b74000854555251554553417371007e0099000000000000000071007e0012740004524f4a4f7371007e009900000000000000007371007e0010000000000000001f740008414d4152494c4c4f7371007e009900000000000000007371007e0010000000000000001e740006424c414e434f7371007e009900000000000000007371007e00100000000000000022740004524f53417371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e009900000000000000007371007e0010000000000000002974000743454c455354457371007e009900000000000000007371007e00100000000000000020740004475249537871007e0071740005434f4c4f527371007e00b27371007e001c770c000000103f400000000000037371007e0099000000000000000071007e009e740004534c494d7371007e009900000000000000007371007e00100000000000000028740005524543544f7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7871007e007f74000543414c4345787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e007174000f50414e54414c4f4e20484f4d425245707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000331313671007e005d740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330303371007e007f740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330303171007e002b7400014174000a464143545552415320417371007e001e01000000040074000339393971007e00267400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330303271007e0071740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330303471007e00537400014174000952454349424f5320417371007e001e01000000020174000330363471007e004e7400014274000f4c49515549444143494f4e455320427371007e001e0100000004007400043939393971007e0062740001587400085469636b657420587371007e001e01000000010174000331313571007e0030740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330383271007e00217400014274000f5449515545204641435455524120427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000331313271007e0058740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040074000339393871007e003f7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330303671007e00447400014274000a464143545552415320427371007e001e01000000040174000330383071007e00357400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330303971007e00677400014274000952454349424f5320427371007e001e01000000010174000330363371007e00497400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303871007e003a740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000331313371007e0076740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330383171007e006c7400014174000f5449515545204641435455524120417871007e002b740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e002b74000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e002b74001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e4941205255544174000634343434343474000634343434343578	Administrador Casa Sonia	1
39	Carga de stock	11/03/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000037704000000037372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b7870400000000000000074000d31313438363233372e30323836740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e004974000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e49412052555441740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e0010000000000000002f740006532f33382f317874000c31313438363233372e3032387400054a414f33387371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000031f7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0049740007497661203231257371007e00a840350000000000000171007e0026740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004974000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000203f4000000000000f7371007e009900000000000000007371007e00100000000000000022740004524f53417371007e009900000000000000007371007e00100000000000000023740008424f5244454155587371007e009900000000000000007371007e0010000000000000002474000542454947457371007e0099000000000000000071007e006b7400054e4547524f7371007e009900000000000000007371007e0010000000000000001e740006424c414e434f7371007e009900000000000000007371007e00100000000000000020740004475249537371007e009900000000000000007371007e0010000000000000003b74000854555251554553417371007e0099000000000000000071007e0012740004524f4a4f7371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e0099000000000000000071007e0057740005415a554c207371007e009900000000000000007371007e0010000000000000001f740008414d4152494c4c4f7371007e009900000000000000007371007e0010000000000000002174000556455244457371007e009900000000000000007371007e001000000000000000257400074d4f5354415a417371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e009900000000000000007371007e0010000000000000002974000743454c455354457871007e005c740005434f4c4f527371007e00b27371007e001c770c000000103f400000000000087371007e009900000000000000007371007e0010000000000000003574000834584c2f35302f377371007e009900000000000000007371007e001000000000000000307400064d2f34302f327371007e009900000000000000007371007e0010000000000000003474000833584c2f34382f367371007e009900000000000000007371007e001000000000000000317400064c2f34322f337371007e009900000000000000007371007e0010000000000000003674000835584c2f35322f387371007e0099000000000000000071007e00a1740006532f33382f317371007e009900000000000000007371007e00100000000000000032740007584c2f34342f347371007e009900000000000000007371007e0010000000000000003374000858584c2f34362f357871007e004974000554414c4c457371007e00b27371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e0099000000000000000071007e009e740004534c494d7371007e009900000000000000007371007e00100000000000000028740005524543544f7871007e003574000543414c4345787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005c74000f50414e54414c4f4e20484f4d425245707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330383271007e00307400014274000f5449515545204641435455524120427371007e001e01000000040074000339393971007e006b7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330383171007e003f7400014174000f5449515545204641435455524120417371007e001e01000000010174000331313271007e003a740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303871007e004e740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000330303371007e0035740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000331313571007e0070740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000331313671007e0066740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000331313371007e0061740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303471007e00267400014174000952454349424f5320417371007e001e01000000040174000330383071007e002b7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330303271007e005c740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330363371007e00757400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330363471007e00217400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303171007e00497400014174000a464143545552415320417371007e001e0100000004007400043939393971007e007a740001587400085469636b657420587371007e001e01000000040074000339393871007e007f7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330303671007e00577400014274000a464143545552415320427371007e001e01000000020174000330303971007e00447400014274000952454349424f5320427871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004974000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357371007e0002400000000000000074000d31313438363233372e30333036740001317371007e000b740001317400144869706f6c69746f497269676f79656e2034333671007e001274000e5275746120457869626963696f6e707371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000331313371007e0061740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303271007e005c740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330363471007e00217400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303371007e0035740001417400124e4f544153204445204352454449544f20417371007e001e0100000004007400043939393971007e007a740001587400085469636b657420587371007e001e01000000010174000331313571007e0070740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000040074000339393871007e007f7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000331313671007e0066740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330363371007e00757400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303971007e00447400014274000952454349424f5320427371007e001e01000000010174000330303171007e00497400014174000a464143545552415320417371007e001e01000000010174000330383171007e003f7400014174000f5449515545204641435455524120417371007e001e01000000020174000330383271007e00307400014274000f5449515545204641435455524120427371007e001e01000000010174000330303471007e00267400014174000952454349424f5320417371007e001e01000000020174000330303871007e004e740001427400124e4f544153204445204352454449544f20427371007e001e01000000040074000339393971007e006b7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303671007e00577400014274000a464143545552415320427371007e001e01000000040174000330383071007e002b7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000331313271007e003a740001417400175449515545204e4f5441204445204352454449544f20417871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004974000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e49412052555441740006343434343434740006343434343435740006343231343435707371007e009340a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000103f400000000000037371007e0099000000000000000071007e00e57400064d2f34302f327371007e0099000000000000000071007e009e740004534c494d7371007e0099000000000000000071007e009b74000b415a554c204f534355524f7874000c31313438363233372e3033307400054a414f34307371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e001000000000000003207371007e00a840350000000000000071007e0049740007497661203231257371007e00a840350000000000000171007e0026740007497661203231257371007e00ad71007e004974000954617665726e6974697400044a45414e7371007e001c770c000000103f400000000000037371007e00b27371007e001c770c000000203f4000000000000f7371007e0099000000000000000071007e00b9740008424f5244454155587371007e0099000000000000000071007e00dc74000743454c455354457371007e0099000000000000000071007e00d67400074d4f5354415a417371007e0099000000000000000071007e0057740005415a554c207371007e0099000000000000000071007e00c1740006424c414e434f7371007e0099000000000000000071007e00bc74000542454947457371007e0099000000000000000071007e00d374000556455244457371007e0099000000000000000071007e0012740004524f4a4f7371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e0099000000000000000071007e00d0740008414d4152494c4c4f7371007e0099000000000000000071007e00d97400074d415252c3934e7371007e0099000000000000000071007e006b7400054e4547524f7371007e0099000000000000000071007e00b6740004524f53417371007e0099000000000000000071007e00c4740004475249537371007e0099000000000000000071007e00c774000854555251554553417871007e005c740005434f4c4f527371007e00b27371007e001c770c000000103f400000000000087371007e0099000000000000000071007e00a1740006532f33382f317371007e0099000000000000000071007e00eb7400064c2f34322f337371007e0099000000000000000071007e00e57400064d2f34302f327371007e0099000000000000000071007e00e874000833584c2f34382f367371007e0099000000000000000071007e00e274000834584c2f35302f377371007e0099000000000000000071007e00f3740007584c2f34342f347371007e0099000000000000000071007e00f674000858584c2f34362f357371007e0099000000000000000071007e00ee74000835584c2f35322f387871007e004974000554414c4c457371007e00b27371007e001c770c000000103f400000000000037371007e0099000000000000000071007e0101740005524543544f7371007e0099000000000000000071007e00fc74000a455854524120534c494d7371007e0099000000000000000071007e009e740004534c494d7871007e003574000543414c4345787371007e010471007e005c74000f50414e54414c4f4e20484f4d425245707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000040174000330383071007e002b7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000040074000339393871007e007f7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330303871007e004e740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000331313671007e0066740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000331313571007e0070740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330303471007e00267400014174000952454349424f5320417371007e001e01000000010174000330363371007e00757400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000331313371007e0061740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330383271007e00307400014274000f5449515545204641435455524120427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330303671007e00577400014274000a464143545552415320427371007e001e01000000040074000339393971007e006b7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000331313271007e003a740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303271007e005c740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303971007e00447400014274000952454349424f5320427371007e001e01000000010174000330303171007e00497400014174000a464143545552415320417371007e001e01000000020174000330363471007e00217400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330383171007e003f7400014174000f5449515545204641435455524120417371007e001e01000000010174000330303371007e0035740001417400124e4f544153204445204352454449544f20417371007e001e0100000004007400043939393971007e007a740001587400085469636b657420587871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004974000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357371007e0002400000000000000074000d31313438363233372e30333236740001317371007e000b740001317400144869706f6c69746f497269676f79656e2034333671007e001274000e5275746120457869626963696f6e707371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330383271007e00307400014274000f5449515545204641435455524120427371007e001e0100000004007400043939393971007e007a740001587400085469636b657420587371007e001e01000000010174000330303471007e00267400014174000952454349424f5320417371007e001e01000000010174000330383171007e003f7400014174000f5449515545204641435455524120417371007e001e01000000020174000330363471007e00217400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000331313571007e0070740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000331313271007e003a740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040074000339393971007e006b7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330363371007e00757400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303871007e004e740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330303971007e00447400014274000952454349424f5320427371007e001e01000000010174000330303371007e0035740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000331313371007e0061740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000331313671007e0066740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040074000339393871007e007f7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330303171007e00497400014174000a464143545552415320417371007e001e01000000020174000330303671007e00577400014274000a464143545552415320427371007e001e01000000040174000330383071007e002b7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330303271007e005c740001417400114e4f5441532044452044454249544f20417871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004974000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e49412052555441740006343434343434740006343434343435740006343231343435707371007e009340a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000103f400000000000037371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e0099000000000000000071007e009e740004534c494d7371007e0099000000000000000071007e00eb7400064c2f34322f337874000c31313438363233372e3033327400054a414f34327371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e001000000000000003217371007e00a840350000000000000071007e0049740007497661203231257371007e00a840350000000000000171007e0026740007497661203231257371007e00ad71007e004974000954617665726e6974697400044a45414e7371007e001c770c000000103f400000000000037371007e00b27371007e001c770c000000103f400000000000087371007e0099000000000000000071007e00a1740006532f33382f317371007e0099000000000000000071007e00e274000834584c2f35302f377371007e0099000000000000000071007e00e57400064d2f34302f327371007e0099000000000000000071007e00e874000833584c2f34382f367371007e0099000000000000000071007e00f674000858584c2f34362f357371007e0099000000000000000071007e00f3740007584c2f34342f347371007e0099000000000000000071007e00ee74000835584c2f35322f387371007e0099000000000000000071007e00eb7400064c2f34322f337871007e004974000554414c4c457371007e00b27371007e001c770c000000103f400000000000037371007e0099000000000000000071007e00fc74000a455854524120534c494d7371007e0099000000000000000071007e0101740005524543544f7371007e0099000000000000000071007e009e740004534c494d7871007e003574000543414c43457371007e00b27371007e001c770c000000203f4000000000000f7371007e0099000000000000000071007e00b9740008424f5244454155587371007e0099000000000000000071007e00bc74000542454947457371007e0099000000000000000071007e0012740004524f4a4f7371007e0099000000000000000071007e00c4740004475249537371007e0099000000000000000071007e00b6740004524f53417371007e0099000000000000000071007e0057740005415a554c207371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e0099000000000000000071007e00d374000556455244457371007e0099000000000000000071007e00d67400074d4f5354415a417371007e0099000000000000000071007e00d97400074d415252c3934e7371007e0099000000000000000071007e00c1740006424c414e434f7371007e0099000000000000000071007e00d0740008414d4152494c4c4f7371007e0099000000000000000071007e006b7400054e4547524f7371007e0099000000000000000071007e00dc74000743454c455354457371007e0099000000000000000071007e00c774000854555251554553417871007e005c740005434f4c4f52787371007e010471007e005c74000f50414e54414c4f4e20484f4d425245707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330363371007e00757400014174000f4c49515549444143494f4e455320417371007e001e01000000040074000339393971007e006b7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330303271007e005c740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330363471007e00217400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330383171007e003f7400014174000f5449515545204641435455524120417371007e001e01000000040174000330383071007e002b7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330303871007e004e740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000330303371007e0035740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000331313671007e0066740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000331313271007e003a740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000004007400043939393971007e007a740001587400085469636b657420587371007e001e01000000010174000331313571007e0070740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330303471007e00267400014174000952454349424f5320417371007e001e01000000020174000330383271007e00307400014274000f5449515545204641435455524120427371007e001e01000000020174000330303971007e00447400014274000952454349424f5320427371007e001e01000000010174000330303171007e00497400014174000a464143545552415320417371007e001e01000000040074000339393871007e007f7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330303671007e00577400014274000a464143545552415320427371007e001e01000000020174000331313371007e0061740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004974000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e4941205255544174000634343434343474000634343434343578	Administrador Casa Sonia	1
40	Migración de productos	11/03/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000027704000000027372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e31740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870707400154869706f6c69746f20497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000d52757461204465706f7369746f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d0100000001017400033030327371007e000f0000000000000002740001417400114e4f5441532044452044454249544f20417371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427371007e001d0100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d0100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001d0100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417371007e001d0100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d0100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427371007e001d0100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427371007e001d0100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357400063432313434357371007e000f00000000000000097372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001b770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e000f0000000000000032740007584c2f34342f347371007e009900000000000000007371007e000f000000000000002c74000b415a554c204f534355524f7371007e009900000000000000007371007e000f0000000000000027740004534c494d7874000c31313438363233372e3033347400054a414f34347371007e001b770c000000103f40000000000000787371007e001b770c000000103f40000000000000787371007e000f00000000000003227372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0011740007497661203231257371007e00a840350000000000000171007e0048740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001174000954617665726e6974697400044a45414e7371007e001b770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001b770c000000103f400000000000037371007e009900000000000000007371007e000f0000000000000028740005524543544f7371007e0099000000000000000071007e00a1740004534c494d7371007e009900000000000000007371007e000f000000000000002674000a455854524120534c494d7871007e003474000543414c43457371007e00b27371007e001b770c000000203f4000000000000f7371007e009900000000000000007371007e000f000000000000002174000556455244457371007e0099000000000000000071007e002a740004524f4a4f7371007e009900000000000000007371007e000f000000000000002474000542454947457371007e009900000000000000007371007e000f0000000000000023740008424f5244454155587371007e009900000000000000007371007e000f000000000000001e740006424c414e434f7371007e009900000000000000007371007e000f000000000000002974000743454c455354457371007e009900000000000000007371007e000f00000000000000257400074d4f5354415a417371007e0099000000000000000071007e00527400054e4547524f7371007e009900000000000000007371007e000f0000000000000020740004475249537371007e0099000000000000000071007e0079740005415a554c207371007e009900000000000000007371007e000f000000000000002a7400074d415252c3934e7371007e009900000000000000007371007e000f000000000000003b74000854555251554553417371007e009900000000000000007371007e000f0000000000000022740004524f53417371007e009900000000000000007371007e000f000000000000001f740008414d4152494c4c4f7371007e0099000000000000000071007e009e74000b415a554c204f534355524f7871007e0025740005434f4c4f527371007e00b27371007e001b770c000000103f400000000000087371007e009900000000000000007371007e000f000000000000003374000858584c2f34362f357371007e009900000000000000007371007e000f000000000000002f740006532f33382f317371007e009900000000000000007371007e000f000000000000003574000834584c2f35302f377371007e009900000000000000007371007e000f00000000000000307400064d2f34302f327371007e009900000000000000007371007e000f00000000000000317400064c2f34322f337371007e009900000000000000007371007e000f000000000000003474000833584c2f34382f367371007e009900000000000000007371007e000f000000000000003674000835584c2f35322f387371007e0099000000000000000071007e009b740007584c2f34342f347871007e001174000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002574000f50414e54414c4f4e20484f4d425245707371007e001b770c000000103f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000010174000330303371007e0034740001417400124e4f544153204445204352454449544f20417371007e001d01000000040074000339393871007e004d7400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000020174000330383271007e00657400014274000f5449515545204641435455524120427371007e001d01000000010174000331313571007e006f740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000330303971007e00747400014274000952454349424f5320427371007e001d01000000020174000331313371007e0020740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000020174000330303871007e0043740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000330363471007e007e7400014274000f4c49515549444143494f4e455320427371007e001d01000000040174000330383071007e00607400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000020174000331313671007e005b740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000010174000330303471007e00487400014174000952454349424f5320417371007e001d01000000040074000339393971007e00527400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000330303271007e0025740001417400114e4f5441532044452044454249544f20417371007e001d01000000010174000331313271007e003e740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000020174000330303771007e002a740001427400114e4f5441532044452044454249544f20427371007e001d01000000010174000330363371007e002f7400014174000f4c49515549444143494f4e455320417371007e001d01000000020174000330303671007e00797400014274000a464143545552415320427371007e001d01000000010174000330383171007e006a7400014174000f5449515545204641435455524120417371007e001d0100000004007400043939393971007e0039740001587400085469636b657420587871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357371007e000240000000000000007400054a45414e31740001317371007e000b707400154869706f6c69746f20497269676f79656e2034333671007e001174000d52757461204465706f7369746f707371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d0100000004007400043939393971007e0039740001587400085469636b657420587371007e001d01000000010174000330303371007e0034740001417400124e4f544153204445204352454449544f20417371007e001d01000000020174000330303971007e00747400014274000952454349424f5320427371007e001d01000000020174000331313371007e0020740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000020174000330363471007e007e7400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000331313571007e006f740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000330303871007e0043740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000331313671007e005b740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000010174000331313271007e003e740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000020174000330303671007e00797400014274000a464143545552415320427371007e001d01000000010174000330363371007e002f7400014174000f4c49515549444143494f4e455320417371007e001d01000000020174000330303771007e002a740001427400114e4f5441532044452044454249544f20427371007e001d01000000020174000330383271007e00657400014274000f5449515545204641435455524120427371007e001d01000000040074000339393871007e004d7400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000010174000330303271007e0025740001417400114e4f5441532044452044454249544f20417371007e001d01000000040174000330383071007e00607400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000330303471007e00487400014174000952454349424f5320417371007e001d01000000010174000330383171007e006a7400014174000f5449515545204641435455524120417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000040074000339393971007e00527400024e587400124e6f7461206465206372c3a96469746f20787871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357400063432313434357371007e000f000000000000000a7371007e009340a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001b770c000000103f400000000000037371007e0099000000000000000071007e00f0740006532f33382f317371007e0099000000000000000071007e009e74000b415a554c204f534355524f7371007e0099000000000000000071007e00a1740004534c494d7874000c31313438363233372e3032387400054a414f33387371007e001b770c000000103f40000000000000787371007e001b770c000000103f40000000000000787371007e000f000000000000031f7371007e00a840350000000000000071007e0011740007497661203231257371007e00a840350000000000000171007e0048740007497661203231257371007e00ad71007e001174000954617665726e6974697400044a45414e7371007e001b770c000000103f400000000000037371007e00b27371007e001b770c000000103f400000000000087371007e0099000000000000000071007e00f97400064c2f34322f337371007e0099000000000000000071007e009b740007584c2f34342f347371007e0099000000000000000071007e00fc74000833584c2f34382f367371007e0099000000000000000071007e00f67400064d2f34302f327371007e0099000000000000000071007e00ff74000835584c2f35322f387371007e0099000000000000000071007e00f0740006532f33382f317371007e0099000000000000000071007e00f374000834584c2f35302f377371007e0099000000000000000071007e00ed74000858584c2f34362f357871007e001174000554414c4c457371007e00b27371007e001b770c000000103f400000000000037371007e0099000000000000000071007e00b6740005524543544f7371007e0099000000000000000071007e00a1740004534c494d7371007e0099000000000000000071007e00bb74000a455854524120534c494d7871007e003474000543414c43457371007e00b27371007e001b770c000000203f4000000000000f7371007e0099000000000000000071007e00c674000542454947457371007e0099000000000000000071007e0079740005415a554c207371007e0099000000000000000071007e00527400054e4547524f7371007e0099000000000000000071007e00e5740008414d4152494c4c4f7371007e0099000000000000000071007e00c9740008424f5244454155587371007e0099000000000000000071007e00e2740004524f53417371007e0099000000000000000071007e00df74000854555251554553417371007e0099000000000000000071007e00dc7400074d415252c3934e7371007e0099000000000000000071007e00cc740006424c414e434f7371007e0099000000000000000071007e00d7740004475249537371007e0099000000000000000071007e002a740004524f4a4f7371007e0099000000000000000071007e00d27400074d4f5354415a417371007e0099000000000000000071007e00c174000556455244457371007e0099000000000000000071007e00cf74000743454c455354457371007e0099000000000000000071007e009e74000b415a554c204f534355524f7871007e0025740005434f4c4f52787371007e010471007e002574000f50414e54414c4f4e20484f4d425245707371007e001b770c000000103f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d0100000004007400043939393971007e0039740001587400085469636b657420587371007e001d01000000010174000330303471007e00487400014174000952454349424f5320417371007e001d01000000010174000331313271007e003e740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330303271007e0025740001417400114e4f5441532044452044454249544f20417371007e001d01000000020174000330303871007e0043740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000331313371007e0020740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000020174000330383271007e00657400014274000f5449515545204641435455524120427371007e001d01000000020174000330303971007e00747400014274000952454349424f5320427371007e001d01000000010174000330303371007e0034740001417400124e4f544153204445204352454449544f20417371007e001d01000000040074000339393871007e004d7400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000040074000339393971007e00527400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000040174000330383071007e00607400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000020174000330363471007e007e7400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000330383171007e006a7400014174000f5449515545204641435455524120417371007e001d01000000020174000330303671007e00797400014274000a464143545552415320427371007e001d01000000020174000330303771007e002a740001427400114e4f5441532044452044454249544f20427371007e001d01000000020174000331313671007e005b740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000010174000330363371007e002f7400014174000f4c49515549444143494f4e455320417371007e001d01000000010174000331313571007e006f740001417400165449515545204e4f54412044452044454249544f20417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e4941205255544174000634343434343474000634343434343578	Administrador Casa Sonia	1
44	Migración de productos	11/03/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000027704000000027372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e31740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870707400154869706f6c69746f20497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000d52757461204465706f7369746f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e0003787001000000010174000330303171007e00117400014174000a464143545552415320417371007e001d0100000001017400033030327371007e000f0000000000000002740001417400114e4f5441532044452044454249544f20417371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427371007e001d0100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d0100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d0100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427371007e001d0100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001d0100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001d0100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427371007e001d0100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357400063432313434357371007e000f000000000000000b7372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001b770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e000f000000000000002c74000b415a554c204f534355524f7371007e009900000000000000007371007e000f00000000000000307400064d2f34302f327371007e009900000000000000007371007e000f0000000000000027740004534c494d7874000c31313438363233372e3033307400054a414f34307371007e001b770c000000103f40000000000000787371007e001b770c000000103f40000000000000787371007e000f00000000000003207372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0011740007497661203231257371007e00a840350000000000000171007e0047740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001174000954617665726e6974697400044a45414e7371007e001b770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001b770c000000103f400000000000087371007e009900000000000000007371007e000f000000000000003574000834584c2f35302f377371007e009900000000000000007371007e000f00000000000000317400064c2f34322f337371007e009900000000000000007371007e000f000000000000003474000833584c2f34382f367371007e0099000000000000000071007e009e7400064d2f34302f327371007e009900000000000000007371007e000f0000000000000032740007584c2f34342f347371007e009900000000000000007371007e000f000000000000003374000858584c2f34362f357371007e009900000000000000007371007e000f000000000000002f740006532f33382f317371007e009900000000000000007371007e000f000000000000003674000835584c2f35322f387871007e001174000554414c4c457371007e00b27371007e001b770c000000103f400000000000037371007e0099000000000000000071007e00a1740004534c494d7371007e009900000000000000007371007e000f0000000000000028740005524543544f7371007e009900000000000000007371007e000f000000000000002674000a455854524120534c494d7871007e007e74000543414c43457371007e00b27371007e001b770c000000203f4000000000000f7371007e009900000000000000007371007e000f000000000000002974000743454c455354457371007e009900000000000000007371007e000f00000000000000257400074d4f5354415a417371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e009900000000000000007371007e000f000000000000002474000542454947457371007e0099000000000000000071007e004c740004524f4a4f7371007e0099000000000000000071007e002e7400054e4547524f7371007e009900000000000000007371007e000f000000000000002174000556455244457371007e009900000000000000007371007e000f000000000000002a7400074d415252c3934e7371007e009900000000000000007371007e000f0000000000000023740008424f5244454155587371007e009900000000000000007371007e000f000000000000001f740008414d4152494c4c4f7371007e0099000000000000000071007e0074740005415a554c207371007e009900000000000000007371007e000f0000000000000020740004475249537371007e009900000000000000007371007e000f000000000000001e740006424c414e434f7371007e009900000000000000007371007e000f0000000000000022740004524f53417371007e009900000000000000007371007e000f000000000000003b74000854555251554553417871007e0024740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002474000f50414e54414c4f4e20484f4d425245707371007e001b770c000000103f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000020174000330303671007e00747400014274000a464143545552415320427371007e001d01000000020174000331313371007e0051740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000010174000330303471007e00477400014174000952454349424f5320417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000040174000330383071007e00337400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000020174000331313671007e003d740001427400165449515545204e4f54412044452044454249544f20427371007e001d0100000004007400043939393971007e0056740001587400085469636b657420587371007e001d01000000010174000330383171007e006a7400014174000f5449515545204641435455524120417371007e001d01000000010174000331313271007e0060740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000020174000330303871007e006f740001427400124e4f544153204445204352454449544f20427371007e001d01000000020174000330363471007e00657400014274000f4c49515549444143494f4e455320427371007e001d01000000040074000339393971007e002e7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000330303371007e007e740001417400124e4f544153204445204352454449544f20417371007e001d01000000020174000330383271007e00297400014274000f5449515545204641435455524120427371007e001d01000000020174000330303971007e00427400014274000952454349424f5320427371007e001d01000000010174000330363371007e00387400014174000f4c49515549444143494f4e455320417371007e001d01000000010174000330303271007e0024740001417400114e4f5441532044452044454249544f20417371007e001d01000000010174000331313571007e005b740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000330303771007e004c740001427400114e4f5441532044452044454249544f20427371007e001d01000000040074000339393871007e00797400024e587400114e6f74612064652064c3a96269746f20787871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357371007e000240000000000000007400054a45414e31740001317371007e000b707400154869706f6c69746f20497269676f79656e2034333671007e001174000d52757461204465706f7369746f707371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000020174000330383271007e00297400014274000f5449515545204641435455524120427371007e001d01000000020174000330303871007e006f740001427400124e4f544153204445204352454449544f20427371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000020174000330363471007e00657400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000330303471007e00477400014174000952454349424f5320417371007e001d0100000004007400043939393971007e0056740001587400085469636b657420587371007e001d01000000020174000331313671007e003d740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000040074000339393971007e002e7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000331313571007e005b740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000330303671007e00747400014274000a464143545552415320427371007e001d01000000020174000330303971007e00427400014274000952454349424f5320427371007e001d01000000010174000331313271007e0060740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330363371007e00387400014174000f4c49515549444143494f4e455320417371007e001d01000000020174000331313371007e0051740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000040174000330383071007e00337400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000330303271007e0024740001417400114e4f5441532044452044454249544f20417371007e001d01000000010174000330383171007e006a7400014174000f5449515545204641435455524120417371007e001d01000000040074000339393871007e00797400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000020174000330303771007e004c740001427400114e4f5441532044452044454249544f20427371007e001d01000000010174000330303371007e007e740001417400124e4f544153204445204352454449544f20417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357400063432313434357371007e000f000000000000000c7371007e009340a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001b770c000000103f400000000000037371007e0099000000000000000071007e00b97400064c2f34322f337371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e0099000000000000000071007e00a1740004534c494d7874000c31313438363233372e3033327400054a414f34327371007e001b770c000000103f40000000000000787371007e001b770c000000103f40000000000000787371007e000f00000000000003217371007e00a840350000000000000071007e0011740007497661203231257371007e00a840350000000000000171007e0047740007497661203231257371007e00ad71007e001174000954617665726e6974697400044a45414e7371007e001b770c000000103f400000000000037371007e00b27371007e001b770c000000103f400000000000087371007e0099000000000000000071007e00c474000858584c2f34362f357371007e0099000000000000000071007e00b97400064c2f34322f337371007e0099000000000000000071007e00bc74000833584c2f34382f367371007e0099000000000000000071007e00c1740007584c2f34342f347371007e0099000000000000000071007e00b674000834584c2f35302f377371007e0099000000000000000071007e00c7740006532f33382f317371007e0099000000000000000071007e00ca74000835584c2f35322f387371007e0099000000000000000071007e009e7400064d2f34302f327871007e001174000554414c4c457371007e00b27371007e001b770c000000203f4000000000000f7371007e0099000000000000000071007e004c740004524f4a4f7371007e0099000000000000000071007e00ea74000556455244457371007e0099000000000000000071007e0074740005415a554c207371007e0099000000000000000071007e00fe740004524f53417371007e0099000000000000000071007e00f8740004475249537371007e0099000000000000000071007e00f0740008424f5244454155587371007e0099000000000000000071007e002e7400054e4547524f7371007e0099000000000000000071007e00db74000743454c455354457371007e0099000000000000000071007e010174000854555251554553417371007e0099000000000000000071007e00ed7400074d415252c3934e7371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e0099000000000000000071007e00fb740006424c414e434f7371007e0099000000000000000071007e00e374000542454947457371007e0099000000000000000071007e00f3740008414d4152494c4c4f7371007e0099000000000000000071007e00de7400074d4f5354415a417871007e0024740005434f4c4f527371007e00b27371007e001b770c000000103f400000000000037371007e0099000000000000000071007e00d2740005524543544f7371007e0099000000000000000071007e00d574000a455854524120534c494d7371007e0099000000000000000071007e00a1740004534c494d7871007e007e74000543414c4345787371007e010471007e002474000f50414e54414c4f4e20484f4d425245707371007e001b770c000000103f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000010174000330303271007e0024740001417400114e4f5441532044452044454249544f20417371007e001d01000000020174000331313371007e0051740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000040074000339393971007e002e7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000020174000330383271007e00297400014274000f5449515545204641435455524120427371007e001d01000000010174000330303371007e007e740001417400124e4f544153204445204352454449544f20417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000010174000330363371007e00387400014174000f4c49515549444143494f4e455320417371007e001d01000000020174000330303971007e00427400014274000952454349424f5320427371007e001d01000000010174000331313271007e0060740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000020174000330303871007e006f740001427400124e4f544153204445204352454449544f20427371007e001d0100000004007400043939393971007e0056740001587400085469636b657420587371007e001d01000000010174000331313571007e005b740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000330303671007e00747400014274000a464143545552415320427371007e001d01000000020174000330303771007e004c740001427400114e4f5441532044452044454249544f20427371007e001d01000000020174000331313671007e003d740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000020174000330363471007e00657400014274000f4c49515549444143494f4e455320427371007e001d01000000040174000330383071007e00337400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000040074000339393871007e00797400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000010174000330383171007e006a7400014174000f5449515545204641435455524120417371007e001d01000000010174000330303471007e00477400014174000952454349424f5320417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000103f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e4941205255544174000634343434343474000634343434343578	Administrador Casa Sonia	1
26	Cambio en stock de JEAN	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e00037870010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427871007e0066740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e006674000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e006674001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e002b7372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870404600000000000071007e0061707371007e009900000000000000007371007e00100000000000000028740005524543544f7371007e0099000000000000000071007e00707400054e4547524f7874000c30313432383638332e3033347400044a4e34347371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e0010000000000000005a7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0066740007497661203231257371007e00a540350000000000000171007e002b740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006674000954617665726e6974697400044a45414e7371007e001c770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000043f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e0099000000000000000071007e009c740005524543544f7871007e003074000543414c43457371007e00af7371007e001c770c000000083f400000000000047371007e0099000000000000000071007e006b740001537371007e0099000000000000000071007e00307400014c7371007e0099000000000000000071007e0044740004417a756c7371007e0099000000000000000071007e002b740002584c7871007e006674000554414c4c457371007e00af7371007e001c770c000000043f400000000000037371007e0099000000000000000071007e0044740004417a756c7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7871007e006b740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006b74000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000010174000330303471007e002b7400014174000952454349424f5320417371007e001e01000000020174000330303971007e007f7400014274000952454349424f5320427371007e001e01000000020174000331313671007e0035740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000331313571007e0075740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000040074000339393971007e00707400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000331313371007e003f740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330383271007e007a7400014274000f5449515545204641435455524120427371007e001e01000000020174000330363471007e003a7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303371007e0030740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330363371007e00497400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330383171007e00617400014174000f5449515545204641435455524120417371007e001e01000000040074000339393871007e005c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000331313271007e0053740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303171007e00667400014174000a464143545552415320417371007e001e01000000020174000330303871007e0026740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330303671007e00447400014274000a464143545552415320427371007e001e01000000010174000330303271007e006b740001417400114e4f5441532044452044454249544f20417371007e001e01000000040174000330383071007e004e7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000004007400043939393971007e0021740001587400085469636b657420587871007e0066740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e006674000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e006674001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
25	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787871007e007a740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e007a74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e007a74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870404600000000000071007e005c707371007e0099000000000000000071007e007f7400054e4547524f7371007e009900000000000000007371007e00100000000000000028740005524543544f7874000c30313432383638332e3033347400074a4e34343434347371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e0010000000000000005a7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e007a740007497661203231257371007e00a540350000000000000171007e0052740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e007a74000954617665726e6974697400044a45414e7371007e001c770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000083f400000000000047371007e0099000000000000000071007e003e740004417a756c7371007e0099000000000000000071007e0052740002584c7371007e0099000000000000000071007e00347400014c7371007e0099000000000000000071007e0048740001537871007e007a74000554414c4c457371007e00af7371007e001c770c000000043f400000000000037371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7371007e0099000000000000000071007e003e740004417a756c7871007e0048740005434f4c4f527371007e00af7371007e001c770c000000043f400000000000037371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e0099000000000000000071007e009e740005524543544f7871007e003474000543414c4345787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004874000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000040074000339393871007e00667400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330383271007e00617400014274000f5449515545204641435455524120427371007e001e01000000040074000339393971007e007f7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330303371007e0034740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330383171007e005c7400014174000f5449515545204641435455524120417371007e001e01000000020174000330363471007e00217400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303971007e004d7400014274000952454349424f5320427371007e001e01000000010174000330303271007e0048740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000331313571007e0026740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000020174000331313671007e0057740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330363371007e00437400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303871007e0039740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000331313271007e006b740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330303471007e00527400014174000952454349424f5320417371007e001e01000000020174000330303671007e003e7400014274000a464143545552415320427371007e001e0100000004007400043939393971007e0070740001587400085469636b657420587371007e001e01000000010174000330303171007e007a7400014174000a464143545552415320417371007e001e01000000040174000330383071007e00757400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000331313371007e002f740001427400175449515545204e4f5441204445204352454449544f20427871007e007a740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e007a74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e007a74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
24	Cambio en stock de JEAN	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427871007e005c740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e005c74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e005c74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e00397372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870000000000000000071007e00267400054e4547524f7371007e009900000000000000007371007e00100000000000000028740005524543544f7371007e0099404600000000000071007e007a707874000c30313432383638332e3033347400074a4e34343434347371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e0010000000000000005a7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e005c740007497661203231257371007e00a540350000000000000171007e0039740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005c74000954617665726e6974697400044a45414e7371007e001c770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000043f400000000000037371007e0099000000000000000071007e009d740005524543544f7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e009900000000000000007371007e00100000000000000027740004534c494d7871007e004374000543414c43457371007e00af7371007e001c770c000000083f400000000000047371007e0099000000000000000071007e00437400014c7371007e0099000000000000000071007e007f740004417a756c7371007e0099000000000000000071007e0030740001537371007e0099000000000000000071007e0039740002584c7871007e005c74000554414c4c457371007e00af7371007e001c770c000000043f400000000000037371007e0099000000000000000071007e007f740004417a756c7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7871007e0030740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e003074000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330303971007e00487400014274000952454349424f5320427371007e001e0100000004007400043939393971007e003e740001587400085469636b657420587371007e001e01000000010174000331313571007e0021740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000331313271007e006b740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303471007e00397400014174000952454349424f5320417371007e001e01000000020174000330363471007e002b7400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303671007e007f7400014274000a464143545552415320427371007e001e01000000010174000330303171007e005c7400014174000a464143545552415320417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330383271007e004d7400014274000f5449515545204641435455524120427371007e001e01000000010174000330303371007e0043740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000331313371007e0057740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303271007e0030740001417400114e4f5441532044452044454249544f20417371007e001e01000000040074000339393971007e00267400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000331313671007e0075740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330363371007e00617400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303871007e0066740001427400124e4f544153204445204352454449544f20427371007e001e01000000040174000330383071007e00707400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330383171007e007a7400014174000f5449515545204641435455524120417371007e001e01000000040074000339393871007e00527400024e587400114e6f74612064652064c3a96269746f20787871007e005c740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e005c74000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e005c74001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
23	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e36740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787871007e0026740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e002674000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e002674001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e00100000000000000028740005524543544f7371007e0099000000000000000071007e005c7400054e4547524f7371007e0099404600000000000071007e007a707874000c30313432383638332e3033347400044a4e34347371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e0010000000000000005a7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0026740007497661203231257371007e00a540350000000000000171007e0048740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002674000954617665726e6974697400044a45414e7371007e001c770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000083f400000000000047371007e0099000000000000000071007e0048740002584c7371007e0099000000000000000071007e00307400014c7371007e0099000000000000000071007e003e740004417a756c7371007e0099000000000000000071007e0043740001537871007e002674000554414c4c457371007e00af7371007e001c770c000000043f400000000000037371007e0099000000000000000071007e009b740005524543544f7371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e009900000000000000007371007e00100000000000000027740004534c494d7871007e003074000543414c43457371007e00af7371007e001c770c000000043f400000000000037371007e0099000000000000000071007e003e740004417a756c7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004526f6a6f7871007e0043740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004374000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330303971007e00757400014274000952454349424f5320427371007e001e01000000040074000339393971007e005c7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000331313671007e0035740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330363471007e00527400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000331313571007e0066740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000331313271007e0070740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040174000330383071007e00617400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000040074000339393871007e007f7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000331313371007e0057740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303471007e00487400014174000952454349424f5320417371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000330383171007e007a7400014174000f5449515545204641435455524120417371007e001e01000000020174000330303871007e002b740001427400124e4f544153204445204352454449544f20427371007e001e0100000004007400043939393971007e006b740001587400085469636b657420587371007e001e01000000010174000330303171007e00267400014174000a464143545552415320417371007e001e01000000010174000330363371007e00217400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303671007e003e7400014274000a464143545552415320427371007e001e01000000020174000330383271007e004d7400014274000f5449515545204641435455524120427371007e001e01000000010174000330303371007e0030740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000330303271007e0043740001417400114e4f5441532044452044454249544f20417871007e0026740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e002674000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e002674001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
22	Migración de productos	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e31740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e004974000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343574000634323134343571007e004e7372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001c770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e00037870000000000000000071007e00537400054e4547524f7371007e009900000000000000007371007e00100000000000000028740005524543544f7371007e009940470000000000007371007e0010000000000000002d707874000c30313432383638332e3033367400044a4e34367371007e001c770c000000013f40000000000000787371007e001c770c000000013f40000000000000787371007e0010000000000000005b7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0049740007497661203231257371007e00a640350000000000000171007e0035740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e004974000954617665726e6974697400044a45414e7371007e001c770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000043f400000000000037371007e0099000000000000000071007e0012740004526f6a6f7371007e0099000000000000000071007e004e740004417a756c7371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7871007e005c740005434f4c4f527371007e00b07371007e001c770c000000043f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e0099000000000000000071007e009d740005524543544f7371007e009900000000000000007371007e00100000000000000027740004534c494d7871007e007a74000543414c43457371007e00b07371007e001c770c000000083f400000000000047371007e0099000000000000000071007e0035740002584c7371007e0099000000000000000071007e005c740001537371007e0099000000000000000071007e004e740004417a756c7371007e0099000000000000000071007e007a7400014c7871007e004974000554414c4c45787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e005c74000850616e74616c6f6e707371007e001c770c000000013f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330363471007e002b7400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303971007e003f7400014274000952454349424f5320427371007e001e01000000010174000330363371007e00307400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000330303871007e0026740001427400124e4f544153204445204352454449544f20427371007e001e01000000010174000331313271007e0044740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000004007400043939393971007e0075740001587400085469636b657420587371007e001e01000000040074000339393871007e007f7400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330383171007e00667400014174000f5449515545204641435455524120417371007e001e01000000010174000330303171007e00497400014174000a464143545552415320417371007e001e01000000020174000330383271007e003a7400014274000f5449515545204641435455524120427371007e001e01000000010174000330303371007e007a740001417400124e4f544153204445204352454449544f20417371007e001e01000000010174000331313571007e0061740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000040174000330383071007e00217400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000331313371007e006b740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000040074000339393971007e00537400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303671007e004e7400014274000a464143545552415320427371007e001e01000000010174000330303271007e005c740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330303471007e00357400014174000952454349424f5320417371007e001e01000000020174000331313671007e0070740001427400165449515545204e4f54412044452044454249544f20427871007e0049740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e004974000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000023f400000000000017371007e008c0000000471007e004974001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
21	Carga de stock	13/02/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040000000000000007400054a45414e31740001307372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870707400154869706f6c69746f20497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000174000d52757461204465706f7369746f707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033036337371007e000f000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001d0100000002017400033030367371007e000f00000000000000057400014274000a464143545552415320427371007e001d0100000001017400033030327371007e000f0000000000000002740001417400114e4f5441532044452044454249544f20417371007e001d0100000001017400033131357371007e000f0000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001d0100000002017400033030397371007e000f00000000000000087400014274000952454349424f5320427371007e001d0100000002017400033131337371007e000f0000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001d0100000002017400033036347371007e000f000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001d0100000002017400033030377371007e000f0000000000000006740001427400114e4f5441532044452044454249544f20427371007e001d0100000001017400033131327371007e000f0000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001d010000000400740004393939397371007e000f000000000000001b740001587400085469636b657420587371007e001d0100000004007400033939397371007e000f000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001d0100000004017400033038307371007e000f00000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d0100000001017400033038317371007e000f00000000000000117400014174000f5449515545204641435455524120417371007e001d0100000004007400033939387371007e000f000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001d0100000002017400033030387371007e000f0000000000000007740001427400124e4f544153204445204352454449544f20427371007e001d0100000001017400033030337371007e000f0000000000000003740001417400124e4f544153204445204352454449544f20417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d0100000001017400033030347371007e000f00000000000000047400014174000952454349424f5320417371007e001d0100000002017400033131367371007e000f0000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001d0100000002017400033038327371007e000f00000000000000127400014274000f5449515545204641435455524120427871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e4941740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00934c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c7870409e7800000000004098120000000000000000014093e48f5c28f5c34079980000000000408526e147ae147b409812000000000040a92e47ae147ae140ae780000000000000000007371007e001b770c000000043f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e000f0000000000000028740005524543544f7371007e0098000000000000000071007e00527400054e4547524f7371007e009840470000000000007371007e000f000000000000002d707874000c30313432383638332e3033367400044a4e34367371007e001b770c000000013f40000000000000787371007e001b770c000000013f40000000000000787371007e000f000000000000005b7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0011740007497661203231257371007e00a540350000000000000171007e0074740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e001174000954617665726e6974697400044a45414e7371007e001b770c000000043f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001b770c000000083f400000000000047371007e0098000000000000000071007e006b7400014c7371007e0098000000000000000071007e002a740001537371007e0098000000000000000071007e0025740004417a756c7371007e0098000000000000000071007e0074740002584c7871007e001174000554414c4c457371007e00af7371007e001b770c000000043f400000000000037371007e0098000000000000000071007e0025740004417a756c7371007e009800000000000000007371007e000f000000000000002a7400074d415252c3934e7371007e0098000000000000000071007e0043740004526f6a6f7871007e002a740005434f4c4f527371007e00af7371007e001b770c000000043f400000000000037371007e009800000000000000007371007e000f000000000000002674000a455854524120534c494d7371007e009800000000000000007371007e000f0000000000000027740004534c494d7371007e0098000000000000000071007e009a740005524543544f7871007e006b74000543414c4345787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002a74000850616e74616c6f6e707371007e001b770c000000013f40000000000000787371007e001300d7a8c574000b5265636f6e7175697374617371007e00197371007e001b770c000000203f400000000000147371007e001d01000000020174000331313371007e0039740001427400175449515545204e4f5441204445204352454449544f20427371007e001d01000000020174000330303871007e0066740001427400124e4f544153204445204352454449544f20427371007e001d01000000010174000331313271007e0048740001417400175449515545204e4f5441204445204352454449544f20417371007e001d01000000010174000330303171007e00117400014174000a464143545552415320417371007e001d01000000020174000330303771007e0043740001427400114e4f5441532044452044454249544f20427371007e001d01000000010174000330303371007e006b740001417400124e4f544153204445204352454449544f20417371007e001d01000000020174000330303971007e00347400014274000952454349424f5320427371007e001d01000000040174000330383071007e00577400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001d01000000010174000331313571007e002f740001417400165449515545204e4f54412044452044454249544f20417371007e001d01000000020174000331313671007e0079740001427400165449515545204e4f54412044452044454249544f20427371007e001d01000000040074000339393871007e00617400024e587400114e6f74612064652064c3a96269746f20787371007e001d01000000020174000330383271007e007e7400014274000f5449515545204641435455524120427371007e001d01000000020174000330363471007e003e7400014274000f4c49515549444143494f4e455320427371007e001d01000000010174000330363371007e00207400014174000f4c49515549444143494f4e455320417371007e001d01000000020174000330303671007e00257400014274000a464143545552415320427371007e001d01000000010174000330303471007e00747400014174000952454349424f5320417371007e001d0100000004007400043939393971007e004d740001587400085469636b657420587371007e001d01000000040074000339393971007e00527400024e587400124e6f7461206465206372c3a96469746f20787371007e001d01000000010174000330303271007e002a740001417400114e4f5441532044452044454249544f20417371007e001d01000000010174000330383171007e005c7400014174000f5449515545204641435455524120417871007e0011740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0085770800000174be0da7807871007e001174000a537563757273616c203174000a4341534120534f4e494174000853616e74612046657371007e001b770c000000023f400000000000017371007e008b0000000471007e001174001950756e746f2064652076656e746120737563757273616c2031707874000a4341534120534f4e494174000634343434343474000634343434343578	Administrador Casa Sonia	1
41	Migración de productos	11/03/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000017704000000017372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b787040100000000000007400054a45414e36740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427871007e0026740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e002674000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e002674001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357400063432313434357371007e001000000000000000097372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00954c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7371007e009a00000000000000007371007e00100000000000000027740004534c494d7371007e009a00000000000000007371007e0010000000000000002f740006532f33382f317874000c31313438363233372e3032387400054a414f33387371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000031f7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e0026740007497661203231257371007e00a940350000000000000171007e0058740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002674000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000087371007e009a00000000000000007371007e0010000000000000003674000835584c2f35322f387371007e009a00000000000000007371007e0010000000000000003574000834584c2f35302f377371007e009a00000000000000007371007e001000000000000000307400064d2f34302f327371007e009a00000000000000007371007e0010000000000000003374000858584c2f34362f357371007e009a00000000000000007371007e0010000000000000003474000833584c2f34382f367371007e009a00000000000000007371007e001000000000000000317400064c2f34322f337371007e009a000000000000000071007e00a2740006532f33382f317371007e009a00000000000000007371007e00100000000000000032740007584c2f34342f347871007e002674000554414c4c457371007e00b37371007e001c770c000000203f4000000000000f7371007e009a00000000000000007371007e0010000000000000001e740006424c414e434f7371007e009a00000000000000007371007e0010000000000000003b74000854555251554553417371007e009a00000000000000007371007e0010000000000000002474000542454947457371007e009a000000000000000071007e0012740004524f4a4f7371007e009a00000000000000007371007e00100000000000000020740004475249537371007e009a00000000000000007371007e00100000000000000022740004524f53417371007e009a00000000000000007371007e0010000000000000001f740008414d4152494c4c4f7371007e009a00000000000000007371007e00100000000000000023740008424f5244454155587371007e009a00000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e009a00000000000000007371007e0010000000000000002174000556455244457371007e009a00000000000000007371007e0010000000000000002974000743454c455354457371007e009a000000000000000071007e006c7400054e4547524f7371007e009a00000000000000007371007e001000000000000000257400074d4f5354415a417371007e009a000000000000000071007e003a740005415a554c207371007e009a000000000000000071007e009c74000b415a554c204f534355524f7871007e0067740005434f4c4f527371007e00b37371007e001c770c000000103f400000000000037371007e009a00000000000000007371007e00100000000000000028740005524543544f7371007e009a00000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e009a000000000000000071007e009f740004534c494d7871007e004974000543414c4345787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e006774000f50414e54414c4f4e20484f4d425245707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000331313671007e0071740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000004007400043939393971007e007b740001587400085469636b657420587371007e001e01000000010174000330383171007e005d7400014174000f5449515545204641435455524120417371007e001e01000000010174000330303471007e00587400014174000952454349424f5320417371007e001e01000000020174000330383271007e00627400014274000f5449515545204641435455524120427371007e001e01000000040174000330383071007e004e7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000330303171007e00267400014174000a464143545552415320417371007e001e01000000010174000330303271007e0067740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330363371007e003f7400014174000f4c49515549444143494f4e455320417371007e001e01000000040074000339393971007e006c7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330303971007e00767400014274000952454349424f5320427371007e001e01000000020174000330303871007e0044740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330363471007e00537400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330303371007e0049740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000331313371007e0030740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000331313271007e0021740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330303671007e003a7400014274000a464143545552415320427371007e001e01000000040074000339393871007e00357400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000331313571007e002b740001417400165449515545204e4f54412044452044454249544f20417871007e0026740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e002674000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e002674001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e4941205255544174000634343434343474000634343434343578	Administrador Casa Sonia	1
42	Carga de stock	11/03/2021	\\xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a657870000000027704000000027372001c636f6d2e707279736f66742e7064762e6d6f64656c732e53746f636b2fa7046b1aa141ff02000744000863616e74696461644c0007616c676f72696d7400124c6a6176612f6c616e672f537472696e673b4c000e63616e74696461644d696e696d6171007e00034c00086465706f7369746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f4465706f7369746f3b4c000269647400104c6a6176612f6c616e672f4c6f6e673b4c000870726f647563746f7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f50726f647563746f3b4c0008737563757273616c7400214c636f6d2f707279736f66742f7064762f6d6f64656c732f537563757273616c3b7870400000000000000074000d31313438363233372e30323836740001317372001f636f6d2e707279736f66742e7064762e6d6f64656c732e4465706f7369746f040e41c110d5afed0200074c000e64656661756c744465706f73697471007e00034c0009646972656363696f6e71007e00034c0002696471007e00054c00066e6f6d62726571007e00034c000573746f636b74000f4c6a6176612f7574696c2f5365743b4c000a737563757273616c657371007e00074c000874656c65666f6e6f71007e00037870740001317400144869706f6c69746f497269676f79656e203433367372000e6a6176612e6c616e672e4c6f6e673b8be490cc8f23df0200014a000576616c7565787200106a6176612e6c616e672e4e756d62657286ac951d0b94e08b0200007870000000000000000674000e5275746120457869626963696f6e707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e537563757273616c5ce13c3ea8a3b65b020011490008696e67427275746f4c000663697564616471007e00034c000c636f6e646963696f6e4976617400284c636f6d2f707279736f66742f7064762f6d6f64656c732f436f6e646963696f6e46697363616c3b4c00046375697471007e00034c00096465706f7369746f7371007e000c4c0009646972656363696f6e71007e00034c0005656d61696c71007e00034c0007656d70726573617400204c636f6d2f707279736f66742f7064762f6d6f64656c732f456d70726573613b4c000e6665636861496e6963696f4163747400104c6a6176612f7574696c2f446174653b4c0002696471007e00054c00066e6f6d62726571007e00034c000e6e6f6d627265436f6e746163746f71007e00034c000970726f76696e63696171007e00034c000b70756e746f7356656e746171007e000c4c000b72617a6f6e536f6369616c71007e00034c000874656c65666f6e6f71007e00034c001374656c65666f6e6f416c7465726e617469766f71007e0003787000d7a8c574000b5265636f6e71756973746173720026636f6d2e707279736f66742e7064762e6d6f64656c732e436f6e646963696f6e46697363616c501a60e647d3003d0200034c000a646f63756d656e746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e00037870737200116a6176612e7574696c2e48617368536574ba44859596b8b7340300007870770c000000203f4000000000001473720029636f6d2e707279736f66742e7064762e6d6f64656c732e446f63756d656e746f436f6d65726369616cb0d8740d55ab14b60200075a000661637469766f4900066976614361745a00047469706f4c000f636f6469676f446f63756d656e746f71007e00034c0002696471007e00054c00056c6574726171007e00034c00066e6f6d62726571007e000378700100000001017400033030327371007e00100000000000000002740001417400114e4f5441532044452044454249544f20417371007e001e0100000001017400033030347371007e001000000000000000047400014174000952454349424f5320417371007e001e0100000001017400033030317371007e001000000000000000017400014174000a464143545552415320417371007e001e0100000002017400033030367371007e001000000000000000057400014274000a464143545552415320427371007e001e0100000001017400033036337371007e0010000000000000000d7400014174000f4c49515549444143494f4e455320417371007e001e0100000002017400033030387371007e00100000000000000007740001427400124e4f544153204445204352454449544f20427371007e001e010000000400740004393939397371007e0010000000000000001b740001587400085469636b657420587371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e0100000002017400033131367371007e00100000000000000019740001427400165449515545204e4f54412044452044454249544f20427371007e001e0100000001017400033038317371007e001000000000000000117400014174000f5449515545204641435455524120417371007e001e0100000001017400033030337371007e00100000000000000003740001417400124e4f544153204445204352454449544f20417371007e001e0100000002017400033038327371007e001000000000000000127400014274000f5449515545204641435455524120427371007e001e0100000004007400033939397371007e0010000000000000001d7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e0100000001017400033131327371007e00100000000000000015740001417400175449515545204e4f5441204445204352454449544f20417371007e001e0100000004007400033939387371007e0010000000000000001c7400024e587400114e6f74612064652064c3a96269746f20787371007e001e0100000002017400033036347371007e0010000000000000000e7400014274000f4c49515549444143494f4e455320427371007e001e0100000002017400033030397371007e001000000000000000087400014274000952454349424f5320427371007e001e0100000002017400033131337371007e00100000000000000016740001427400175449515545204e4f5441204445204352454449544f20427371007e001e0100000004017400033038307371007e001000000000000000107400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e0100000001017400033131357371007e00100000000000000018740001417400165449515545204e4f54412044452044454249544f20417871007e002b740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707372000e6a6176612e7574696c2e44617465686a81014b5974190300007870770800000174be0da7807871007e002b74000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f4000000000000173720021636f6d2e707279736f66742e7064762e6d6f64656c732e50756e746f56656e7461c0dd0637a63380ca020004490008696446697363616c4c0002696471007e00054c00066e6f6d62726571007e00034c0008737563757273616c71007e000778700000000471007e002b74001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e49412052555441740006343434343434740006343434343435740006343231343435707372001f636f6d2e707279736f66742e7064762e6d6f64656c732e50726f647563746f7eff9bc7b2d61aa102001844000a636f73746f427275746f440009636f73746f4e65746f49000665737461646f44000867616e616e636961440009697661436f6d70726144000869766156656e746144000b70726563696f436f73746f44000c70726563696f53696e49766144000b70726563696f546f74616c49000970726f7069656461644c0009617472696275746f7371007e000c4c000b636f6469676f426172726171007e00034c000e636f6469676f50726f647563746f71007e00034c00096465706f7369746f7371007e000c4c000e646973747269627569646f72657371007e000c4c0002696471007e00054c0010697661436f6d707261734f626a65637474001c4c636f6d2f707279736f66742f7064762f6d6f64656c732f4976613b4c000f69766156656e7461734f626a65637471007e00944c00056d6172636174001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f4d617263613b4c00066e6f6d62726571007e00034c000b70726f706965646164657371007e000c4c0005727562726f74001e4c636f6d2f707279736f66742f7064762f6d6f64656c732f527562726f3b4c000673746f636b7371007e000c4c000b766172696163696f6e657371007e000c787040a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000103f400000000000037372001f636f6d2e707279736f66742e7064762e6d6f64656c732e417472696275746f958c91130372a4bf02000344000d76616c6f724e756d657269636f4c0002696471007e00054c000576616c6f7271007e0003787000000000000000007371007e0010000000000000002c74000b415a554c204f534355524f7371007e009900000000000000007371007e00100000000000000027740004534c494d7371007e009900000000000000007371007e0010000000000000002f740006532f33382f317874000c31313438363233372e3032387400054a414f33387371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e0010000000000000031f7372001a636f6d2e707279736f66742e7064762e6d6f64656c732e4976611b08be52c45fc67802000444000a706f7263656e74616a655a00047469706f4c0002696471007e00054c00066e6f6d62726571007e0003787040350000000000000071007e002b740007497661203231257371007e00a840350000000000000171007e0026740007497661203231257372001c636f6d2e707279736f66742e7064762e6d6f64656c732e4d6172636154e87cd592358bde0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002b74000954617665726e6974697400044a45414e7371007e001c770c000000103f4000000000000373720020636f6d2e707279736f66742e7064762e6d6f64656c732e50726f706965646164b71fd5d2d11eb9590200034c0009617472696275746f7371007e000c4c0002696471007e00054c00066e6f6d62726571007e000378707371007e001c770c000000103f400000000000087371007e009900000000000000007371007e00100000000000000032740007584c2f34342f347371007e009900000000000000007371007e0010000000000000003374000858584c2f34362f357371007e009900000000000000007371007e0010000000000000003574000834584c2f35302f377371007e009900000000000000007371007e001000000000000000307400064d2f34302f327371007e009900000000000000007371007e0010000000000000003674000835584c2f35322f387371007e0099000000000000000071007e00a1740006532f33382f317371007e009900000000000000007371007e0010000000000000003474000833584c2f34382f367371007e009900000000000000007371007e001000000000000000317400064c2f34322f337871007e002b74000554414c4c457371007e00b27371007e001c770c000000103f400000000000037371007e009900000000000000007371007e0010000000000000002674000a455854524120534c494d7371007e0099000000000000000071007e009e740004534c494d7371007e009900000000000000007371007e00100000000000000028740005524543544f7871007e005274000543414c43457371007e00b27371007e001c770c000000203f4000000000000f7371007e009900000000000000007371007e0010000000000000001e740006424c414e434f7371007e009900000000000000007371007e00100000000000000022740004524f53417371007e009900000000000000007371007e0010000000000000001f740008414d4152494c4c4f7371007e009900000000000000007371007e0010000000000000002474000542454947457371007e009900000000000000007371007e00100000000000000023740008424f5244454155587371007e009900000000000000007371007e00100000000000000020740004475249537371007e0099000000000000000071007e0030740005415a554c207371007e009900000000000000007371007e0010000000000000002a7400074d415252c3934e7371007e0099000000000000000071007e0012740004524f4a4f7371007e009900000000000000007371007e0010000000000000003b74000854555251554553417371007e009900000000000000007371007e0010000000000000002174000556455244457371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e009900000000000000007371007e0010000000000000002974000743454c455354457371007e0099000000000000000071007e005c7400054e4547524f7371007e009900000000000000007371007e001000000000000000257400074d4f5354415a417871007e0021740005434f4c4f52787372001c636f6d2e707279736f66742e7064762e6d6f64656c732e527562726fdf63cc3d00c04ccf0200024c0002696471007e00054c00066e6f6d62726571007e0003787071007e002174000f50414e54414c4f4e20484f4d425245707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e0100000004007400043939393971007e003f740001587400085469636b657420587371007e001e01000000020174000330303671007e00307400014274000a464143545552415320427371007e001e01000000020174000331313371007e0075740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000020174000330303871007e003a740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330303971007e00707400014274000952454349424f5320427371007e001e01000000010174000330363371007e00357400014174000f4c49515549444143494f4e455320417371007e001e01000000040074000339393971007e005c7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000040174000330383071007e007a7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000331313671007e0048740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000010174000330303171007e002b7400014174000a464143545552415320417371007e001e01000000010174000330303271007e0021740001417400114e4f5441532044452044454249544f20417371007e001e01000000040074000339393871007e00667400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000331313271007e0061740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000020174000330383271007e00577400014274000f5449515545204641435455524120427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000010174000331313571007e007f740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330303471007e00267400014174000952454349424f5320417371007e001e01000000010174000330383171007e004d7400014174000f5449515545204641435455524120417371007e001e01000000010174000330303371007e0052740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330363471007e006b7400014274000f4c49515549444143494f4e455320427871007e002b740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e002b74000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e002b74001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e494120525554417400063434343434347400063434343434357371007e0002400000000000000074000d31313438363233372e30333436740001317371007e000b740001317400144869706f6c69746f497269676f79656e2034333671007e001274000e5275746120457869626963696f6e707371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000040074000339393971007e005c7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000010174000330303471007e00267400014174000952454349424f5320417371007e001e01000000010174000331313571007e007f740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000331313271007e0061740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000040074000339393871007e00667400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000010174000330383171007e004d7400014174000f5449515545204641435455524120417371007e001e01000000010174000330363371007e00357400014174000f4c49515549444143494f4e455320417371007e001e01000000020174000331313671007e0048740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000040174000330383071007e007a7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000020174000330383271007e00577400014274000f5449515545204641435455524120427371007e001e01000000020174000330303671007e00307400014274000a464143545552415320427371007e001e01000000020174000331313371007e0075740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303271007e0021740001417400114e4f5441532044452044454249544f20417371007e001e01000000010174000330303171007e002b7400014174000a464143545552415320417371007e001e01000000020174000330303871007e003a740001427400124e4f544153204445204352454449544f20427371007e001e01000000020174000330363471007e006b7400014274000f4c49515549444143494f4e455320427371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000330303971007e00707400014274000952454349424f5320427371007e001e01000000010174000330303371007e0052740001417400124e4f544153204445204352454449544f20417371007e001e0100000004007400043939393971007e003f740001587400085469636b657420587871007e002b740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e002b74000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e002b74001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e49412052555441740006343434343434740006343434343435740006343231343435707371007e009340a0cc0000000000409a8a0000000000000000014095eee147ae147b407c3800000000004087523d70a3d70a409a8a000000000040abc370a3d70a3d40b0cc0000000000000000007371007e001c770c000000103f400000000000037371007e0099000000000000000071007e009b74000b415a554c204f534355524f7371007e0099000000000000000071007e00b6740007584c2f34342f347371007e0099000000000000000071007e009e740004534c494d7874000c31313438363233372e3033347400054a414f34347371007e001c770c000000103f40000000000000787371007e001c770c000000103f40000000000000787371007e001000000000000003227371007e00a840350000000000000071007e002b740007497661203231257371007e00a840350000000000000171007e0026740007497661203231257371007e00ad71007e002b74000954617665726e6974697400044a45414e7371007e001c770c000000103f400000000000037371007e00b27371007e001c770c000000103f400000000000037371007e0099000000000000000071007e009e740004534c494d7371007e0099000000000000000071007e00d5740005524543544f7371007e0099000000000000000071007e00d074000a455854524120534c494d7871007e005274000543414c43457371007e00b27371007e001c770c000000203f4000000000000f7371007e0099000000000000000071007e00de740004524f53417371007e0099000000000000000071007e01017400074d4f5354415a417371007e0099000000000000000071007e00e474000542454947457371007e0099000000000000000071007e00fc74000743454c455354457371007e0099000000000000000071007e00e7740008424f5244454155587371007e0099000000000000000071007e00f774000556455244457371007e0099000000000000000071007e00db740006424c414e434f7371007e0099000000000000000071007e00e1740008414d4152494c4c4f7371007e0099000000000000000071007e005c7400054e4547524f7371007e0099000000000000000071007e0012740004524f4a4f7371007e0099000000000000000071007e0030740005415a554c207371007e0099000000000000000071007e00ef7400074d415252c3934e7371007e0099000000000000000071007e00ea740004475249537371007e0099000000000000000071007e00f474000854555251554553417371007e0099000000000000000071007e009b74000b415a554c204f534355524f7871007e0021740005434f4c4f527371007e00b27371007e001c770c000000103f400000000000087371007e0099000000000000000071007e00bc74000834584c2f35302f377371007e0099000000000000000071007e00a1740006532f33382f317371007e0099000000000000000071007e00bf7400064d2f34302f327371007e0099000000000000000071007e00c274000835584c2f35322f387371007e0099000000000000000071007e00b6740007584c2f34342f347371007e0099000000000000000071007e00b974000858584c2f34362f357371007e0099000000000000000071007e00c774000833584c2f34382f367371007e0099000000000000000071007e00ca7400064c2f34322f337871007e002b74000554414c4c45787371007e010471007e002174000f50414e54414c4f4e20484f4d425245707371007e001c770c000000103f40000000000000787371007e001400d7a8c574000b5265636f6e7175697374617371007e001a7371007e001c770c000000203f400000000000147371007e001e01000000020174000331313371007e0075740001427400175449515545204e4f5441204445204352454449544f20427371007e001e01000000010174000330303171007e002b7400014174000a464143545552415320417371007e001e01000000010174000331313271007e0061740001417400175449515545204e4f5441204445204352454449544f20417371007e001e01000000010174000330303271007e0021740001417400114e4f5441532044452044454249544f20417371007e001e0100000004007400043939393971007e003f740001587400085469636b657420587371007e001e01000000020174000330303671007e00307400014274000a464143545552415320427371007e001e01000000040174000330383071007e007a7400015a740038494e464f524d452044494152494f2044452043494552524520285a45544129202d20434f4e54524f4c41444f5245532046495343414c45537371007e001e01000000010174000331313571007e007f740001417400165449515545204e4f54412044452044454249544f20417371007e001e01000000010174000330303471007e00267400014174000952454349424f5320417371007e001e01000000020174000330303871007e003a740001427400124e4f544153204445204352454449544f20427371007e001e01000000040074000339393871007e00667400024e587400114e6f74612064652064c3a96269746f20787371007e001e01000000020174000330303771007e0012740001427400114e4f5441532044452044454249544f20427371007e001e01000000020174000331313671007e0048740001427400165449515545204e4f54412044452044454249544f20427371007e001e01000000020174000330363471007e006b7400014274000f4c49515549444143494f4e455320427371007e001e01000000010174000330383171007e004d7400014174000f5449515545204641435455524120417371007e001e01000000040074000339393971007e005c7400024e587400124e6f7461206465206372c3a96469746f20787371007e001e01000000020174000330383271007e00577400014274000f5449515545204641435455524120427371007e001e01000000010174000330363371007e00357400014174000f4c49515549444143494f4e455320417371007e001e01000000010174000330303371007e0052740001417400124e4f544153204445204352454449544f20417371007e001e01000000020174000330303971007e00707400014274000952454349424f5320427871007e002b740016526573706f6e7361626c6520496e736372c3ad70746f74000833333333333333337074001543616c6c652078782c206ec3ba6d65726f2031323374001363617361736f6e696140676d61696c2e636f6d707371007e0086770800000174be0da7807871007e002b74000f4341534120534f4e4941205255544174000a4341534120534f4e494174000853616e74612046657371007e001c770c000000103f400000000000017371007e008c0000000471007e002b74001950756e746f2064652076656e746120737563757273616c2031707874000f4341534120534f4e4941205255544174000634343434343474000634343434343578	Administrador Casa Sonia	1
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
\.


--
-- Data for Name: marcas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.marcas (id, nombre) FROM stdin;
1	Taverniti
2	Bando
3	Polo
4	Huapi
5	JOHN BRYAN
6	IDROGENO
7	PANTHER
8	TOCHE
9	NATAN
10	FIORINA
11	SOL Y ORO
12	PRIMICIA
13	BRACCO
14	LA RABONERA
15	LANTERMO
16	SAYER
17	RINALDI
18	JOSE HUESPE
19	MONACO
20	PLATINO
21	RENCA
22	LUPOMAR
23	CARMELA
24	SONIA SPORT
25	VALERIO
26	LAUBER
27	PICADILLY
28	FUS USA
29	BLACK CIRCUS
30	FULLBARCK
31	WORREN
32	PROYECT
33	YVES SAINT LAURENT
34	CC JEANS
35	TRY JEANS
36	VANCOUVER
37	S/N
41	R301
42	WRGE
43	YVESSAINTALAURENT
44	FULLBACK
45	OLMO
46	CACHAREL
47	PATO PAMPA JEANS
48	ROCHA
49	SUR LA COTE
50	WRANGLER
51	DUCK HEAD
52	SANTA FE POLO
53	CLAUDE LORRAIN
54	VENTUNO 21
55	SFT
56	FELUCCIO
\.


--
-- Data for Name: medios_pagos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.medios_pagos (id, nombre, sucursal_id, suma_en_cierre_de_caja) FROM stdin;
\.


--
-- Data for Name: medios_planes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.medios_planes (id_medio, id_plan) FROM stdin;
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
2	18
2	21
2	22
2	24
3	1
3	2
3	3
3	10
3	11
3	22
3	23
3	24
4	1
4	2
4	24
4	30
2	28
2	6
2	14
2	25
2	30
2	12
2	32
2	23
2	27
2	13
2	31
2	10
2	26
2	33
2	11
3	26
3	30
3	27
\.


--
-- Data for Name: planes_pagos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.planes_pagos (id, cuotas, nombre, porcentaje, sucursal_id) FROM stdin;
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
1	10335536.008	10335	2000	1580	2	60	420	672	Jean Taverniti Azul	1580	3200	3872	0	1	4	1	2	f
2	S1CH10%01S	ChR	1000	790	2	1966.94000000000005	210	623.059999999999945	Chomba Rayada	790	2966.94000000000005	3590	0	1	4	3	3	f
3	10856603.038	10856	1500	1185	2	60	315	504	Jean Taverniti Azul Jean	1185	2400	2904	0	1	4	1	2	f
173	6273216709	JC40	2450	1935.5	2	0	514.5	0	JEAN	1935.5	2450	4900	0	1	\N	1	2	f
309	02907263014042000	GA	0	0	1	4900	0	0	GABARDINA	0	0	0	0	1	4	4	2	f
350	SD54	M/LBX40	0.5	0.400000000000000022	2	-232.169999999999987	0.100000000000000006	-0.140000000000000013	DSADSAD	0.400000000000000022	-0.660000000000000031	-0.800000000000000044	0	1	4	2	7	f
32	02907263022040000	PGV	1990	1644.63000000000011	1	1307.51999999999998	345.370000000000005	5882.02999999999975	PANTALON GABARDINA	1644.63000000000011	28009.6500000000015	33891.6800000000003	0	1	4	4	2	f
33	02900264004040000	PPB	1990	1644.63000000000011	1	1307.51999999999998	345.370000000000005	5882.02999999999975	PANTALON PIQUE	1644.63000000000011	28009.6500000000015	33891.6800000000003	0	1	4	4	2	f
34	00488	PGV	1990	1644.63000000000011	1	1233.1400000000001	345.370000000000005	5571.1899999999996	PANTALON GABARDINA	1644.63000000000011	26529.4900000000016	32100.6800000000003	0	1	4	1	2	f
35	00202	PPB	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	PANTALON PIQUE	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
4	00406526.028	JA38	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
5	1185616249	JA38	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
6	5057	JC38	1700	1404.96000000000004	1	771.07000000000005	295.04000000000002	3109.7199999999998	JEAN	1404.96000000000004	14808.1900000000005	17917.9099999999999	0	1	4	2	2	f
7	i018158041028	JA38	1700	1404.96000000000004	1	1184.29999999999995	295.04000000000002	4584.94999999999982	JEAN	1404.96000000000004	21833.0999999999985	26418.0499999999993	0	1	4	7	2	f
8	5075	JA38	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	2	2	f
9	068006404150210000000280	JC38	1300	1074.38000000000011	1	923.139999999999986	225.620000000000005	2793.17000000000007	JEAN	1074.38000000000011	13300.8199999999997	16093.9899999999998	0	1	4	28	2	f
11	6410	JC38	1490	1231.40000000000009	1	981.07000000000005	258.600000000000023	3382.67000000000007	JEAN	1231.40000000000009	16107.9400000000005	19490.6100000000006	0	1	4	2	2	f
12	i018110131028	JC38	1500	1239.67000000000007	1	1136.3599999999999	260.329999999999984	3894.5300000000002	JEAN	1239.67000000000007	18545.4000000000015	22439.9300000000003	0	1	4	7	2	f
14	6483	JA38	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	2	2	f
25	00294	JA40	1900	1570.25	1	1653.72000000000003	329.75	6997.34000000000015	JEAN	1570.25	33320.6800000000003	40318.0199999999968	0	1	4	1	2	f
15	1724291	PGN	1400	1157.01999999999998	1	1071.06999999999994	242.97999999999999	3442.94999999999982	PANTALON GABARDINA	1157.01999999999998	16394.9799999999996	19837.9300000000003	0	1	4	6	2	f
17	02959255009038000	PGG	2000	1652.8900000000001	1	0	347.110000000000014	420	PANTALON GABARDINA	1652.8900000000001	2000	2420	0	1	4	4	2	f
18	02959252009038000	PGG	2000	1652.8900000000001	1	1297.51999999999998	347.110000000000014	5869.57999999999993	PANTALON GABARDINA	1652.8900000000001	27950.4000000000015	33819.9800000000032	0	1	4	4	2	f
20	02425395	PGV	2000	1652.8900000000001	1	1297.51999999999998	347.110000000000014	5869.57999999999993	PANTALON GABARDINA	1652.8900000000001	27950.4000000000015	33819.9800000000032	0	1	4	4	2	f
21	02959255004040000	PGB	2000	1652.8900000000001	1	1297.51999999999998	347.110000000000014	5869.57999999999993	PANTALON GABARDINA	1652.8900000000001	27950.4000000000015	33819.9800000000032	0	1	4	4	2	f
22	02959255010040000	pgn	2000	1652.8900000000001	1	1297.51999999999998	347.110000000000014	5869.57999999999993	pantalon gabardina	1652.8900000000001	27950.4000000000015	33819.9800000000032	0	4	4	4	2	f
23	02960201108040000	PGA	-2000	-1652.8900000000001	1	5297.52000000000044	-347.110000000000014	-22669.5800000000017	pantalon gabardina	-1652.8900000000001	-107950.399999999994	-130619.979999999996	0	1	4	4	2	f
24	6204	PGA	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	PANTALON GABARDINA	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	2	2	f
27	6224	PGV	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	PANTALON GABARDINA	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	2	2	f
28	02900264002040000	PP	1990	1644.63000000000011	1	1307.51999999999998	345.370000000000005	5882.02999999999975	PANTALON PIQUE	1644.63000000000011	28009.6500000000015	33891.6800000000003	0	1	4	4	2	f
29	02909264009040000	PP	1990	1644.63000000000011	1	-1989.67000000000007	345.370000000000005	-7896.93000000000029	PANTALON PIQUE	1644.63000000000011	-37604.4300000000003	-45501.3600000000006	0	1	4	4	2	f
31	02909264010040000	PPN	1990	1644.63000000000011	1	1307.51999999999998	345.370000000000005	5882.02999999999975	PANTALON PIQUE	1644.63000000000011	28009.6500000000015	33891.6800000000003	0	1	4	4	2	f
38	01960605.030	PGB	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	PANTALON GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
39	00202579.030	PPB	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	PANTALON PIQUE	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
10	art' 504438	JA38	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	2	2	f
44	02957263022040000	PGV	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	PANATLON GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	4	2	f
45	02916209005040000	PGB	1990	1644.63000000000011	1	1307.51999999999998	345.370000000000005	5882.02999999999975	PANTALON GABARDINA	1644.63000000000011	28009.6500000000015	33891.6800000000003	0	1	4	4	2	f
46	02907263002040000	PGB	1990	1644.63000000000011	1	1307.51999999999998	345.370000000000005	5882.02999999999975	PANTALON GABARDINA	1644.63000000000011	28009.6500000000015	33891.6800000000003	0	1	4	4	2	f
47	6213	JA	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	jean	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	2	2	f
48	016148041	JA	1500	1239.67000000000007	1	1136.3599999999999	260.329999999999984	3894.5300000000002	JEAN	1239.67000000000007	18545.4000000000015	22439.9300000000003	0	1	4	7	2	f
49	01428	JG	1990	1644.63000000000011	1	1233.1400000000001	345.370000000000005	5571.1899999999996	JEAN	1644.63000000000011	26529.4900000000016	32100.6800000000003	0	1	4	1	2	f
16	51238	GABN38	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
50	50940	JA40	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	JEAN 	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
37	680690362	JBEIG40	1300	1074.38000000000011	1	923.139999999999986	225.620000000000005	2793.17000000000007	JEAN	1074.38000000000011	13300.8199999999997	16093.9899999999998	0	1	4	28	2	f
26	152040	GABV40	1990	1644.63000000000011	1	481.069999999999993	345.370000000000005	2428.28999999999996	GABARDINA	1644.63000000000011	11563.2900000000009	13991.5799999999999	0	1	4	8	2	f
52	8352348974	JA40	1100	909.090000000000032	1	709.919999999999959	190.909999999999997	1870.92000000000007	JEAN	909.090000000000032	8909.1200000000008	10780.0400000000009	0	1	4	31	2	f
53	2110148355	JA40	1690	1396.69000000000005	1	1442.23000000000002	293.310000000000002	5473.36999999999989	JEAN	1396.69000000000005	26063.6899999999987	31537.0600000000013	0	1	4	3	2	f
54	01428620.030	JM40	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
55	01800208.030	JA40	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
56	068086904150750000000300	JC40	1390	1148.75999999999999	1	833.139999999999986	241.240000000000009	2723.84000000000015	JEAN	1148.75999999999999	12970.6499999999996	15694.4899999999998	0	1	4	1	2	f
57	S9JE07%BL40	JA40	1990	1644.63000000000011	1	1224.88000000000011	345.370000000000005	5536.67000000000007	JEAN	1644.63000000000011	26365.1100000000006	31901.7799999999988	0	1	4	3	2	f
58	6246	JC40	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	2	2	f
59	10160705.030	JN40	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
60	03130190%43300	JC40	1000	826.450000000000045	1	644.629999999999995	173.550000000000011	1563.72000000000003	JEAN	826.450000000000045	7446.30000000000018	9010.02000000000044	0	1	4	32	2	f
61	10874917.030	JA40	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
62	5021695332	JA40	1300	1074.38000000000011	1	675.210000000000036	225.620000000000005	2116.32000000000016	JEAN	1074.38000000000011	10077.7299999999996	12194.0499999999993	0	1	4	28	2	f
63	00368568.030	JC40	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
64	2464527178	JC40	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
65	1645607074	JN40	1700	1404.96000000000004	1	1101.65000000000009	295.04000000000002	4289.89000000000033	JEAN	1404.96000000000004	20428.0499999999993	24717.9399999999987	0	1	4	33	2	f
66	W0PA01%BK40	JN40	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	3	2	f
68	068008308450650000000300	JC40	1400	1157.01999999999998	1	823.139999999999986	242.97999999999999	2714.0300000000002	JEAN	1157.01999999999998	12923.9599999999991	15637.9899999999998	0	1	4	28	2	f
69	172954I	JC40	1600	1322.30999999999995	1	1036.3599999999999	277.689999999999998	3818.17000000000007	JEAN	1322.30999999999995	18181.7599999999984	21999.9300000000003	0	1	4	6	2	f
70	9646303964	JA40	1700	1404.96000000000004	1	1101.65000000000009	295.04000000000002	4289.89000000000033	JEAN	1404.96000000000004	20428.0499999999993	24717.9399999999987	0	1	4	33	2	f
72	i018109131030	JC40	1600	1322.30999999999995	1	1036.3599999999999	277.689999999999998	3818.17000000000007	JEAN	1322.30999999999995	18181.7599999999984	21999.9300000000003	0	1	4	7	2	f
73	10548	JA	-1900	-1570.25	1	5453.72000000000025	-329.75	-22159.3400000000001	jean	-1570.25	-105520.679999999993	-127680.020000000004	0	1	4	1	2	f
74	i015136041	JA	1500	1239.67000000000007	1	1136.3599999999999	260.329999999999984	3894.5300000000002	JEAN	1239.67000000000007	18545.4000000000015	22439.9300000000003	0	1	4	7	2	f
75	6203	JC	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	2	2	f
78	6420	JC	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	2	2	f
79	017122131030	JC	1500	1239.67000000000007	1	1136.3599999999999	260.329999999999984	3894.5300000000002	JEAN	1239.67000000000007	18545.4000000000015	22439.9300000000003	0	1	4	7	2	f
80	148740	P C J G	1400	1157.01999999999998	1	1236.3599999999999	242.97999999999999	3928.90000000000009	PANTALON CORTE YEAN	1157.01999999999998	18709.0400000000009	22637.9399999999987	0	1	4	8	2	f
81	01428712.032	JA42	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
82	01428670.032	JV42	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
83	01428670.034	JV44	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
84	01428670.038	JV48	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
85	01428670.036	JV46	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
86	01428712.036	JA46	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
88	01428712.038	JA48	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
91	01428683.036	JN46	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
92	01428683.038	JN48	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
93	01428683.032	JN42	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
94	ART'6276	JN40	1590	1314.04999999999995	1	881.07000000000005	275.949999999999989	3275.78999999999996	JEAN	1314.04999999999995	15599.0100000000002	18874.7999999999993	0	1	4	2	2	f
96	ART'6423	JC40	1590	1314.04999999999995	1	881.07000000000005	275.949999999999989	3275.78999999999996	JEAN	1314.04999999999995	15599.0100000000002	18874.7999999999993	0	1	4	2	2	f
97	00406929.030	JAO40	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
95	1016077!!40	JA40	1590	1314.04999999999995	1	881.07000000000005	275.949999999999989	3275.78999999999996	JEAN	1314.04999999999995	15599.0100000000002	18874.7999999999993	0	1	4	36	2	f
89	01428712.034	JA44	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
76	8625102352	JA40	800	661.159999999999968	1	514.049999999999955	138.840000000000003	1031.59999999999991	JEAN	661.159999999999968	4912.39999999999964	5944	0	1	4	35	2	f
77	015139041	JC40	1500	1239.67000000000007	1	1136.3599999999999	260.329999999999984	3894.5300000000002	JEAN	1239.67000000000007	18545.4000000000015	22439.9300000000003	0	1	4	7	2	f
98	8177798968	JC40	1200	991.740000000000009	1	411.569999999999993	208.259999999999991	1289.16000000000008	JEAN	991.740000000000009	6138.84000000000015	7428	0	1	4	37	2	f
99	5075122451	JA40	1190	983.470000000000027	1	619.919999999999959	206.530000000000001	1799.07999999999993	JEAN	983.470000000000027	8567.04999999999927	10366.1299999999992	0	1	4	31	2	f
100	8694983429	JA40	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
101	Q1181200063000	JG40	1400	1157.01999999999998	1	914.049999999999955	242.97999999999999	2981.30999999999995	JEAN	1157.01999999999998	14196.7000000000007	17178.0099999999984	0	1	4	41	2	f
102	00406709.030	JA40	2300	1900.82999999999993	1	1253.72000000000003	399.170000000000016	6538.47000000000025	JEAN	1900.82999999999993	31135.5600000000013	37674.0299999999988	0	1	4	1	2	f
103	175180I-000	JN40	1750	1446.27999999999997	1	1134.29999999999995	303.720000000000027	4536.05000000000018	JEAN	1446.27999999999997	21600.25	26136.2999999999993	0	1	4	6	2	f
90	01428683.034	JN44	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
104	01428606.030	JB40	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	Jean	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
105	1168265402	JB40	1600	1322.30999999999995	1	1036.3599999999999	277.689999999999998	3818.17000000000007	JEAN	1322.30999999999995	18181.7599999999984	21999.9300000000003	0	1	4	8	2	f
107	174037i%b630	JC40	1590	1314.04999999999995	1	1046.3599999999999	275.949999999999989	3827.69999999999982	JEAN	1314.04999999999995	18227.119999999999	22054.8199999999997	0	1	4	6	2	f
108	I017103041	JC40	1590	1314.04999999999995	1	1046.3599999999999	275.949999999999989	3827.69999999999982	JEAN	1314.04999999999995	18227.119999999999	22054.8199999999997	0	1	4	7	2	f
109	01428641.030	JM40	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
110	01428208.030	JC40	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
111	9743687042	JGN40	1600	1322.30999999999995	1	1036.3599999999999	277.689999999999998	3818.17000000000007	JEAN GABARDINA	1322.30999999999995	18181.7599999999984	21999.9300000000003	0	1	4	29	2	f
112	3547357956	JN40	1800	1487.59999999999991	1	1257.84999999999991	312.399999999999977	5132.67000000000007	JEAN	1487.59999999999991	24441.2999999999993	29573.9700000000012	0	1	4	33	2	f
41	01428705.030	JN40	1900	1570.25	1	1653.72000000000003	329.75	6997.34000000000015	JEAN	1570.25	33320.6800000000003	40318.0199999999968	0	1	4	1	2	f
113	01428646.030	JGMO30	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
114	2454434612	JGMO40	1800	1487.59999999999991	1	423.139999999999986	312.399999999999977	1977.47000000000003	JEAN GABARDINA	1487.59999999999991	9416.52000000000044	11393.9899999999998	0	1	4	2	2	f
115	3797803993	JGV40	1400	1157.01999999999998	1	914.049999999999955	242.97999999999999	2981.30999999999995	JEAN GABARDINA	1157.01999999999998	14196.7000000000007	17178.0099999999984	0	1	4	42	2	f
117	00406929.028	JA	2000	1652.8900000000001	1	1553.72000000000003	347.110000000000014	6945.61999999999989	JEAN	1652.8900000000001	33074.4000000000015	40020.0199999999968	0	1	4	1	2	f
118	018110131030	JC	1900	1570.25	1	736.360000000000014	329.75	3337.07999999999993	JEAN	1570.25	15890.8400000000001	19227.9199999999983	0	1	4	7	2	f
119	I017121131030	PA	1990	1644.63000000000011	1	646.360000000000014	345.370000000000005	3119.03999999999996	JEAN	1644.63000000000011	14852.5599999999995	17971.5999999999985	0	1	4	7	2	f
121	I016140041	JA	1990	1644.63000000000011	1	646.360000000000014	345.370000000000005	3119.03999999999996	JEAN	1644.63000000000011	14852.5599999999995	17971.5999999999985	0	1	4	7	2	f
122	10928536.030	JA	1990	1644.63000000000011	1	1563.72000000000003	345.370000000000005	6952.6899999999996	JEAN	1644.63000000000011	33108.0299999999988	40060.7200000000012	0	1	4	1	2	f
123	11148525.030	JC	1990	1644.63000000000011	1	1563.72000000000003	345.370000000000005	6952.6899999999996	JEAN	1644.63000000000011	33108.0299999999988	40060.7200000000012	0	1	4	1	2	f
124	6830801695400	JA	1500	1239.67000000000007	1	723.139999999999986	260.329999999999984	2592.88999999999987	JEAN	1239.67000000000007	12347.1000000000004	14939.9899999999998	0	1	4	28	2	f
126	01428615.030	JG	1990	1644.63000000000011	1	1307.51999999999998	345.370000000000005	5882.02999999999975	JEAN	1644.63000000000011	28009.6500000000015	33891.6800000000003	0	1	4	1	2	f
131	I017122131030	JC	1990	1644.63000000000011	1	902.559999999999945	345.370000000000005	4189.69999999999982	JEAN	1644.63000000000011	19950.9399999999987	24140.6399999999994	0	1	4	7	2	f
132	6806406157400	JC	1500	1239.67000000000007	1	1392.55999999999995	260.329999999999984	4701.5600000000004	JEAN	1239.67000000000007	22388.4000000000015	27089.9599999999991	0	1	4	28	2	f
138	02916209001042000	GB	1990	1644.63000000000011	1	2059.59000000000015	345.370000000000005	9024.93000000000029	GABARDINA	1644.63000000000011	42975.8399999999965	52000.7699999999968	0	1	4	4	2	f
139	02906205001042000	GB	1990	1644.63000000000011	1	2059.59000000000015	345.370000000000005	9024.93000000000029	GABARDINA	1644.63000000000011	42975.8399999999965	52000.7699999999968	0	1	4	4	2	f
142	6447	JGV	1900	1570.25	1	736.360000000000014	329.75	3337.07999999999993	JEAN GABARDINA	1570.25	15890.8400000000001	19227.9199999999983	0	1	4	2	2	f
143	02916209005042000	GV	2500	2066.11999999999989	1	1549.58999999999992	433.879999999999995	8660.35000000000036	GABARDINA	2066.11999999999989	41239.75	49900.0999999999985	0	1	4	4	2	f
144	02950252005042000	GG	1990490	1645033.06000000006	1	4900	345456.940000000002	20900145	GABARDINA	1645033.06000000006	99524500	120424645	0	1	4	4	2	f
145	02905202017042000	GV	1990	1644.63000000000011	1	2059.59000000000015	345.370000000000005	9024.93000000000029	GABARDINA	1644.63000000000011	42975.8399999999965	52000.7699999999968	0	1	4	4	2	f
146	02905209003042000	GB	1990	1644.63000000000011	1	2059.59000000000015	345.370000000000005	9024.93000000000029	GABARDINA	1644.63000000000011	42975.8399999999965	52000.7699999999968	0	1	4	4	2	f
147	00432681.032	GG	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
136	172424	JC40	1500	1239.67000000000007	1	1136.3599999999999	260.329999999999984	3894.5300000000002	JEAN	1239.67000000000007	18545.4000000000015	22439.9300000000003	0	1	4	6	2	f
137	172764	JC40	1500	1239.67000000000007	1	1136.3599999999999	260.329999999999984	3894.5300000000002	JEAN	1239.67000000000007	18545.4000000000015	22439.9300000000003	0	1	4	6	2	f
120	w0je04%bl40	JA40	1990	1644.63000000000011	1	1224.88000000000011	345.370000000000005	5536.67000000000007	JEAN	1644.63000000000011	26365.1100000000006	31901.7799999999988	0	1	4	3	2	f
106	779776132294840	GABV40	1450	1198.34999999999991	1	525.210000000000036	251.650000000000006	1903.76999999999998	GABARDINA	1198.34999999999991	9065.54999999999927	10969.3199999999997	0	1	4	44	2	f
140	02907204002042000	GABBEIG42	1900	1570.25	1	2149.59000000000015	329.75	8975.86000000000058	GABARDINA	1570.25	42742.2099999999991	51718.0699999999997	0	1	4	4	2	f
130	6425	JAO40	1990	1644.63000000000011	1	902.559999999999945	345.370000000000005	4189.69999999999982	JEAN	1644.63000000000011	19950.9399999999987	24140.6399999999994	0	1	4	2	2	f
148	10630604	GV	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
149	10016604.032	GV	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
150	10712625.032	GV	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABRDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
151	01960604.032	GV	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
152	00918641	GB	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
157	02776209005042000	PPV	1900	1570.25	1	4900	329.75	19950	POPLIN	1570.25	95000	114950	0	1	4	4	2	f
158	02957263022042000	GV	1900	1570.25	1	4900	329.75	19950	GAABRDINA	1570.25	95000	114950	0	1	4	4	2	f
159	02959255004042000	GB	1900	1570.25	1	4900	329.75	19950	GABARDINA	1570.25	95000	114950	0	1	4	4	2	f
160	02957209005042000	PV	1900	1570.25	1	4900	329.75	19950	POPLIN	1570.25	95000	114950	0	1	4	4	2	f
162	02777209005042000	PV	1900	1570.25	1	4900	329.75	19950	POPLIN	1570.25	95000	114950	0	1	4	4	2	f
164	00488604.032	GV	1900	1570.25	1	3900	329.75	15960	GABARDINA	1570.25	76000	91960	0	1	4	1	2	f
165	00482604.032	GV	1900	1570.25	1	3900	329.75	15960	GABARDINA	1570.25	76000	91960	0	1	4	1	2	f
172	6484788986	JC38	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	jean	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
174	1961672400	GAAZ40	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
175	8080650153	GAAZ40	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
176	2856802000	JAZ40	1195	987.600000000000023	1	780.210000000000036	207.400000000000006	2208.88999999999987	JEAN	987.600000000000023	10518.5100000000002	12727.3999999999996	0	1	4	30	2	f
177	7797713310948	GAVE40	1395	1152.8900000000001	1	910.789999999999964	242.110000000000014	2961.11000000000013	GABARDINA	1152.8900000000001	14100.5200000000004	17061.630000000001	0	1	4	44	2	f
179	175615i'20v%2e30	JCE40	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
180	I018108131030	JCE40	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
181	6135489930	GABE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
182	7797713200942	GAVE42	1395	1152.8900000000001	1	910.789999999999964	242.110000000000014	2961.11000000000013	GABARDINA	1152.8900000000001	14100.5200000000004	17061.630000000001	0	1	4	44	2	f
183	7797751320091	GAVE42	1390	1148.75999999999999	1	915.789999999999964	241.240000000000009	2965.09000000000015	GABARDINA	1148.75999999999999	14119.4799999999996	17084.5699999999997	0	1	4	44	2	f
185	4462582900	GAVE42	1350	1115.70000000000005	1	955.789999999999964	234.300000000000011	2993.17000000000007	GABARDINA	1115.70000000000005	14253.1700000000001	17246.3400000000001	0	1	4	30	2	f
187	7797132750943	GAMA42	1195	987.600000000000023	1	780.210000000000036	207.400000000000006	2208.88999999999987	GABARDINA	987.600000000000023	10518.5100000000002	12727.3999999999996	0	1	4	44	2	f
189	779751320091	GAGR42	1190	983.470000000000027	1	785.210000000000036	206.530000000000001	2212.13999999999987	GABARDINA	983.470000000000027	10534	12746.1399999999994	0	1	4	44	2	f
190	2179365912	GAVE42	1190	983.470000000000027	1	785.210000000000036	206.530000000000001	2212.13999999999987	GABARDINA	983.470000000000027	10534	12746.1399999999994	0	1	4	44	2	f
191	2505628533	GAVE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	46	2	f
192	1527152436	JECE40	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	1	2	f
193	9992707485	GABE40	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
154	02907208005042000	PV	1900	1570.25	1	2149.59000000000015	329.75	8975.86000000000058	PANTALON PIQUE	1570.25	42742.2099999999991	51718.0699999999997	0	1	4	4	2	f
155	02906208005042000	PIV42	1900	1570.25	1	2149.59000000000015	329.75	8975.86000000000058	PANTALON PIQUE	1570.25	42742.2099999999991	51718.0699999999997	0	1	4	4	2	f
156	02909264009042000	PPIV42	1900	1570.25	1	2149.59000000000015	329.75	8975.86000000000058	PANTALON PIQUE	1570.25	42742.2099999999991	51718.0699999999997	0	1	4	4	2	f
188	9439001283	PPIV42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
171	172954i%ai32	JAO42	1500	1239.67000000000007	1	1144.63000000000011	260.329999999999984	3920.57999999999993	JEAN	1239.67000000000007	18669.4500000000007	22590.0299999999988	0	1	4	6	2	f
178	3292910168	GABEIG38	1450	1198.34999999999991	1	946.690000000000055	251.650000000000006	3187.17000000000007	GABARDINA	1198.34999999999991	15177.0100000000002	18364.1800000000003	0	1	4	45	2	f
166	s7pa03%na40	POAO40	2000	1652.8900000000001	1	2049.59000000000015	347.110000000000014	9028.28000000000065	POPLIN	1652.8900000000001	42991.8000000000029	52020.0800000000017	0	1	4	3	2	f
167	9916	POAO42	1900	1570.25	1	2149.59000000000015	329.75	8975.86000000000058	POPLIN GARGO	1570.25	42742.2099999999991	51718.0699999999997	0	1	4	3	2	f
184	8819023426	GABV42	1395	1152.8900000000001	1	910.789999999999964	242.110000000000014	2961.11000000000013	GABARDINA	1152.8900000000001	14100.5200000000004	17061.630000000001	0	1	4	28	2	f
168	02106540	GABAO40	1900	1570.25	1	2149.59000000000015	329.75	8975.86000000000058	GABARDINA	1570.25	42742.2099999999991	51718.0699999999997	0	1	4	33	2	f
194	2411015500	GABE40	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
197	7831202669	JECE40	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
195	6882812819	GABBEIG40	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	GABARDINA	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	47	2	f
196	3058915022	JEGR40	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
198	02958255020042000	GAMA42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
199	00432604.032	GAVE42	1950	1611.56999999999994	1	2099.59000000000015	338.430000000000007	9007.31999999999971	GABARDINA	1611.56999999999994	42892.010000000002	51899.3300000000017	0	1	4	1	2	f
200	10710668.032	GAVE42	1950	1611.56999999999994	1	2099.59000000000015	338.430000000000007	9007.31999999999971	GABARDINA	1611.56999999999994	42892.010000000002	51899.3300000000017	0	1	4	1	2	f
201	02906205003042000	POBE42	1950	1611.56999999999994	1	2099.59000000000015	338.430000000000007	9007.31999999999971	POPLIN	1611.56999999999994	42892.010000000002	51899.3300000000017	0	1	4	4	2	f
203	02959255020042000	GAMA42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
205	art'6274	GABE42	1645	1359.5	1	1074.00999999999999	285.5	4055.61999999999989	GABARDINA	1359.5	19312.4599999999991	23368.0800000000017	0	1	4	2	2	f
206	02907209005042000	POVE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
208	ART-6447	GAVE42	1845	1524.78999999999996	1	1204.58999999999992	320.20999999999998	5054.63000000000011	GABARDINA	1524.78999999999996	24069.6899999999987	29124.3199999999997	0	1	4	2	2	f
214	02907263011042000	GAMOS42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
215	02907208003042000	POBE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN FINO	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
220	03130030	GABE42	1450	1198.34999999999991	1	946.690000000000055	251.650000000000006	3187.17000000000007	GABARDINA	1198.34999999999991	15177.0100000000002	18364.1800000000003	0	1	4	32	2	f
221	7532956916	GABE42	1395	1152.8900000000001	1	910.789999999999964	242.110000000000014	2961.11000000000013	GABARDINA CARGO	1152.8900000000001	14100.5200000000004	17061.630000000001	0	1	4	44	2	f
222	02969250002042000	GABE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
225	8097845341	GABE42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
227	02959200011042000	GATOS42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
230	02956205001042000	POBE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
231	8370060882	GABE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
232	4715480089	GAMOS42	1295	1070.25	1	845.5	224.75	2571.28999999999996	GABARDINA	1070.25	12244.2299999999996	14815.5200000000004	0	1	4	31	2	f
235	00482605.034	GB	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
239	02908255020042000	GM	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
216	02907208002042000	PPIBEIG42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
217	02908264002044000	PPIBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
218	02906208007042000	PPIBEIG42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE FINO	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
219	02907208007042000	PPIBEIG42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE FINO	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
228	02900264002042000	PPIBEIG42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
229	02950264004042000	PPIBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
233	02950264006042000	PPIV42	2490	2057.84999999999991	1	1559.58999999999992	432.149999999999977	8678	PANTALON PIQUE	2057.84999999999991	41323.7900000000009	50001.7900000000009	0	1	4	4	2	f
236	02806208007042020	PPIBEIG42	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	PANTALON PIQUE	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
240	02907263002042000	GB	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
241	591011900bei.42	GB	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GAABRDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	48	2	f
242	01110641.032	GB	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GAABRDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
243	1320	GB	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	30	2	f
253	00482629.032	GB	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
261	7797713310931	GGA	1400	1157.01999999999998	1	988.42999999999995	242.97999999999999	3199.98000000000002	GABARDINA CARGO	1157.01999999999998	15238.0200000000004	18438	0	1	4	30	2	f
263	02960204008042000	GA	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
265	02900218010042000	GA	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
266	02659209008042000	PA	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	POPLIN	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
269	172429i'000%1032	GANE42	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
270	9409288350	GANE42	2190	1809.92000000000007	1	1363.72000000000003	380.079999999999984	6731.64999999999964	GABARDINA	1809.92000000000007	32055.4700000000012	38787.1200000000026	0	1	4	1	2	f
273	02960201108042000	GAAZ42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
274	02969250008042000	GAAZ24	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
278	02776209010042000	POAZ42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN FIRME	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
282	02957209009042000	POGR42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN FIRME	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
283	02959255009042000	GAGR42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABAARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
284	02959255010042000	GANE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
285	w0pa03%na42	GAAZ42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	3	2	f
287	00654603.032	GAAZ42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
255	02950264009042000	PPIGR42	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	PANTALON PIQUE	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
257	161142	PPIA42	1900	1570.25	1	992.559999999999945	329.75	4359.3100000000004	PANTALON PIQUE	1570.25	20758.6399999999994	25117.9500000000007	0	1	4	8	2	f
279	02950264008042000	PPIAO42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
280	02958264010042000	PPIAO42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
246	s5je05%be42	GABBEIG42	2200	1818.18000000000006	1	1849.58999999999992	381.819999999999993	9007.11000000000058	GABARDINA	1818.18000000000006	42890.9800000000032	51898.0899999999965	0	1	4	3	2	f
258	00501542	GABAO42	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	33	2	f
248	6643990553	GABBEIG42	1500	1239.67000000000007	1	896.690000000000055	260.329999999999984	3139.57000000000016	GABARDINA	1239.67000000000007	14950.3500000000004	18089.9199999999983	0	1	4	45	2	f
247	680140580	GABBEIG42	1500	1239.67000000000007	1	1144.63000000000011	260.329999999999984	3920.57999999999993	GABARDINA	1239.67000000000007	18669.4500000000007	22590.0299999999988	0	1	4	28	2	f
249	85020042	GM	2200	1818.18000000000006	1	1519.00999999999999	381.819999999999993	7479.82999999999993	GABARDINA	1818.18000000000006	35618.2200000000012	43098.0500000000029	0	1	4	49	2	f
256	01608342	GABAO42	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	33	2	f
286	00101642	GABA42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
252	779713810094042	GABV42	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
262	00432603.032	GABAO42	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
290	11098603.032	GAAZ42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
291	5714942	GABAO42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
292	842.250	GAAZ42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	49	2	f
294	02950252008042000	GAAZ42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
295	02806201008042020	GAAZ42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
297	10252603.032	GAAZ42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
298	10716603.032	GAAZ42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
299	59148	GANE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
301	01428705.032	JENE42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
302	8157177918	GANE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	49	2	f
304	02900262010042000	GANE42	4250	3512.40000000000009	1	-200.409999999999997	737.600000000000023	-896.159999999999968	GABARDINA	3512.40000000000009	-4267.42000000000007	-5163.57999999999993	0	1	4	4	2	f
305	6304006044	GANE42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	49	2	f
306	6274	GANE42	1645	1359.5	1	1074.00999999999999	285.5	4055.61999999999989	GABARDINA	1359.5	19312.4599999999991	23368.0800000000017	0	1	4	2	2	f
310	02909206008042000	GA	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
311	02909201009042000	GG	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
314	6840506157300	JA	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	28	2	f
315	680990173	JA	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	28	2	f
317	01428705	JN	1900	1570.25	1	1653.72000000000003	329.75	6997.34000000000015	JEAN	1570.25	33320.6800000000003	40318.0199999999968	0	1	4	1	2	f
319	7797765213228	JG	1100	909.090000000000032	1	875.210000000000036	190.909999999999997	2252.73999999999978	JEAN	909.090000000000032	10727.3099999999995	12980.0499999999993	0	1	4	30	2	f
323	02958262010042000	GN	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GAABRDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
324	02909201010042000	GN	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
325	02909209010042000	GN	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GAABRDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
327	01428620.032	JM	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
328	7797771132049	JA	1500	1239.67000000000007	1	475.20999999999998	260.329999999999984	1811.91000000000008	JEAN	1239.67000000000007	8628.14999999999964	10440.0599999999995	0	1	4	30	2	f
329	01428603.032	JA	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
330	1469063902	JEBO42	1650	1363.6400000000001	1	1573.1400000000001	286.360000000000014	5797.43000000000029	JEAN	1363.6400000000001	27606.8100000000013	33404.239999999998	0	1	4	1	2	f
331	01428683032	JEAZ42	1650	1363.6400000000001	1	1573.1400000000001	286.360000000000014	5797.43000000000029	JEAN	1363.6400000000001	27606.8100000000013	33404.239999999998	0	1	4	1	2	f
332	201428683.03201428683.032	JEAZ42	1650	1363.6400000000001	1	1573.1400000000001	286.360000000000014	5797.43000000000029	JEAN	1363.6400000000001	27606.8100000000013	33404.239999999998	0	1	4	1	2	f
333	00314920.032	JEAZ42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
335	172763i%x232172763i%x232	JECE42	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
336	1808382424	JECE42	1650	1363.6400000000001	1	1573.1400000000001	286.360000000000014	5797.43000000000029	JEAN	1363.6400000000001	27606.8100000000013	33404.239999999998	0	1	4	50	2	f
316	PATO PANPA	PPIAO42	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	PANTALON PIQUE	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	47	2	f
320	w0pa01%bk42	JN42	1900	1570.25	1	1653.72000000000003	329.75	6997.34000000000015	JEAN	1570.25	33320.6800000000003	40318.0199999999968	0	1	4	3	2	f
313	00486603.032	GABAO42	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
326	50742	JGR42	1500	1239.67000000000007	1	1219.00999999999999	260.329999999999984	4154.88000000000011	JEAN	1239.67000000000007	19785.1500000000015	23940.0299999999988	0	1	4	29	2	f
337	01428505.032	JECE42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
339	11278536.032	JEAZ42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
340	01428505.03201428505.032	JEAZ42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
341	01428634.032	JEVE42	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
342	68-1020415-2100	JEAZ42	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
343	01428606.032	JEBO42	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
344	8993467653	JEBO42	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
345	01428634.03201428634.03201428634.032	JEVE42	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
346	5231974573	JN42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
347	7797761322122	JA42	1700	1404.96000000000004	1	275.20999999999998	295.04000000000002	1339.5	JEAN	1404.96000000000004	6378.56999999999971	7718.06999999999971	0	1	4	44	2	f
348	01428668.032	JMARR42	1950	1611.56999999999994	1	1273.1400000000001	338.430000000000007	5623.01000000000022	JEAN	1611.56999999999994	26776.2299999999996	32399.2400000000016	0	1	4	1	2	f
354	00476603.032	JA42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
355	01428230.032	JA42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
356	11266235.032	JA42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
357	01428679.032	JA42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
358	w6je09-ebl42	JAO42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
361	w8je01%bl42	JAO42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
362	w0je04%bl42	JN42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
363	10856603.032	JA42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
364	22900224001042000	JAO42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
365	22900227001042000	JAO42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
366	22909224003042000	JA42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
367	11148525.032	JC42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
368	5251706019	BERA38	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	BERMUDA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	1	8	f
369	i621104041280	BERA38	1300	1074.38000000000011	1	923.139999999999986	225.620000000000005	2793.17000000000007	BERMUDA	1074.38000000000011	13300.8199999999997	16093.9899999999998	0	1	4	7	8	f
370	9001040000	BERGBEIG38	1590	1314.04999999999995	1	1542.23000000000002	275.949999999999989	5483.40999999999985	BERMUDA GABARDINA	1314.04999999999995	26111.4599999999991	31594.869999999999	0	1	4	4	8	f
371	3130520%8028	BERAO838	800	661.159999999999968	1	679.340000000000032	138.840000000000003	1309.28999999999996	BERMUDA	661.159999999999968	6234.72000000000025	7544.01000000000022	0	1	4	32	8	f
372	I616111041	BERGR	1200	991.740000000000009	1	857.850000000000023	208.259999999999991	2413.7800000000002	BERMUDA	991.740000000000009	11494.2000000000007	13907.9799999999996	0	1	4	7	8	f
373	06874955.l	REMAOLLIS	1200	991.740000000000009	1	535.539999999999964	208.259999999999991	1601.55999999999995	REMERA	991.740000000000009	7626.47999999999956	9228.04000000000087	0	1	4	1	6	f
374	06874955.xl	REMAOXLLIS	1050	867.769999999999982	1	685.539999999999964	182.22999999999999	1732.11999999999989	REMERA	867.769999999999982	8248.17000000000007	9980.29000000000087	0	1	4	1	6	f
376	01428208.032	JA42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
377	00406929.032	JAO42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
378	01428206.032	JAO42	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
379	011776!012!14	JA42	1700	1404.96000000000004	1	1192.55999999999995	295.04000000000002	4614.4399999999996	JEAN	1404.96000000000004	21973.5200000000004	26587.9599999999991	0	1	4	8	2	f
380	art'6423	JC42	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
381	01428232.032	JAO42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
383	q1181200124200	JA42	1400	1157.01999999999998	1	914.049999999999955	242.97999999999999	2981.30999999999995	JEAN	1157.01999999999998	14196.7000000000007	17178.0099999999984	0	1	4	41	2	f
384	art'6259	JAO42	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
386	11148205.032	JAO42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
387	10918235.032	JAO42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
382	art' 634042	JA42	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
352	s9je07%bl42	JAO42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
388	I016118041	JA42	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	7	2	f
389	11258603.032	JAO42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
391	art' 505742	JC42	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
390	068008602840420000000320	JA42	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
392	10928536.032	JA42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
393	s9je01%bl42	JAO42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
394	01800712.032	JAO42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
395	s9je06%bl42	JAO42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
396	11184525.032	JC42	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
397	22909240005042000	JAO42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
398	172941i%p132	JBL42	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
399	068018706150710000000320	JAO42	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
401	02956205001044000	POBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
402	02777209001044000	POBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
275	02959209008042000	POA42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
403	02957209001044000	POBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
404	02950255020044000	GABMARR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
405	art'6447	GABBEIG44	1800	1487.59999999999991	1	1249.58999999999992	312.399999999999977	5101.44999999999982	GABARDINA	1487.59999999999991	24292.619999999999	29394.0699999999997	0	1	4	2	2	f
407	s9pa01%be44	GABBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	3	2	f
408	00432629.034	GABBEIG44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
409	01428624.034	GABMARR44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
410	s7pa03%be44	GABBEIG44	2500	2066.11999999999989	1	1623.97000000000003	433.879999999999995	9050.84000000000015	GABARDINA	2066.11999999999989	43099.25	52150.0899999999965	0	1	4	3	2	f
411	02777209003044000	POV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
414	591011900bei.44	GABBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	48	2	f
416	02959200011044000	GL44	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
418	00482629.034	GABBEIG44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
419	068001405800920110000340	POBEIG44	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	POPLIN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
420	10712605.034	GABBEIG44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
422	068001404410920050000340	POMARR44	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	POPLIN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
423	02900255020044000	GABMARR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
424	02950252038044000	GABMARR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
425	02909201038044000	GABMARR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
426	02657209001044000	GABBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
427	02900262025044000	GABMARR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
428	02908255020044000	GABMARR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
204	02900264004042000	PPIBEIG42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
293	2477047578	PPIAO42	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	PANTALON PIQUE	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	47	2	f
169	779771320092840	GABBEIG40	1000	826.450000000000045	1	975.210000000000036	173.550000000000011	2257.94000000000005	GABARDINA	826.450000000000045	10752.1000000000004	13010.0400000000009	0	1	4	30	2	f
412	02908207005044000	PIV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
413	02908264004044000	PIV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
415	02950264002044000	PIBEIG44	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	PANTALON PIQUE	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
417	02950264004044000	PIV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
429	02900264004044000	PPIV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
430	02900264002044000	PPIBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
421	779776138109944	GABBEIG44	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
431	02908208002044000	PPIBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE FINO	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
432	02916209001044000	POBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN FIRME	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
434	02906205003044000	POBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
433	02905209003044000	POBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN FIRME	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
435	02907209003044000	POBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
436	02906205001044000	POBEIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
437	02950252005044000	GABGR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
438	q1181210503442	GABV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	41	2	f
439	02957209009044000	POGR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN FIRME	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
440	02959255009044000	GABV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
441	02907209005044000	POV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN FIRME	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
442	02909201009044000	GABG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
443	02950264009044000	PPIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
444	02950264006044000	PPIV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
445	02957209005044000	POV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN FIRME	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
446	654616516516516566	GABV44	1450	1198.34999999999991	1	946.690000000000055	251.650000000000006	3187.17000000000007	GABARDINA	1198.34999999999991	15177.0100000000002	18364.1800000000003	0	1	4	45	2	f
447	02659209005044000	POV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
448	02900264006044000	PPIV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
449	02908264006044000	PPIV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
450	02906264006044000	PPIV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
451	02908207009044000	PPIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE 	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
452	02909264009044000	PPIG44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
453	02900264009044000	PPIGR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
454	02905264010044000	PPIGR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
455	02950255009044000	GABGR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
456	02908201005044000	GABGR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
458	00482604.034	GABV44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
460	w3je10%ol44	GABV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	3	2	f
461	172429i%3534	GABV44	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
463	w3je10%ol42	GABV42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	3	2	f
464	10630604.034	GABV44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
465	10710604.034	GABV44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
466	02909209008044000	POAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
467	10716603.034	GABAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
468	02778255008044000	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
470	02908255008044000	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
469	02907263014044000	GABA44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
471	02907262008044000	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
472	011771!012!15	GABAO44	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	GABARDINA	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
462	779771322092644	GABBEIG44	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
473	611811803nav.44	GABAO44	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	GABARDINA	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	51	2	f
406	161144	PPIBEIG44	1700	1404.96000000000004	1	1192.55999999999995	295.04000000000002	4614.4399999999996	PANTALON PIQUE	1404.96000000000004	21973.5200000000004	26587.9599999999991	0	1	4	8	2	f
475	02908208008044000	PPI	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	PANTALON PIQUE	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	4	2	f
476	02900264008044000	PPIAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
477	02950264008044000	PPIAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
478	011082!012!15	GABAO44	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	GABARDINA	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
479	011742!019!15	GABC44	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	GABARDINA	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
480	00432603.034	GABAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
481	691811900nav.34	GABAO44	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	GABARDINA	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	51	2	f
482	02960204008044000	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA CON MICRO	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
483	02959252008044000	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
484	02808208008044020	PPIAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE FINO	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
485	02957263014044000	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
486	02960201108044000	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
487	7797713220933	GABAO44	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
488	068009901730510180000340	GABAO44	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
489	7797138100933	GABAO44	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
490	w0pa03%na44	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	3	2	f
491	02950264010044000	PPIN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
492	7797138100919	GABN44	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
493	02958264010044000	PPIN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
494	02777254010044000	PPIN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE CON MICRO	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
495	01428705.034	GABN44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
497	01428680.034	GABN44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
498	02778255010044000	GABN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
499	02900264010044000	PPIN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE CON LYCRA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
500	02900262010044000	GABN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
501	02900218010044000	GABN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
502	w0pa01%bk44	GABN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	3	2	f
503	02956205010044000	PON44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
504	art'6317	GABN44	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	2	2	f
505	01428603.034	JA44	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
506	01428668.034	JBEIG44	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
507	11266235.034	JAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
508	00314714.034	JA44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
509	00314920.034	JAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
510	01428618.034	JV44	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
511	01428503.034	JA44	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
512	art' 6267	JA44	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
514	10856603.034	JAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
515	22909228004044000	JA44	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
518	779771132723844	JA044	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	JEAN	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
375	779771132723842	JAO42	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	JEAN	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
519	art' 505744	JC44	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	2	2	f
520	01428232.034	JAO44	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
521	11194204.034	JA44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
522	11258206.034	JA44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
523	I017104041	JAO44	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	7	2	f
524	011776!012!15	JA44	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	JEAN	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
525	00406526.034	JA44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
526	s9je08%bl44	JA44	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
528	03007444	JC44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
529	s9je07%bl44	JAO44	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
531	10928536.034	JC44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
532	02907344	JAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
534	I015139041	JC44	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	7	2	f
535	173594i%p434	JC44	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
536	I02010713134	JC44	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	7	2	f
537	01428505.034	JA44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
538	068063006540350000000330	JA44	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
539	11148525.034	JC44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
540	511811803blu.44	JA44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	48	2	f
541	00406522.028	JC38	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
542	00406522.030	JC40	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
543	00406522.032	JC42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
544	00406522.036	JC46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
545	00406522.038	JC48	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
546	00406929.034	JAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
547	01428208.034	JC44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
135	1727631	JC40	1500	1239.67000000000007	1	1136.3599999999999	260.329999999999984	3894.5300000000002	JEAN	1239.67000000000007	18545.4000000000015	22439.9300000000003	0	1	4	6	2	f
548	175620i'20v%2e34	JA044	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
549	01428206.034	JAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
550	04609044	JAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
551	art'5071	JAO44	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
552	w0je04%bl44	JAO44	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
553	11148205.034	JAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
554	art'5012	JAO44	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
555	01428679.034	JAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
556	1016077!!44	JA44	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	36	2	f
517	02106546	GABAO46	2400	1983.47000000000003	1	1649.58999999999992	416.529999999999973	8817.93000000000029	GABARDINA	1983.47000000000003	41990.1600000000035	50808.0899999999965	0	1	4	33	2	f
527	22900221003044000	JC44	2450	2024.78999999999996	1	1269.00999999999999	425.20999999999998	7043.5600000000004	JEAN	2024.78999999999996	33540.739999999998	40584.3000000000029	0	1	4	4	2	f
530	22900227001044000	JAO44	2450	2024.78999999999996	1	1269.00999999999999	425.20999999999998	7043.5600000000004	JEAN	2024.78999999999996	33540.739999999998	40584.3000000000029	0	1	4	4	2	f
533	22909220005044000	JA44	2450	2024.78999999999996	1	1269.00999999999999	425.20999999999998	7043.5600000000004	JEAN	2024.78999999999996	33540.739999999998	40584.3000000000029	0	1	4	4	2	f
557	068008303520410000000340	JA44	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
558	02807144	JA44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
559	068030801690540000000340	JAO44	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
560	02606944	JN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
561	01098230.034	JA44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
562	11192204.034	JC44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
563	art' 504444	JA44	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
564	3818967358	JA42	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
565	4243707248	JA44	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
566	5865987981	JA46	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
567	7513925303	JA48	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
568	2225199893	JA50	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
569	6441702133	JN42	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
570	7260118168	JN44	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
571	9429497122	JN46	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
572	9362747572	JN48	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
573	7033522601	JN50	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
574	9592233093	JA42	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
575	7442638061	JA44	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
576	2656225896	JA46	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
577	3131810760	JA48	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
578	3025793252	JA50	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
579	3473063512	JAO42	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
580	7543981427	JAO44	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
581	5106953955	JAO46	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
582	4449649820	JAO48	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
583	4754721922	JAO50	1250	1033.05999999999995	1	807.850000000000023	216.939999999999998	2383.11000000000013	JEAN	1033.05999999999995	11348.1299999999992	13731.2399999999998	0	1	4	52	2	f
584	00501544	GABN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
585	01405144	GABN44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
586	01102044	JGR44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
587	8820064967	JA44	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	JEAN	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
588	1898891578	JAO44	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	JEAN	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
589	11092711.036	JAO46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
590	11092711.034	JAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
591	11092711.032	JAO42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
592	11092711.038	JAO48	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
593	51242	GABN42	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
594	51244	GABN44	1600	1322.30999999999995	1	375.20999999999998	277.689999999999998	1596.71000000000004	GABARDINA	1322.30999999999995	7603.35999999999967	9200.06999999999971	0	1	4	29	2	f
595	51246	GABN46	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
36	51140	GABBX40	1500	1239.67000000000007	1	1219.00999999999999	260.329999999999984	4154.88000000000011	GABARDINA	1239.67000000000007	19785.1500000000015	23940.0299999999988	0	1	4	29	2	f
596	51240	GABN40	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
597	51248	GABN48	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
598	50844	GABN44	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA 	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
599	508441	GABAO44	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
600	9469722144	PPIN44	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	PANTALON PIQUE	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	47	2	f
601	3518123056	GABN44	1450	1198.34999999999991	1	946.690000000000055	251.650000000000006	3187.17000000000007	GABARDINA	1198.34999999999991	15177.0100000000002	18364.1800000000003	0	1	4	45	2	f
602	5070655271	JN44	1600	1322.30999999999995	1	1127.26999999999998	277.689999999999998	4123.63000000000011	JEAN	1322.30999999999995	19636.3199999999997	23759.9500000000007	0	1	4	19	2	f
603	9672150925	JAO44	1600	1322.30999999999995	1	1127.26999999999998	277.689999999999998	4123.63000000000011	JEAN	1322.30999999999995	19636.3199999999997	23759.9500000000007	0	1	4	19	2	f
604	art' 634044	JA44	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
605	1016077!!42	JA42	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	36	2	f
606	1016077!!46	JA46	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	36	2	f
607	1016077!!48	JA48	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	36	2	f
608	1349288575	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	46	2	f
609	194844	GABAO44	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	53	2	f
610	85020044	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	49	2	f
611	8668898143	PPIAO44	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	PANTALON PIQUE	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	47	2	f
612	01608344	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
613	5714944	GABAO44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
516	02106544	GABAO44	2500	2066.11999999999989	1	1549.58999999999992	433.879999999999995	8660.35000000000036	GABARDINA	2066.11999999999989	41239.75	49900.0999999999985	0	1	4	33	2	f
614	00101644	GABA44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
615	6413852525	PPIAO44	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	PANTALON PIQUE	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
616	4129768567	GABBEIG44	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	GABARDINA	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	47	2	f
617	00703144	GABV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
457	02907263022044000	GABV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
618	111421800	GABV44	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	46	2	f
619	779776132294844	GABV44	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
620	779771320092844	GABBEIG44	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
621	779713810094044	GABV44	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
622	9181072024	POV44	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	POPLIN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
623	8061299832	GABBEIG44	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
624	512441	GABBEIG44	1700	1404.96000000000004	1	1019.00999999999999	295.04000000000002	3994.86999999999989	GABARDINA	1404.96000000000004	19023.1699999999983	23018.0400000000009	0	1	4	29	2	f
625	51844	GABMARR44	1700	1404.96000000000004	1	1019.00999999999999	295.04000000000002	3994.86999999999989	GABARDINA	1404.96000000000004	19023.1699999999983	23018.0400000000009	0	1	4	29	2	f
626	50044	GABBEIG44	1700	1404.96000000000004	1	1019.00999999999999	295.04000000000002	3994.86999999999989	GABARDINA	1404.96000000000004	19023.1699999999983	23018.0400000000009	0	1	4	29	2	f
627	163142	JN42	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	JEAN	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
628	50942	JAO42	1700	1404.96000000000004	1	1019.00999999999999	295.04000000000002	3994.86999999999989	JEAN	1404.96000000000004	19023.1699999999983	23018.0400000000009	0	1	4	29	2	f
629	3002432479	JAO42	900	743.799999999999955	1	744.629999999999995	156.199999999999989	1596.34999999999991	JEAN	743.799999999999955	7601.67000000000007	9198.02000000000044	0	1	4	35	2	f
630	8093347605	JA42	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	JEAN	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
631	03007442	JC42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
632	01605542	JN42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
633	05710942	JAO42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
634	02807142	JA42	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
635	068001405800920120000360	POBEIG46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	POPLIN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
636	02806201001046020	GABBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
637	10712605.036	GABBEIG46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
638	591011900bei.46	GABBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	48	2	f
639	art'644746	GABBEIG46	1800	1487.59999999999991	1	1249.58999999999992	312.399999999999977	5101.44999999999982	GABARDINA	1487.59999999999991	24292.619999999999	29394.0699999999997	0	1	4	2	2	f
640	02778255002046000	GABBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
641	02950255020046000	GABMARR46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
642	02905209003046000	POBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
643	02908201003046000	GABBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
644	02906265003046000	GABBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
645	172429i%0236	GABBEIG46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
646	02808208002046020	PPIBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE FINO	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
648	1810446	GABBEIG46	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	GABARDINA	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	53	2	f
649	512461	GABBEIG46	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
653	02957209005046000	POV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
655	art'644748	GABBEIG48	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	GABARDINA	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
656	02959209005046000	POV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
657	02950255009048000	GABGR48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
658	02950264006048000	PPIV48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
659	02950264006046000	PPIV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
647	art'627446	GABBEIG46	1800	1487.59999999999991	1	1249.58999999999992	312.399999999999977	5101.44999999999982	GABARDINA	1487.59999999999991	24292.619999999999	29394.0699999999997	0	1	4	2	2	f
650	5352649644	GABBEIG46	1450	1198.34999999999991	1	946.690000000000055	251.650000000000006	3187.17000000000007	GABARDINA	1198.34999999999991	15177.0100000000002	18364.1800000000003	0	1	4	45	2	f
651	6297819305	GABV46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
652	02950264004046000	PPIV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
654	1189245839	GABV46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
660	02950264009046000	PPIGR46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
661	02659209005046000	POV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
662	02908264004046000	PPIV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
663	02908264006046000	PPIV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
664	02900264006046000	PPIV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
665	02907254019046000	PPIGR46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
666	02900264009046000	PPIGR46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
667	02907209003048000	POBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
668	02906205003046000	POBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
669	02950264008046000	PPIV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
670	w0pa03%na46	GABAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	3	2	f
671	00703146	GABV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
672	02959255009046000	GABV46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
673	02909201008046000	GABGR46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
674	02950255009046000	GABGR46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
675	02659209008046000	POAO46	2450	2024.78999999999996	1	1269.00999999999999	425.20999999999998	7043.5600000000004	POPLIN	2024.78999999999996	33540.739999999998	40584.3000000000029	0	1	4	4	2	f
676	65461651651651656646	GAABV46	1450	1198.34999999999991	1	946.690000000000055	251.650000000000006	3187.17000000000007	GABARDINA	1198.34999999999991	15177.0100000000002	18364.1800000000003	0	1	4	45	2	f
677	152046	GABV46	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	GABARDINA	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
678	02906205001046000	POBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
679	02906205001048000	POBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
680	02909201003046000	GABBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
681	02907204002046000	GABBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
682	00654629.036	GABBEIG46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
683	611811803cae.46	GABMARR46	1450	1198.34999999999991	1	1021.07000000000005	251.650000000000006	3413.65999999999985	GABARDINA	1198.34999999999991	16255.5200000000004	19669.1800000000003	0	1	4	51	2	f
685	02909209003046000	POBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
686	02906204002046000	GABBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
687	art' 6447	GABBEIG46	1800	1487.59999999999991	1	1249.58999999999992	312.399999999999977	5101.44999999999982	GABARDINA	1487.59999999999991	24292.619999999999	29394.0699999999997	0	1	4	2	2	f
688	02657209003046000	POBEIG46	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	POPLIN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
689	02900264002046000	PPIBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
690	02900264004046000	PPIBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
691	02956205001046000	POBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
692	02959201003046000	GABBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
693	7797761332091	GABAO46	1400	1157.01999999999998	1	905.789999999999964	242.97999999999999	2957.01999999999998	GABARDINA	1157.01999999999998	14081.0599999999995	17038.0800000000017	0	1	4	44	2	f
694	8635596302	GABAO46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
695	02959201008046000	GABAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
696	02959209008046000	POAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
697	02778255008046000	GABAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
700	00206603.036	GABAO46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
701	9238990015	GABAO46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
702	161146	PPIAO46	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	PANTALON PIQUE	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
703	512462	GABAO46	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
704	85020046	GABAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	49	2	f
705	10716603.036	GABAO46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
706	50846	GABAO46	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
707	02959252008046000	GABAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
708	02959209010046000	PON46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
709	02900218010046000	GABN46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
710	02907263014046000	GABA46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
711	02900264008046000	PPIAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
712	02907264008046000	PPIAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
713	4165781834	PPIAO46	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	PANTALON PIQUE	1859.5	35302.7300000000032	42716.3000000000029	0	1	1	47	2	f
714	068040506150730000000360	GABA46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
715	1754627	GABA46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	49	2	f
716	7401381518	GABAO46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
717	011082!012!16	GABAO46	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	GABARDINA	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
718	01405146	GABN46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
719	779713810091946	GABN46	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
720	02909209008046000	POAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
721	02959255010046000	GABAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
722	02950255010046000	GABN46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
723	01800207.036	GABN46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
724	172429i'000%1036	GABN46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
725	011511!014!16	GABN46	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	54	2	f
727	7282789237	GABAO46	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	GABARDINA	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	47	2	f
728	02778209010046000	PON46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
729	00501546	GABN46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
730	02959201010046000	GABN46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
731	162146	GABN46	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	54	2	f
732	art'649646	GABN46	1800	1487.59999999999991	1	1249.58999999999992	312.399999999999977	5101.44999999999982	GABARDINA	1487.59999999999991	24292.619999999999	29394.0699999999997	0	1	4	2	2	f
733	5071330396	PPIN46	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	PANTALON PIQUE	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	47	2	f
734	01428680.038	GABN48	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
735	01428680.036	GABN46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
736	689148	GABN48	1000	826.450000000000045	1	644.629999999999995	173.550000000000011	1563.72000000000003	GABARDINA	826.450000000000045	7446.30000000000018	9010.02000000000044	0	1	4	55	2	f
737	01428208.036	JC46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
738	01428603.036	JAO46	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
739	22909240005046000	JAO46	2450	2024.78999999999996	1	1269.00999999999999	425.20999999999998	7043.5600000000004	JEAN	2024.78999999999996	33540.739999999998	40584.3000000000029	0	1	4	4	2	f
740	22908228002046000	JAO46	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
741	511811802blk.46	JN46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	48	2	f
742	80846	JC46	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	JEAN	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
743	6351122775	JA46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
744	313005046	JN46	1450	1198.34999999999991	1	946.690000000000055	251.650000000000006	3187.17000000000007	JEAN	1198.34999999999991	15177.0100000000002	18364.1800000000003	0	1	4	32	2	f
745	01428668.036	JBEIG46	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	1	2	f
746	8683790985	JAO46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
747	I017102041036	JAO46	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	7	2	f
748	22909228004046000	JAO46	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
749	w0je04%bl46	JAO46	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	3	2	f
750	61161180046	JC46	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	JEAN	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	51	2	f
751	779771132723846	JAO46	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	JEAN	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
752	175180i'000%1038	JN48	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
753	0680830712081000360	JC46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
754	22909221002046000	JC46	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
755	22908238001046000	JAO46	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
756	art'644646	JA46	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
757	172954i%ai36	JAO46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
758	2047924347	JAO46	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
759	7397615079	JAO46	1000	826.450000000000045	1	644.629999999999995	173.550000000000011	1563.72000000000003	JEAN	826.450000000000045	7446.30000000000018	9010.02000000000044	0	1	4	35	2	f
760	8668501497	JAO46	1000	826.450000000000045	1	644.629999999999995	173.550000000000011	1563.72000000000003	JEAN	826.450000000000045	7446.30000000000018	9010.02000000000044	0	1	4	35	2	f
761	175180i'000%1036	JN46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
762	511811803blu.46	JA46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	48	2	f
763	1489453131	JAO46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
764	48646	JA46	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	JEAN	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
765	174037i%b636	JC46	1750	1446.27999999999997	1	1134.29999999999995	303.720000000000027	4536.05000000000018	JEAN	1446.27999999999997	21600.25	26136.2999999999993	0	1	4	6	2	f
766	I017124041036	JA46	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	7	2	f
767	art'507146	JAO46	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
768	2171508392	JN46	1650	1363.6400000000001	1	1077.26999999999998	286.360000000000014	4079.23999999999978	JEAN	1363.6400000000001	19424.9599999999991	23504.2000000000007	0	1	4	19	2	f
769	22900238003046000	JA46	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	JEAN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
770	01428232.036	JAO46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
771	05710946	JAO46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
772	I017121131036	JC46	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	7	2	f
773	01428206.036	JA46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
774	50946	JAO46	1650	1363.6400000000001	1	1069.00999999999999	286.360000000000014	4050.61999999999989	JEAN	1363.6400000000001	19288.6599999999999	23339.2799999999988	0	1	4	29	2	f
775	508461	GABN46	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	1	29	2	f
776	I018166581036	JAO46	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	7	2	f
778	03007446	JC46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	JEAN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
779	00406929.036	JAO46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
780	174046i%p436	JC46	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	JEAN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
781	85146	JAO46	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	JEAN	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
777	I017114041036	JA46	1900	1570.25	1	1323.1400000000001	329.75	5678.32999999999993	JEAN	1570.25	27039.6599999999999	32717.9900000000016	0	1	4	7	2	f
782	art'503438	JAO38	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
783	art'503440	JAO40	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
784	art'503442	JAO42	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
785	art'503444	JAO44	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
786	art'503446	JAO46	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
787	art'503448	JAO48	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
788	art'503450	JAO50	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
789	art'503452	JAO52	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
792	art'503840	JA40	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
793	art'503842	JA42	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
796	art'503848	JA48	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
799	11486237.028	JAO38	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
800	11486237.030	JAO40	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
802	11486237.034	JAO44	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
790	art'503454	JAO54	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
791	art'503838	JA38	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
794	art'503844	JA44	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
797	art'503850	JA50	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
798	art'503852	JA52	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
795	art'503846	JA46	1900	1570.25	1	1314.88000000000011	329.75	5645.36999999999989	JEAN	1570.25	26882.7200000000012	32528.0900000000001	0	1	4	2	2	f
801	11486237.032	JAO42	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
803	11486237.036	JAO46	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
804	11486237.038	JAO48	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
805	11486237.040	JAO50	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
807	02950264004048000	PPIV48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
808	02959209005048000	POV48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
809	00703148	GABV48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
811	02957263022048000	GABV48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
812	02905202017048000	GABV48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
813	02659209005048000	POV48	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	POPLIN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
814	02657209005048000	POV48	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	POPLIN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
815	1417702862	GABV48	1000	826.450000000000045	1	644.629999999999995	173.550000000000011	1563.72000000000003	GABARDINA	826.450000000000045	7446.30000000000018	9010.02000000000044	0	1	4	35	2	f
816	02900264006048000	GABV48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
817	02957264004048000	PPIBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
823	02657209003048000	POBEIG48	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	POPLIN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
824	02656209005048000	POV48	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	POPLIN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
826	51848	GABMARR48	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
827	172429i'000%6138	GABMARR48	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
828	02908208002048000	PPIBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
831	02808208002048020	PPIBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
832	02908207007048000	PPIBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
834	02908264002048000	PPIBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
835	02957264004046000	PPIV48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
836	02659209003050000	POBEIG50	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	POPLIN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
837	01608346	GABA46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
838	8741164876	GABA48	2000	1652.8900000000001	1	1289.25999999999999	347.110000000000014	5834.89000000000033	GABARDINA	1652.8900000000001	27785.2000000000007	33620.0899999999965	0	1	4	56	2	f
839	02909201008048000	GABA48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
840	02900264008048000	PPIA48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
841	02907263014048000	GABA48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
842	175462746	GABA46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	49	2	f
843	02777254008048000	PPIA48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
844	02106548	GABA48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
845	161148	PPIA48	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	PANTALON PIQUE	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
846	w0pa03%na48	GABA48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	3	2	f
847	01608348	GABA48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
848	691811900nav.38	GABA48	1500	1239.67000000000007	1	971.07000000000005	260.329999999999984	3373.86999999999989	GABARDINA	1239.67000000000007	16066.0499999999993	19439.9199999999983	0	1	4	51	2	f
849	02909201038048000	GABBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
850	02776209001046000	POBEIG46	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
851	068001405800920120000380	POBEIG48	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	POPLIN	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
852	02950264002048000	PPIBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
853	02900264002048000	PPIBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
854	9629643655	GABBEIG48	1600	1322.30999999999995	1	1127.26999999999998	277.689999999999998	4123.63000000000011	GABARDINA	1322.30999999999995	19636.3199999999997	23759.9500000000007	0	1	4	19	2	f
856	3130030%1138	GABBEIG48	1450	1198.34999999999991	1	946.690000000000055	251.650000000000006	3187.17000000000007	GABARDINA	1198.34999999999991	15177.0100000000002	18364.1800000000003	0	1	4	32	2	f
859	02957263002048000	GABBEIG48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
858	02900264004048000	PPIV48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
860	02950255020048000	GABMARR48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
861	512481	GABBEIG48	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
863	011742!019!17	GABC48	1700	1404.96000000000004	1	1192.55999999999995	295.04000000000002	4614.4399999999996	GABARDINA	1404.96000000000004	21973.5200000000004	26587.9599999999991	0	1	4	8	2	f
864	02900264009048000	PPIV48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
866	591011900nav.48	GABAO48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	48	2	f
867	512482	GABAO48	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
868	02959252009048000	GABGR48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
869	02950264009048000	PPIGR48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
870	02909209009048000	POGR48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
871	art'642648	GABGR48	2000	1652.8900000000001	1	1297.51999999999998	347.110000000000014	5869.57999999999993	GABARDINA	1652.8900000000001	27950.4000000000015	33819.9800000000032	0	1	4	2	2	f
872	4249438594	GABAO48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
873	068027004410920210000380	GABAO48	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
874	02659209008048000	POAO48	2250	1859.5	1	1469.00999999999999	390.5	7413.56999999999971	POPLIN	1859.5	35302.7300000000032	42716.3000000000029	0	1	4	4	2	f
875	02957263014048000	GABA48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
876	175462748	GABA48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	49	2	f
877	194848	GABAO48	2000	1652.8900000000001	1	1223.1400000000001	347.110000000000014	5557.1899999999996	GABARDINA	1652.8900000000001	26462.7999999999993	32019.9900000000016	0	1	4	53	2	f
879	00101648	GABC48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	33	2	f
880	50848	GABAO48	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	29	2	f
881	068009901730510180000380	GABAO48	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
883	ART-644748	GABN48	2000	1652.8900000000001	1	1297.51999999999998	347.110000000000014	5869.57999999999993	GABARDINA	1652.8900000000001	27950.4000000000015	33819.9800000000032	0	1	4	2	2	f
833	725481	GABBEIG48	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	GABARDINA	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
862	72548	GABBEIG48	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	GABARDINA	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
884	725482	GABN48	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	GABARDINA	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
885	02900218010048000	GABN48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
886	011729!014!17	GABN48	1750	1446.27999999999997	1	1142.55999999999995	303.720000000000027	4566.40999999999985	GABARDINA	1446.27999999999997	21744.7999999999993	26311.2099999999991	0	1	4	8	2	f
887	172425i'000%1038	GABN48	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
888	02900264010048000	PPIN48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
889	02950264010048000	PPIN48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	PANTALON PIQUE	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
890	02900262010048000	GABN48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
891	3198598606	GABN48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	46	2	f
892	ART-6274	GABN48	2000	1652.8900000000001	1	1297.51999999999998	347.110000000000014	5869.57999999999993	GABARDINA	1652.8900000000001	27950.4000000000015	33819.9800000000032	0	1	4	2	2	f
893	10160705.038	GABN48	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	GABARDINA	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
894	I014123021	GABN48	2000	1652.8900000000001	1	1223.1400000000001	347.110000000000014	5557.1899999999996	GABARDINA	1652.8900000000001	26462.7999999999993	32019.9900000000016	0	1	4	7	2	f
895	2886573663	GABN48	1000	826.450000000000045	1	644.629999999999995	173.550000000000011	1563.72000000000003	GABARDINA	826.450000000000045	7446.30000000000018	9010.02000000000044	0	1	4	35	2	f
896	02900255010048000	GABN48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
897	02909209010048000	PON48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	POPLIN	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	4	2	f
898	068088606120920150000380	GABN48	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	28	2	f
899	10954705.038	JN48	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
900	72148	GABN48	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	GABARDINA	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
901	ART-6317	GABN48	2000	1652.8900000000001	1	1297.51999999999998	347.110000000000014	5869.57999999999993	GABARDINA	1652.8900000000001	27950.4000000000015	33819.9800000000032	0	1	4	2	2	f
902	01428238.038	JA48	2150	1776.8599999999999	1	1478.09999999999991	373.139999999999986	7125.11999999999989	JEAN	1776.8599999999999	33929.1500000000015	41054.2699999999968	0	1	4	1	2	f
903	74648	JA48	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	JEAN	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
904	01428230.038	JA48	2150	1776.8599999999999	1	1403.72000000000003	373.139999999999986	6789.30000000000018	JEAN	1776.8599999999999	32329.9799999999996	39119.2799999999988	0	1	4	1	2	f
906	q1181200273800	JN48	1400	1157.01999999999998	1	914.049999999999955	242.97999999999999	2981.30999999999995	JEAN	1157.01999999999998	14196.7000000000007	17178.0099999999984	0	1	4	41	2	f
909	11054568.038	JC48	2150	1776.8599999999999	1	1478.09999999999991	373.139999999999986	7125.11999999999989	JEAN	1776.8599999999999	33929.1500000000015	41054.2699999999968	0	1	4	1	2	f
912	172429i'000%1038	GABN48	1600	1322.30999999999995	1	1044.63000000000011	277.689999999999998	3845.96000000000004	GABARDINA	1322.30999999999995	18314.0800000000017	22160.0400000000009	0	1	4	6	2	f
905	00314920.038	JA48	2150	1776.8599999999999	1	1478.09999999999991	373.139999999999986	7125.11999999999989	JEAN	1776.8599999999999	33929.1500000000015	41054.2699999999968	0	1	4	1	2	f
907	00406526.038	JA48	2150	1776.8599999999999	1	1478.09999999999991	373.139999999999986	7125.11999999999989	JEAN	1776.8599999999999	33929.1500000000015	41054.2699999999968	0	1	4	1	2	f
908	10900712.038	JA48	2150	1776.8599999999999	1	1478.09999999999991	373.139999999999986	7125.11999999999989	JEAN	1776.8599999999999	33929.1500000000015	41054.2699999999968	0	1	4	1	2	f
910	01428705.038	JN48	2150	1776.8599999999999	1	1478.09999999999991	373.139999999999986	7125.11999999999989	JEAN	1776.8599999999999	33929.1500000000015	41054.2699999999968	0	1	4	1	2	f
911	w0pa01%bk48	GABN48	2450	2024.78999999999996	1	1599.58999999999992	425.20999999999998	8744.38999999999942	GABARDINA	2024.78999999999996	41639.9499999999971	50384.3399999999965	0	1	4	3	2	f
913	011735!014!17	GABN48	1600	1322.30999999999995	1	1119.00999999999999	277.689999999999998	4095.86999999999989	GABARDINA	1322.30999999999995	19504.1599999999999	23600.0299999999988	0	1	4	54	2	f
914	45348	GABN48	1300	1074.38000000000011	1	840.5	225.620000000000005	2567.55999999999995	GABARDINA	1074.38000000000011	12226.5	14794.0599999999995	0	1	4	31	2	f
915	7797713220919	GABN48	1200	991.740000000000009	1	775.210000000000036	208.259999999999991	2205.5300000000002	GABARDINA	991.740000000000009	10502.5200000000004	12708.0499999999993	0	1	4	44	2	f
916	01428668.038	JBEIG48	2000	1652.8900000000001	1	1223.1400000000001	347.110000000000014	5557.1899999999996	JEAN	1652.8900000000001	26462.7999999999993	32019.9900000000016	0	1	4	1	2	f
\.


--
-- Data for Name: productos_atributos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.productos_atributos (id_producto, id_atributo) FROM stdin;
2	2
4	11
4	39
4	5
5	11
5	5
5	39
6	11
6	39
6	41
7	11
7	39
7	5
8	39
8	5
8	11
9	40
9	11
9	41
10	5
10	11
11	41
11	11
11	39
12	41
12	39
12	11
14	11
14	5
14	39
15	39
15	29
15	11
16	39
16	29
17	40
17	11
17	32
18	40
18	11
18	32
20	40
20	11
20	33
21	12
21	36
22	29
22	12
22	40
23	5
23	40
23	12
24	33
24	12
24	40
25	39
25	5
26	12
26	40
26	33
27	40
27	33
27	12
28	40
28	36
28	12
29	12
29	40
29	32
31	12
31	29
31	40
32	33
32	40
32	12
33	36
33	12
33	40
34	12
34	33
34	40
35	12
35	36
35	40
36	35
36	39
37	36
37	12
37	39
38	12
38	40
38	36
39	40
39	36
39	12
41	12
41	29
41	39
44	12
44	33
44	40
45	40
45	36
45	12
46	12
46	36
46	39
47	39
47	5
47	12
48	5
48	12
48	39
49	40
49	12
49	32
50	5
50	12
50	38
50	43
52	12
52	5
52	39
53	12
53	40
53	5
54	42
54	12
54	40
55	40
55	5
55	12
56	12
56	41
56	40
57	12
57	40
57	44
58	12
58	41
58	39
59	29
59	12
59	40
60	39
60	12
60	41
61	12
61	39
61	5
62	12
62	5
62	40
63	41
63	40
63	12
64	41
64	39
65	29
65	12
65	40
66	12
66	29
66	40
68	41
68	12
69	12
69	39
69	44
70	40
70	5
70	12
72	12
72	39
72	41
73	39
73	12
73	5
74	5
74	12
75	12
75	41
75	39
76	39
76	5
77	12
77	41
77	39
78	41
78	12
78	39
79	41
79	39
79	12
80	12
80	32
80	40
81	5
81	40
81	16
82	16
82	33
82	40
83	17
83	40
83	33
84	40
84	18
85	33
85	45
85	40
86	45
86	5
86	40
88	18
88	5
89	5
89	40
89	17
90	17
90	40
91	45
91	29
91	40
92	18
92	29
92	40
93	16
93	29
94	39
94	29
94	12
95	5
95	39
96	39
96	12
96	41
97	44
97	39
97	12
98	39
98	41
98	12
99	39
100	12
100	38
100	5
101	32
101	12
101	39
102	38
102	12
103	12
103	29
103	38
104	40
104	35
104	12
105	39
105	12
105	36
106	40
106	33
107	12
107	39
107	41
108	39
108	41
108	12
109	12
109	40
109	42
110	41
110	12
110	40
111	12
111	38
111	29
112	12
112	39
113	12
113	40
113	37
114	43
114	48
114	37
114	39
115	40
115	48
115	33
117	44
117	39
117	12
118	41
118	12
118	40
119	44
119	12
119	39
120	44
120	39
121	44
121	39
121	12
122	12
122	44
122	39
123	40
123	12
123	41
124	40
124	44
126	12
126	32
126	40
130	39
130	44
130	12
131	12
131	39
131	41
132	41
132	39
132	12
135	41
135	12
135	39
136	12
136	41
136	39
137	39
137	12
137	41
138	40
138	36
138	16
139	36
139	40
139	49
140	36
140	40
140	49
142	49
142	39
142	33
143	40
143	33
143	49
144	32
144	49
144	40
145	33
145	40
145	49
146	49
146	40
146	36
147	32
147	49
147	40
148	49
148	40
148	33
149	49
149	40
149	33
150	49
150	40
150	33
151	33
151	49
151	40
152	40
152	49
152	36
154	33
154	40
155	40
155	33
155	49
156	40
156	49
156	33
157	33
157	40
157	49
158	49
158	40
158	33
159	36
159	40
159	49
160	40
160	33
160	49
162	49
162	40
162	33
164	40
164	33
164	49
165	49
165	33
165	40
166	44
166	40
166	49
167	40
167	44
167	49
168	40
168	44
169	36
169	40
169	46
171	49
171	44
171	39
172	11
172	41
172	40
172	47
173	46
173	39
173	12
173	41
174	44
174	46
174	12
174	40
175	40
175	12
175	44
175	46
176	46
176	40
176	44
177	48
177	40
177	33
178	36
178	47
178	43
179	39
179	48
179	41
180	41
180	46
180	39
181	36
181	40
181	46
181	49
182	33
182	40
182	49
183	49
183	40
183	33
184	40
184	33
184	49
185	40
185	33
185	49
187	33
187	40
187	49
188	49
188	33
188	40
189	40
189	32
189	49
190	43
190	49
190	33
191	40
191	33
191	49
192	38
192	46
192	41
193	43
193	46
193	36
194	40
194	46
194	36
195	36
195	40
195	46
196	40
196	32
196	46
197	39
197	46
197	41
198	49
198	42
198	43
199	33
199	49
199	40
200	49
200	33
200	40
201	40
201	36
201	49
203	49
203	42
203	39
204	36
204	39
204	49
205	36
205	38
205	49
206	40
206	33
206	49
208	49
208	43
208	33
214	49
214	37
214	40
215	49
215	40
215	36
216	49
216	36
216	40
217	40
217	36
217	50
218	49
218	40
218	36
219	40
219	36
219	49
220	36
220	43
220	49
221	40
221	36
221	49
222	43
222	37
222	49
225	40
225	49
225	36
227	49
227	42
227	43
228	49
228	40
228	36
229	43
229	36
229	49
230	43
230	36
230	49
231	49
231	43
231	36
232	49
232	43
232	37
233	49
233	40
233	33
235	36
235	50
235	40
236	49
236	36
236	40
239	42
239	49
239	40
240	40
240	49
240	36
241	49
241	36
241	39
242	40
242	36
242	49
243	49
243	36
243	40
246	49
246	40
246	36
247	49
247	40
247	36
248	39
248	49
248	36
249	49
249	37
249	39
252	49
252	33
252	40
253	49
253	36
253	40
255	49
255	40
255	32
256	44
256	40
256	49
257	44
257	49
257	40
258	44
258	49
258	40
261	50
261	44
261	40
262	49
262	44
262	40
263	49
263	39
263	44
265	49
265	44
265	40
266	40
266	44
266	49
269	43
269	29
269	49
270	40
270	29
270	49
273	44
273	43
273	49
274	43
274	44
274	49
275	49
275	43
275	44
278	43
278	44
278	49
279	43
279	44
279	49
280	49
280	44
280	43
282	43
282	49
282	32
283	49
283	32
283	43
284	29
284	49
284	43
285	44
285	49
285	39
286	49
287	40
287	49
287	44
290	44
290	43
290	49
291	43
291	49
291	44
292	43
292	44
292	49
293	49
293	44
293	39
294	44
294	43
294	49
295	44
295	49
295	43
297	40
297	49
297	44
298	44
298	49
298	43
299	49
299	43
299	29
301	39
301	29
301	49
302	43
302	29
302	49
304	49
304	39
304	29
305	29
305	49
305	43
306	29
306	39
306	49
309	49
309	44
309	40
310	44
310	40
310	49
311	32
311	40
311	49
313	40
313	44
313	49
314	39
314	44
314	49
315	49
315	39
315	44
316	44
316	49
316	40
317	39
317	29
317	49
319	49
319	32
319	39
320	39
320	49
320	29
323	49
323	29
323	40
324	40
324	29
324	49
325	29
325	40
325	49
326	39
326	49
326	32
327	40
327	42
327	49
328	40
328	44
328	49
329	40
329	44
329	49
330	35
330	40
330	49
331	40
331	44
331	49
332	40
332	49
332	44
333	44
333	49
335	49
335	41
335	39
336	41
336	49
336	40
337	49
337	40
337	32
337	44
339	40
339	49
339	44
340	40
340	49
340	44
341	49
341	40
341	33
342	40
342	49
342	44
343	35
343	49
343	40
344	40
344	49
344	35
345	49
345	33
345	40
346	29
346	40
346	49
347	40
347	49
347	44
348	36
348	40
348	49
350	2
350	12
352	49
352	44
352	40
354	49
354	40
354	5
355	49
355	5
355	40
356	40
356	49
356	5
357	5
357	49
357	40
358	49
358	44
358	40
361	49
361	44
361	40
362	40
362	49
362	44
363	40
363	44
363	49
364	49
364	40
364	44
365	40
365	49
365	44
366	49
366	5
366	40
367	41
367	49
367	40
368	39
368	5
368	47
369	38
369	47
369	5
370	36
370	48
370	40
371	47
371	39
371	44
372	47
372	40
372	32
373	56
373	49
373	44
373	62
374	57
374	44
374	50
374	62
373	57
375	39
375	44
375	49
376	49
376	41
376	40
377	44
377	39
377	49
378	40
378	49
378	44
379	49
379	39
379	5
380	40
380	41
380	49
381	44
381	49
381	40
382	5
382	49
382	40
383	49
383	5
383	39
384	44
384	49
384	39
386	40
386	49
386	44
390	5
390	49
390	39
392	5
392	39
392	49
387	49
387	40
387	44
388	39
388	49
388	5
389	49
389	44
389	40
391	49
391	41
391	39
333	40
393	40
393	44
393	49
394	49
394	40
394	44
395	44
395	40
395	49
396	40
396	41
396	49
397	49
397	40
397	44
398	30
398	49
398	39
399	40
399	49
399	44
401	36
401	50
402	36
402	50
402	43
401	43
403	50
403	43
403	36
404	50
404	42
404	43
405	36
405	50
405	43
406	36
406	50
406	40
407	36
407	43
407	50
408	36
408	40
408	50
409	50
409	40
409	42
410	50
410	36
410	64
411	33
411	50
411	40
412	40
412	33
412	50
413	50
413	40
413	33
414	50
414	36
414	43
415	36
415	40
415	50
417	33
417	43
417	50
418	50
418	40
418	36
419	50
419	36
419	40
420	50
420	40
420	36
421	50
421	36
421	43
422	43
422	50
422	42
423	42
423	40
423	50
424	42
424	43
424	50
425	50
425	42
425	40
426	64
426	50
426	36
426	40
427	50
427	42
427	40
428	40
428	50
428	42
429	40
429	50
429	33
430	50
430	36
430	40
431	40
431	50
431	36
432	50
432	40
432	36
433	40
433	50
434	50
434	36
434	40
433	36
435	40
435	36
435	50
436	50
436	36
436	40
437	43
437	50
437	32
438	50
438	43
438	33
439	50
439	43
439	32
440	50
440	43
440	33
441	33
441	40
441	50
442	40
442	50
442	32
443	32
443	43
443	50
444	50
444	33
444	43
445	43
445	50
445	33
446	43
446	50
446	33
447	64
447	40
447	50
447	33
448	33
448	40
448	50
449	40
449	33
449	50
450	33
450	40
450	50
451	40
451	50
451	32
452	32
452	40
452	50
453	32
453	40
453	50
454	32
454	40
454	50
455	50
455	43
455	32
456	50
456	40
456	32
457	50
457	33
457	40
458	33
458	40
458	50
460	33
460	40
460	50
461	50
461	33
461	43
462	50
462	36
462	40
463	49
463	40
463	33
464	33
464	40
464	50
465	40
465	33
465	50
466	40
466	44
466	50
467	44
467	50
467	43
468	44
468	50
468	43
469	40
469	50
469	5
470	40
470	50
470	44
471	44
471	50
471	40
472	40
472	44
472	50
473	44
473	50
473	40
475	44
475	50
475	40
476	40
476	44
476	50
477	43
477	44
477	50
478	50
478	44
478	43
479	41
479	50
479	43
480	50
480	44
480	40
481	44
481	43
481	50
482	44
482	50
482	43
483	50
483	44
483	43
484	50
484	43
484	44
485	50
485	43
485	44
486	43
486	50
486	44
487	50
487	40
487	44
488	50
488	43
488	44
489	43
489	44
489	50
490	50
490	44
490	40
491	43
491	50
491	29
492	50
492	29
492	43
493	43
493	29
493	50
494	50
494	43
494	29
495	29
495	40
495	50
497	50
497	29
497	40
498	29
498	50
498	43
499	50
499	40
499	29
500	40
500	29
500	50
501	40
501	29
501	50
502	50
502	40
502	29
503	50
503	29
503	43
504	40
504	29
504	50
505	40
505	50
505	5
506	50
506	40
506	36
90	44
507	50
507	40
507	44
508	5
508	40
508	50
509	50
509	44
509	40
510	33
510	40
510	50
511	40
511	5
511	50
512	50
512	39
512	5
514	40
514	44
514	50
515	40
515	50
515	5
516	40
516	44
516	50
517	40
517	44
517	51
518	39
518	50
518	44
519	50
519	39
519	41
520	50
520	44
520	40
521	5
521	40
521	50
522	40
522	50
522	5
64	48
523	50
523	39
523	44
524	50
524	5
524	39
525	50
525	5
525	39
526	5
526	50
526	40
527	41
527	50
527	40
528	40
528	50
528	41
529	50
529	40
529	44
530	40
530	44
530	50
531	41
531	39
531	50
532	50
532	40
532	44
533	5
533	40
533	50
534	50
534	39
534	41
535	41
535	50
535	39
536	39
536	50
536	41
537	5
537	50
537	40
538	5
538	50
538	40
539	41
539	40
539	50
99	5
99	48
540	50
540	5
540	39
541	39
541	41
541	47
542	48
542	39
542	41
543	39
543	49
543	41
544	39
544	41
545	39
545	52
545	41
544	51
546	50
546	39
546	44
547	41
547	50
547	40
548	39
548	50
548	44
549	40
549	50
549	44
550	50
550	40
550	44
551	44
551	39
551	50
552	44
552	40
552	50
553	40
553	50
553	44
554	44
554	39
554	50
555	44
555	50
555	40
556	39
556	50
557	50
557	5
557	40
558	40
558	5
558	50
559	40
559	50
559	44
560	29
560	50
560	40
561	50
561	40
561	5
562	50
562	41
562	40
563	39
563	5
563	50
120	48
564	49
564	39
564	5
565	39
565	5
565	50
566	39
566	51
567	5
567	52
567	39
568	39
568	5
569	40
569	49
569	29
570	50
570	40
570	29
571	40
571	29
572	40
572	52
572	29
573	40
573	53
573	29
568	53
571	51
574	40
574	49
574	5
575	50
575	5
575	40
576	51
576	40
576	5
577	40
577	52
577	5
578	40
578	53
578	5
580	44
580	40
580	50
579	40
579	44
579	49
581	51
581	40
581	44
583	40
583	44
583	53
582	52
582	40
582	44
584	50
584	29
584	40
585	29
585	40
585	50
586	50
586	40
586	32
587	5
587	50
587	39
588	39
588	44
588	50
25	48
589	44
589	51
589	43
590	43
590	50
590	44
591	43
591	44
591	49
592	43
592	52
592	44
593	43
593	49
593	29
594	43
594	50
594	29
595	43
595	51
595	29
16	47
16	43
36	48
596	43
596	29
596	39
596	48
597	39
597	52
597	29
597	43
598	50
598	29
598	39
598	43
599	39
599	43
599	50
599	44
600	29
600	40
600	50
601	29
601	39
601	50
601	43
602	50
602	39
602	29
603	50
603	40
603	44
604	40
604	5
604	50
605	49
605	39
605	5
606	39
606	5
606	51
95	48
607	5
607	52
607	39
556	5
608	50
608	44
608	40
609	50
609	44
609	43
610	50
610	44
610	40
611	44
611	50
611	40
612	50
612	44
612	40
613	43
613	44
613	50
168	48
614	40
614	5
614	50
286	5
286	40
615	44
615	50
615	40
616	50
616	40
616	36
617	33
617	40
617	50
618	50
618	33
618	40
106	48
619	50
619	40
619	33
620	36
620	50
620	40
621	50
621	33
621	43
622	50
622	33
622	40
623	43
623	36
623	50
624	43
624	36
624	39
624	50
625	39
625	42
625	43
625	50
626	50
626	39
626	36
626	43
627	29
627	40
627	49
628	44
628	43
628	38
628	49
76	48
629	49
629	44
629	43
629	39
630	49
630	39
630	5
631	40
631	49
631	41
632	49
632	40
632	29
633	49
633	44
633	40
634	40
634	5
634	49
635	51
635	40
635	36
636	51
636	36
636	43
637	36
637	40
637	51
638	43
638	36
638	51
639	51
639	36
639	43
640	36
640	51
640	43
641	42
641	51
641	43
642	51
642	40
642	36
643	40
643	36
643	51
644	51
644	36
644	40
645	51
645	43
645	36
646	51
646	43
646	36
647	36
647	40
647	51
648	36
648	51
648	43
649	36
649	43
649	39
649	51
650	43
650	36
650	51
651	51
651	40
651	33
652	43
652	33
652	51
653	43
653	33
653	51
654	33
654	40
654	51
655	43
655	36
655	52
656	43
656	51
656	33
657	32
657	52
657	43
658	52
658	43
658	33
659	33
659	51
659	43
660	32
660	51
660	43
661	33
661	64
661	40
661	51
662	40
662	33
662	51
663	51
663	40
663	33
664	33
664	51
664	40
665	51
665	40
665	32
666	40
666	32
666	51
667	52
667	40
667	36
668	51
668	40
668	36
669	51
669	43
669	33
670	40
670	44
670	51
671	40
671	51
671	33
672	33
672	51
672	43
673	32
673	51
673	40
674	32
674	51
674	43
675	44
675	51
675	64
676	51
676	33
676	43
677	33
677	51
677	40
678	51
678	40
678	36
679	52
679	36
679	40
680	40
680	51
680	36
681	36
681	51
681	40
682	40
682	36
682	51
683	51
683	40
683	42
685	36
685	51
685	40
686	36
686	51
686	40
687	51
687	36
687	43
688	51
688	36
688	64
689	40
689	36
689	51
690	40
690	36
690	51
691	36
691	43
691	51
692	36
692	43
692	51
693	51
693	44
693	64
694	44
694	43
694	51
695	43
695	44
695	51
696	44
696	43
696	51
697	43
697	44
697	51
700	43
700	51
700	44
701	40
701	44
701	51
702	44
702	51
702	40
703	51
703	44
703	38
704	51
704	39
704	44
694	39
705	40
705	51
705	43
705	44
706	51
706	43
706	44
706	38
707	43
707	51
707	44
708	51
708	29
708	43
709	40
709	29
709	51
710	51
710	40
710	5
711	40
711	51
711	44
712	51
712	44
712	40
713	51
713	44
713	40
714	51
714	39
714	5
715	39
715	51
715	5
716	40
716	43
716	44
716	51
717	43
717	44
717	51
718	29
718	51
718	40
719	43
719	29
719	51
720	44
720	51
720	40
721	44
721	43
721	51
722	29
722	43
722	51
723	51
723	40
723	29
724	43
724	51
724	29
725	51
725	29
725	43
727	43
727	51
727	44
728	43
728	29
728	51
729	29
729	40
729	51
730	43
730	51
730	29
731	51
731	43
731	29
732	43
732	51
732	29
733	40
733	51
733	29
734	29
734	52
734	40
735	51
735	29
735	40
736	43
736	29
736	52
737	40
737	41
737	51
738	51
738	40
738	44
739	40
739	44
739	51
740	51
740	40
740	44
741	51
741	29
741	39
742	40
742	51
742	41
743	51
743	5
743	40
744	51
744	29
744	39
745	51
745	40
745	36
746	44
746	51
746	40
566	5
747	39
747	44
747	51
748	40
748	44
748	51
749	51
749	44
749	40
750	51
750	41
750	40
751	39
751	51
751	44
752	29
752	39
752	52
753	51
753	40
753	41
754	40
754	41
754	51
755	44
755	40
755	51
756	51
756	39
756	5
757	39
757	44
757	51
758	39
758	51
758	44
759	44
759	51
759	39
760	51
760	43
760	44
761	39
761	29
761	51
762	51
762	5
762	40
763	44
763	51
763	39
764	51
764	5
764	39
765	41
765	40
765	51
766	5
766	51
766	39
767	51
767	44
767	39
768	51
768	39
768	29
769	51
769	40
769	44
770	40
770	51
770	44
771	40
771	51
771	44
772	41
772	51
772	39
773	51
773	5
773	40
774	39
774	51
774	43
774	44
775	29
775	51
775	38
776	51
776	40
776	44
777	5
777	40
777	51
778	51
778	40
778	41
779	44
779	39
779	51
780	51
780	41
780	39
781	44
781	39
781	51
782	44
782	39
782	47
783	44
783	39
783	48
784	39
784	44
784	49
785	50
785	39
785	44
786	44
786	51
786	39
787	52
787	44
787	39
788	44
788	53
788	39
789	44
789	39
789	54
790	44
790	39
790	66
791	39
791	47
791	5
792	5
792	39
792	48
793	5
793	49
793	39
794	5
794	50
794	39
795	51
795	39
795	5
796	5
796	52
796	39
797	5
797	39
797	53
798	54
798	39
798	5
799	44
799	47
799	39
800	39
800	48
800	44
801	49
801	44
801	39
802	44
802	39
802	50
803	44
803	51
803	39
804	52
804	39
804	44
805	44
805	39
805	53
807	33
807	52
807	43
808	52
808	33
808	43
809	40
809	52
809	33
811	52
811	43
811	33
812	40
812	33
812	52
813	52
813	33
813	64
814	52
814	33
814	64
815	40
815	52
815	33
816	33
816	40
816	52
817	36
817	52
817	43
823	64
823	36
823	52
824	52
824	33
824	64
826	52
826	42
826	43
826	38
827	52
827	42
827	43
827	39
828	36
828	52
828	40
831	52
831	43
831	36
832	52
832	40
832	36
833	36
833	52
833	43
834	40
834	36
834	52
836	64
836	36
836	53
835	33
835	43
835	52
837	5
837	40
837	51
838	43
838	52
838	5
839	52
839	40
839	5
840	40
840	5
840	52
841	52
841	40
841	5
842	39
842	5
842	51
843	43
843	5
843	52
844	52
844	5
844	40
845	39
845	52
845	5
846	40
846	5
846	52
847	5
847	40
847	52
848	5
848	43
848	52
849	36
849	52
849	40
850	51
850	43
850	36
851	36
851	52
851	40
852	36
852	43
852	52
853	36
853	52
853	40
854	43
854	52
854	36
856	52
856	36
856	43
858	33
858	40
858	52
859	52
859	43
859	36
860	42
860	52
860	43
861	39
861	52
861	43
861	36
862	43
862	39
862	36
862	52
833	40
863	43
863	52
863	41
864	40
864	52
864	33
866	43
866	44
866	52
867	39
867	43
867	44
867	52
868	52
868	32
868	43
869	52
869	43
869	32
870	32
870	52
870	40
871	52
871	32
871	64
872	44
872	40
872	52
873	44
873	43
873	52
874	44
874	64
874	52
875	52
875	43
875	5
876	40
876	5
876	52
877	52
877	43
877	44
879	41
879	52
879	40
880	43
880	44
880	39
880	52
881	43
881	52
881	44
883	52
883	39
883	43
883	29
884	43
884	29
884	52
885	52
885	29
885	40
886	29
886	40
886	52
887	52
887	40
887	29
888	40
888	52
888	29
889	43
889	29
889	52
890	40
890	29
890	52
891	40
891	29
891	52
892	29
892	52
892	40
893	40
893	29
893	52
894	39
894	29
894	52
895	52
895	29
895	40
896	40
896	29
896	52
897	52
897	40
897	29
898	29
898	52
898	40
899	39
899	52
899	29
900	39
900	52
900	29
901	29
901	52
901	39
902	40
902	52
902	5
903	52
903	39
903	5
904	5
904	52
904	40
905	40
905	52
905	5
906	29
906	52
906	39
907	5
907	52
907	39
908	40
908	5
908	52
909	41
909	39
909	52
910	40
910	52
910	29
911	40
911	52
911	29
912	52
912	43
912	39
913	52
913	40
913	29
914	40
914	29
914	52
915	29
915	40
915	52
916	36
916	52
916	40
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
2	1
4	1
4	3
4	2
5	1
5	3
5	2
6	2
6	3
6	1
7	3
7	2
7	1
8	1
8	3
8	2
9	3
9	2
9	1
10	1
10	3
10	2
11	3
11	1
11	2
12	3
12	2
12	1
14	2
14	3
14	1
15	1
15	3
15	2
16	2
16	3
16	1
17	2
17	1
17	3
18	3
18	1
18	2
20	1
20	3
20	2
21	3
21	1
21	2
22	3
22	2
22	1
23	1
23	3
23	2
24	1
24	3
24	2
25	3
25	2
25	1
26	2
26	1
26	3
27	1
27	2
27	3
28	3
28	1
28	2
29	2
29	3
29	1
31	2
31	3
31	1
32	2
32	3
32	1
33	1
33	2
33	3
34	3
34	2
34	1
35	3
35	1
35	2
36	2
36	3
36	1
37	2
37	1
37	3
38	1
38	3
38	2
39	1
39	3
39	2
41	2
41	1
41	3
44	1
44	2
44	3
45	1
45	2
45	3
46	1
46	3
46	2
47	2
47	1
47	3
48	2
48	1
48	3
49	3
49	2
49	1
50	2
50	3
50	1
52	1
52	3
52	2
53	3
53	1
53	2
54	3
54	1
54	2
55	3
55	2
55	1
56	2
56	1
56	3
57	2
57	3
57	1
58	3
58	1
58	2
59	1
59	2
59	3
60	1
60	3
60	2
61	2
61	3
61	1
62	3
62	1
62	2
63	3
63	1
63	2
64	3
64	1
64	2
65	3
65	2
65	1
66	3
66	2
66	1
68	1
68	3
68	2
69	2
69	3
69	1
70	1
70	3
70	2
72	2
72	1
72	3
73	2
73	1
73	3
74	2
74	1
74	3
75	3
75	1
75	2
76	1
76	3
76	2
77	2
77	3
77	1
78	1
78	2
78	3
79	2
79	1
79	3
80	2
80	1
80	3
81	3
81	2
81	1
82	3
82	2
82	1
83	3
83	2
83	1
84	1
84	2
84	3
85	3
85	1
85	2
86	1
86	3
86	2
88	2
88	1
88	3
89	3
89	1
89	2
90	1
90	3
90	2
91	3
91	2
91	1
92	3
92	1
92	2
93	2
93	1
93	3
94	2
94	3
94	1
95	1
95	3
95	2
96	2
96	3
96	1
97	1
97	3
97	2
98	1
98	3
98	2
99	1
99	2
99	3
100	1
100	3
100	2
101	2
101	3
101	1
102	1
102	3
102	2
103	1
103	3
103	2
104	2
104	3
104	1
105	3
105	1
105	2
106	2
106	1
106	3
107	1
107	3
107	2
108	2
108	1
108	3
109	3
109	1
109	2
110	1
110	3
110	2
111	1
111	3
111	2
112	3
112	1
112	2
113	2
113	1
113	3
114	3
114	1
114	2
115	3
115	1
115	2
117	3
117	2
117	1
118	3
118	1
118	2
119	1
119	3
119	2
120	1
120	3
120	2
121	3
121	2
121	1
122	3
122	2
122	1
123	2
123	1
123	3
124	3
124	1
124	2
126	1
126	3
126	2
130	2
130	1
130	3
131	1
131	2
131	3
132	3
132	2
132	1
135	1
135	3
135	2
136	1
136	3
136	2
137	1
137	2
137	3
138	2
138	3
138	1
139	1
139	3
139	2
140	1
140	2
140	3
142	1
142	2
142	3
143	3
143	1
143	2
144	2
144	1
144	3
145	2
145	3
145	1
146	1
146	3
146	2
147	3
147	1
147	2
148	3
148	2
148	1
149	2
149	1
149	3
150	1
150	3
150	2
151	2
151	3
151	1
152	3
152	2
152	1
154	1
154	3
154	2
155	3
155	1
155	2
156	3
156	2
156	1
157	1
157	2
157	3
158	1
158	3
158	2
159	1
159	3
159	2
160	1
160	2
160	3
162	2
162	3
162	1
164	3
164	1
164	2
165	2
165	3
165	1
166	2
166	1
166	3
167	2
167	1
167	3
168	1
168	3
168	2
169	2
169	1
169	3
171	3
171	1
171	2
172	2
172	3
172	1
173	3
173	1
173	2
174	1
174	3
174	2
175	2
175	1
175	3
176	3
176	2
176	1
177	2
177	1
177	3
178	3
178	2
178	1
179	2
179	1
179	3
180	1
180	3
180	2
181	1
181	3
181	2
182	1
182	3
182	2
183	3
183	2
183	1
184	1
184	3
184	2
185	3
185	1
185	2
187	2
187	1
187	3
188	2
188	1
188	3
189	2
189	3
189	1
190	2
190	1
190	3
191	1
191	3
191	2
192	3
192	2
192	1
193	1
193	3
193	2
194	2
194	1
194	3
195	2
195	1
195	3
196	3
196	1
196	2
197	1
197	3
197	2
198	2
198	3
198	1
199	1
199	3
199	2
200	1
200	2
200	3
201	3
201	2
201	1
203	1
203	3
203	2
204	2
204	1
204	3
205	2
205	3
205	1
206	3
206	1
206	2
208	1
208	2
208	3
214	3
214	1
214	2
215	2
215	1
215	3
216	3
216	2
216	1
217	3
217	2
217	1
218	3
218	2
218	1
221	3
221	1
221	2
222	2
222	3
222	1
219	1
219	3
219	2
220	1
220	2
220	3
225	3
225	2
225	1
227	3
227	2
227	1
228	1
228	3
228	2
229	2
229	3
229	1
230	3
230	1
230	2
231	3
231	2
231	1
232	1
232	3
232	2
233	2
233	1
233	3
235	3
235	2
235	1
236	3
236	1
236	2
239	1
239	3
239	2
240	1
240	2
240	3
241	1
241	3
241	2
242	2
242	3
242	1
243	1
243	3
243	2
246	1
246	3
246	2
247	2
247	3
247	1
248	2
248	1
248	3
249	2
249	3
249	1
252	2
252	1
252	3
253	3
253	2
253	1
255	1
255	3
255	2
256	2
256	3
256	1
257	3
257	2
257	1
258	2
258	1
258	3
261	1
261	2
261	3
262	3
262	2
262	1
263	1
263	2
263	3
265	3
265	1
265	2
266	2
266	1
266	3
269	3
269	1
269	2
270	3
270	2
270	1
273	1
273	3
273	2
274	3
274	1
274	2
275	1
275	3
275	2
278	1
278	3
278	2
279	3
279	1
279	2
280	1
280	2
280	3
282	3
282	2
282	1
283	3
283	1
283	2
284	1
284	3
284	2
285	3
285	1
285	2
286	1
286	3
286	2
287	3
287	1
287	2
290	3
290	2
290	1
291	2
291	3
291	1
292	1
292	2
292	3
293	2
293	3
293	1
294	3
294	2
294	1
295	2
295	1
295	3
297	2
297	3
297	1
298	3
298	2
298	1
299	1
299	3
299	2
301	1
301	3
301	2
302	3
302	1
302	2
304	3
304	2
304	1
305	1
305	2
305	3
306	1
306	2
306	3
309	2
309	1
309	3
310	3
310	1
310	2
311	1
311	2
311	3
313	3
313	2
313	1
314	3
314	2
314	1
315	1
315	3
315	2
316	3
316	2
316	1
317	2
317	3
317	1
319	1
319	3
319	2
320	1
320	2
320	3
323	3
323	1
323	2
324	2
324	3
324	1
325	3
325	2
325	1
326	2
326	1
326	3
327	1
327	3
327	2
328	1
328	3
328	2
329	1
329	3
329	2
330	2
330	3
330	1
331	3
331	2
331	1
332	1
332	2
332	3
333	2
333	3
333	1
335	3
335	2
335	1
336	3
336	2
336	1
337	2
337	1
337	3
339	1
339	3
339	2
340	2
340	1
340	3
341	2
341	1
341	3
342	2
342	1
342	3
343	3
343	1
343	2
344	1
344	2
344	3
345	1
345	3
345	2
346	3
346	2
346	1
347	3
347	2
347	1
348	2
348	3
348	1
350	1
352	3
352	1
352	2
354	1
354	2
354	3
355	3
355	2
355	1
356	1
356	3
356	2
357	2
357	3
357	1
358	1
358	3
358	2
361	2
361	3
361	1
362	1
362	2
362	3
363	3
363	2
363	1
364	1
364	2
364	3
365	2
365	3
365	1
366	2
366	3
366	1
367	2
367	1
367	3
368	2
368	1
368	3
369	2
369	1
369	3
370	2
370	1
370	3
371	1
371	2
371	3
372	3
372	1
372	2
373	2
373	4
373	6
373	1
374	5
374	6
374	2
374	1
373	5
375	1
375	2
375	3
376	1
376	3
376	2
377	3
377	2
377	1
378	1
378	3
378	2
379	3
379	2
379	1
380	1
380	3
380	2
381	2
381	3
381	1
382	1
382	2
382	3
383	3
383	2
383	1
384	3
384	1
384	2
386	2
386	3
386	1
390	3
390	1
390	2
392	1
392	3
392	2
387	2
387	3
387	1
388	1
388	3
388	2
389	2
389	1
389	3
391	1
391	3
391	2
393	1
393	2
393	3
394	2
394	1
394	3
395	1
395	2
395	3
396	2
396	1
396	3
397	1
397	2
397	3
398	1
398	3
398	2
399	3
399	2
399	1
401	1
401	2
401	3
402	3
402	1
402	2
403	1
403	2
403	3
404	3
404	1
404	2
405	1
405	2
405	3
406	1
406	2
406	3
407	3
407	2
407	1
408	2
408	1
408	3
409	3
409	2
409	1
410	1
410	2
410	3
411	3
411	1
411	2
412	1
412	2
412	3
413	2
413	1
413	3
414	1
414	2
414	3
415	2
415	1
415	3
416	2
416	1
416	3
417	1
417	3
417	2
418	1
418	2
418	3
419	2
419	3
419	1
420	3
420	2
420	1
421	2
421	3
421	1
422	3
422	2
422	1
423	1
423	3
423	2
424	2
424	1
424	3
425	3
425	1
425	2
426	3
426	1
426	2
427	1
427	2
427	3
428	1
428	2
428	3
429	2
429	1
429	3
430	2
430	3
430	1
431	1
431	3
431	2
432	2
432	1
432	3
433	2
433	3
433	1
434	3
434	2
434	1
435	1
435	3
435	2
436	1
436	2
436	3
437	1
437	3
437	2
438	2
438	1
438	3
439	1
439	3
439	2
440	1
440	3
440	2
441	2
441	1
441	3
442	3
442	1
442	2
443	3
443	2
443	1
444	3
444	2
444	1
445	1
445	2
445	3
446	3
446	2
446	1
447	3
447	1
447	2
448	2
448	1
448	3
449	2
449	1
449	3
450	3
450	2
450	1
451	1
451	3
451	2
452	2
452	3
452	1
453	3
453	1
453	2
454	1
454	3
454	2
455	3
455	1
455	2
456	1
456	2
456	3
457	1
457	2
457	3
458	1
458	3
458	2
460	1
460	3
460	2
461	3
461	2
461	1
462	3
462	2
462	1
463	1
463	3
463	2
464	3
464	1
464	2
465	1
465	2
465	3
466	3
466	1
466	2
467	3
467	1
467	2
468	2
468	3
468	1
469	3
469	2
469	1
470	1
470	3
470	2
471	3
471	2
471	1
472	3
472	1
472	2
473	1
473	3
473	2
475	3
475	2
475	1
476	2
476	1
476	3
477	3
477	1
477	2
478	3
478	2
478	1
479	2
479	1
479	3
480	1
480	2
480	3
481	2
481	3
481	1
482	3
482	2
482	1
483	1
483	2
483	3
484	2
484	1
484	3
485	3
485	1
485	2
486	3
486	1
486	2
487	1
487	3
487	2
488	1
488	3
488	2
489	1
489	3
489	2
490	3
490	2
490	1
491	1
491	3
491	2
492	1
492	2
492	3
493	3
493	1
493	2
494	2
494	3
494	1
495	3
495	2
495	1
497	1
497	3
497	2
498	1
498	3
498	2
499	1
499	3
499	2
500	3
500	2
500	1
501	3
501	2
501	1
502	2
502	3
502	1
503	1
503	2
503	3
504	2
504	3
504	1
505	1
505	2
505	3
506	1
506	2
506	3
507	3
507	1
507	2
508	2
508	3
508	1
509	1
509	3
509	2
510	1
510	3
510	2
511	1
511	2
511	3
512	2
512	1
512	3
514	2
514	3
514	1
515	2
515	3
515	1
516	2
516	3
516	1
517	3
517	2
517	1
518	1
518	2
518	3
519	1
519	2
519	3
520	2
520	1
520	3
521	1
521	2
521	3
522	3
522	1
522	2
523	3
523	2
523	1
524	1
524	2
524	3
525	2
525	3
525	1
526	1
526	3
526	2
527	1
527	3
527	2
528	1
528	2
528	3
529	3
529	1
529	2
530	3
530	2
530	1
531	1
531	3
531	2
532	3
532	2
532	1
533	3
533	1
533	2
534	2
534	3
534	1
535	2
535	3
535	1
536	2
536	3
536	1
537	1
537	3
537	2
538	2
538	1
538	3
539	1
539	3
539	2
540	3
540	2
540	1
541	3
541	2
541	1
542	1
542	3
542	2
543	1
543	2
543	3
544	1
544	3
544	2
545	3
545	1
545	2
546	1
546	3
546	2
547	1
547	2
547	3
548	3
548	2
548	1
549	1
549	3
549	2
550	1
550	3
550	2
551	3
551	2
551	1
552	1
552	2
552	3
553	1
553	2
553	3
554	3
554	2
554	1
555	1
555	2
555	3
556	3
556	2
556	1
557	1
557	3
557	2
558	1
558	2
558	3
559	1
559	2
559	3
560	1
560	2
560	3
561	3
561	2
561	1
562	2
562	3
562	1
563	3
563	2
563	1
564	3
564	2
564	1
565	1
565	3
565	2
566	1
566	2
566	3
567	2
567	1
567	3
568	3
568	2
568	1
569	3
569	1
569	2
570	3
570	2
570	1
571	3
571	2
571	1
572	1
572	3
572	2
573	1
573	2
573	3
574	1
574	2
574	3
575	2
575	1
575	3
576	1
576	2
576	3
577	1
577	2
577	3
578	1
578	2
578	3
579	1
579	2
579	3
580	3
580	1
580	2
581	3
581	1
581	2
583	1
583	2
583	3
582	2
582	1
582	3
584	2
584	3
584	1
585	1
585	2
585	3
586	1
586	3
586	2
587	1
587	2
587	3
588	2
588	1
588	3
589	3
589	1
589	2
590	2
590	1
590	3
591	1
591	2
591	3
592	2
592	3
592	1
593	2
593	1
593	3
594	1
594	2
594	3
595	1
595	2
595	3
596	1
596	3
596	2
597	1
597	3
597	2
598	3
598	2
598	1
599	2
599	3
599	1
600	3
600	2
600	1
601	1
601	3
601	2
602	3
602	1
602	2
603	3
603	1
603	2
604	1
604	3
604	2
605	3
605	1
605	2
606	1
606	3
606	2
607	2
607	1
607	3
608	1
608	2
608	3
609	1
609	2
609	3
610	1
610	3
610	2
611	1
611	3
611	2
612	2
612	3
612	1
613	1
613	3
613	2
614	3
614	1
614	2
615	3
615	2
615	1
616	1
616	3
616	2
617	1
617	2
617	3
618	1
618	3
618	2
619	1
619	3
619	2
620	3
620	1
620	2
621	2
621	3
621	1
622	2
622	3
622	1
623	1
623	2
623	3
624	1
624	3
624	2
625	1
625	3
625	2
626	1
626	3
626	2
627	2
627	1
627	3
628	1
628	2
628	3
629	3
629	2
629	1
630	1
630	2
630	3
631	1
631	3
631	2
632	2
632	1
632	3
633	3
633	1
633	2
634	2
634	3
634	1
635	2
635	1
635	3
636	1
636	2
636	3
637	3
637	1
637	2
638	3
638	1
638	2
639	2
639	1
639	3
640	2
640	1
640	3
641	2
641	3
641	1
642	3
642	1
642	2
643	1
643	3
643	2
644	3
644	1
644	2
645	3
645	2
645	1
646	2
646	3
646	1
648	1
648	2
648	3
649	3
649	1
649	2
653	3
653	1
653	2
655	2
655	3
655	1
656	2
656	1
656	3
657	2
657	3
657	1
658	1
658	3
658	2
659	1
659	3
659	2
647	1
647	2
647	3
650	1
650	3
650	2
651	2
651	1
651	3
652	2
652	1
652	3
654	1
654	3
654	2
660	3
660	1
660	2
661	1
661	3
661	2
662	2
662	1
662	3
663	1
663	3
663	2
664	1
664	2
664	3
665	2
665	3
665	1
666	1
666	2
666	3
667	1
667	3
667	2
668	3
668	1
668	2
669	1
669	3
669	2
670	3
670	2
670	1
671	2
671	3
671	1
672	1
672	3
672	2
673	1
673	2
673	3
674	1
674	2
674	3
675	2
675	1
675	3
676	3
676	1
676	2
677	2
677	3
677	1
678	1
678	2
678	3
679	3
679	2
679	1
680	3
680	1
680	2
681	1
681	3
681	2
682	3
682	2
682	1
683	1
683	3
683	2
685	1
685	2
685	3
686	1
686	2
686	3
687	2
687	1
687	3
688	3
688	2
688	1
689	3
689	1
689	2
690	2
690	3
690	1
691	1
691	3
691	2
692	1
692	2
692	3
693	2
693	3
693	1
694	2
694	3
694	1
695	2
695	3
695	1
696	3
696	2
696	1
697	3
697	1
697	2
700	3
700	2
700	1
701	1
701	3
701	2
702	2
702	1
702	3
703	3
703	1
703	2
704	3
704	1
704	2
705	2
705	3
705	1
706	3
706	1
706	2
707	2
707	3
707	1
708	2
708	1
708	3
709	3
709	1
709	2
710	3
710	2
710	1
711	1
711	2
711	3
712	3
712	2
712	1
713	2
713	1
713	3
714	1
714	2
714	3
715	3
715	2
715	1
716	3
716	2
716	1
717	3
717	1
717	2
718	1
718	3
718	2
719	1
719	3
719	2
720	2
720	3
720	1
721	3
721	1
721	2
722	3
722	1
722	2
723	3
723	1
723	2
724	1
724	3
724	2
725	2
725	3
725	1
727	1
727	3
727	2
728	1
728	2
728	3
729	3
729	2
729	1
730	1
730	3
730	2
731	1
731	2
731	3
732	3
732	2
732	1
733	2
733	3
733	1
734	2
734	3
734	1
735	2
735	3
735	1
736	1
736	2
736	3
737	1
737	3
737	2
738	1
738	2
738	3
739	1
739	2
739	3
740	1
740	2
740	3
741	2
741	1
741	3
742	1
742	2
742	3
743	3
743	2
743	1
744	3
744	1
744	2
745	2
745	3
745	1
746	2
746	1
746	3
747	3
747	1
747	2
748	2
748	1
748	3
749	1
749	3
749	2
750	1
750	3
750	2
751	1
751	3
751	2
752	1
752	2
752	3
753	2
753	1
753	3
754	2
754	1
754	3
755	3
755	1
755	2
756	2
756	1
756	3
757	2
757	1
757	3
758	3
758	1
758	2
759	1
759	3
759	2
760	2
760	1
760	3
761	3
761	2
761	1
762	1
762	3
762	2
763	2
763	1
763	3
764	2
764	1
764	3
765	3
765	2
765	1
766	1
766	3
766	2
767	1
767	3
767	2
768	3
768	2
768	1
769	1
769	3
769	2
770	3
770	2
770	1
771	3
771	1
771	2
772	1
772	3
772	2
773	1
773	3
773	2
774	1
774	3
774	2
775	3
775	1
775	2
776	2
776	3
776	1
777	3
777	1
777	2
778	1
778	3
778	2
779	1
779	2
779	3
780	3
780	2
780	1
781	3
781	1
781	2
782	1
782	3
782	2
783	2
783	1
783	3
784	1
784	2
784	3
785	3
785	2
785	1
786	1
786	3
786	2
787	1
787	2
787	3
788	3
788	1
788	2
789	1
789	3
789	2
790	2
790	1
790	3
791	3
791	1
791	2
792	1
792	3
792	2
793	1
793	2
793	3
794	3
794	2
794	1
795	2
795	3
795	1
796	1
796	3
796	2
797	2
797	3
797	1
798	3
798	2
798	1
799	2
799	1
799	3
800	3
800	1
800	2
801	2
801	1
801	3
802	2
802	1
802	3
803	2
803	3
803	1
804	3
804	2
804	1
805	3
805	1
805	2
807	2
807	1
807	3
808	1
808	3
808	2
809	2
809	1
809	3
811	2
811	1
811	3
812	2
812	3
812	1
813	2
813	3
813	1
814	1
814	2
814	3
815	1
815	2
815	3
816	1
816	2
816	3
817	2
817	3
817	1
823	3
823	2
823	1
824	2
824	1
824	3
826	1
826	3
826	2
827	2
827	3
827	1
828	1
828	3
828	2
831	1
831	3
831	2
832	1
832	2
832	3
833	1
833	2
833	3
834	1
834	3
834	2
835	1
835	3
835	2
836	3
836	2
836	1
837	1
837	3
837	2
838	3
838	2
838	1
839	3
839	2
839	1
840	1
840	3
840	2
841	2
841	3
841	1
842	1
842	2
842	3
843	1
843	2
843	3
844	1
844	3
844	2
845	2
845	1
845	3
846	2
846	3
846	1
847	3
847	2
847	1
848	2
848	3
848	1
849	3
849	2
849	1
850	1
850	3
850	2
851	1
851	3
851	2
852	3
852	1
852	2
853	3
853	2
853	1
854	3
854	2
854	1
858	1
858	2
858	3
856	2
856	3
856	1
859	1
859	2
859	3
860	3
860	1
860	2
861	2
861	3
861	1
862	1
862	3
862	2
863	1
863	3
863	2
864	1
864	3
864	2
866	3
866	1
866	2
867	1
867	2
867	3
868	1
868	3
868	2
869	1
869	3
869	2
870	2
870	3
870	1
871	3
871	2
871	1
872	2
872	1
872	3
873	2
873	3
873	1
874	3
874	2
874	1
875	1
875	3
875	2
876	1
876	2
876	3
877	1
877	3
877	2
879	3
879	2
879	1
880	2
880	3
880	1
881	3
881	1
881	2
883	3
883	1
883	2
884	1
884	2
884	3
885	2
885	1
885	3
886	1
886	2
886	3
887	3
887	2
887	1
888	1
888	3
888	2
889	2
889	1
889	3
890	2
890	1
890	3
891	1
891	3
891	2
892	2
892	3
892	1
893	1
893	3
893	2
894	1
894	2
894	3
895	3
895	2
895	1
896	3
896	2
896	1
897	3
897	1
897	2
898	1
898	3
898	2
899	2
899	1
899	3
900	2
900	3
900	1
901	3
901	2
901	1
902	1
902	3
902	2
903	1
903	2
903	3
904	3
904	2
904	1
905	3
905	1
905	2
906	2
906	1
906	3
907	2
907	3
907	1
908	1
908	3
908	2
909	3
909	2
909	1
910	3
910	1
910	2
911	1
911	2
911	3
912	1
912	2
912	3
913	2
913	1
913	3
914	1
914	2
914	3
915	2
915	3
915	1
916	1
916	2
916	3
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
1	TALLE
3	CALCE
2	COLOR
4	CUELLO
5	MANGAS
6	ESTILO
\.


--
-- Data for Name: propiedades_atributos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.propiedades_atributos (id_propiedad, id_atributo) FROM stdin;
2	5
2	6
3	38
3	39
3	40
2	42
1	49
1	52
1	50
1	51
1	48
1	53
1	54
1	47
2	34
2	31
2	29
2	44
2	32
2	33
2	37
2	41
2	36
2	35
2	30
4	55
4	56
5	58
5	57
2	59
6	62
6	61
6	60
6	63
\.


--
-- Data for Name: proveedor_sucursal; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.proveedor_sucursal (id_proveedor, id_sucursal) FROM stdin;
\.


--
-- Data for Name: punto_ventas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.punto_ventas (id, id_fiscal, nombre, sucursal_id, ip_local) FROM stdin;
1	4	Punto de venta sucursal 1	1	\N
2	4	Punto de venta sucursal 2	2	\N
3	4	Punto de venta sucursal 2	2	\N
\.


--
-- Data for Name: rubros; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.rubros (id, nombre) FROM stdin;
7	PANTALON DAMA
2	PANTALON HOMBRE
6	REMERA HOMBRE
3	CHOMBA HOMBRE
8	BERMUDA HOMBRE
\.


--
-- Data for Name: stocks; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.stocks (id, algorim, cantidad, cantidad_minima, deposito_id, producto_id, sucursal_id) FROM stdin;
8	11486237.0366	4	1	6	803	1
14	11486237.0301	6	1	1	800	1
\.


--
-- Data for Name: sucursales; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.sucursales (id, ciudad, cuit, direccion, email, fecha_inicio_act, ing_bruto, nombre, nombre_contacto, provincia, razon_social, telefono, telefono_alternativo, condicion_iva_id, empresa_id, variacion_ganancia) FROM stdin;
1	Reconquista	33333333	Calle xx, número 123	casasonia@gmail.com	2020-09-24 00:00:00	14133445	CASA SONIA RUTA	CASA SONIA	Santa Fe	CASA SONIA RUTA	444444	444445	1	1	0.00
2	Reconquista	33333333	Calle xx, número 234	casasonia@gmail.com	2020-09-24 00:00:00	14133445	CASA SONIA CENTRO	CASA SONIA SUC2	Santa Fe	CASA SONIA CENTRO	444455	444456	1	1	0.00
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
4	Cajero Sucursal 1	$2y$12$MQfxsOL1Ub4iJMCUNyZx1u2gabW6X1a7mEJzR4bCGpOMh2ou.bylu	cajero1	1	4	1	1
5	Cajero Sucursal 2	$2a$10$/e6QaxsOmKXK7/DGzrKvruIgofAa1sOktl7Yao.H0IPHtcNtuofka	cajero2	1	4	2	2
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

SELECT pg_catalog.setval('public.atributos_id_seq', 66, true);


--
-- Name: caja_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.caja_id_seq', 1, false);


--
-- Name: clientes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.clientes_id_seq', 1, false);


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

SELECT pg_catalog.setval('public.depositos_id_seq', 6, true);


--
-- Name: devoluciones_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.devoluciones_id_seq', 1, false);


--
-- Name: distribuidores_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.distribuidores_id_seq', 1, false);


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

SELECT pg_catalog.setval('public.historial_movimientos_stock_id_seq', 44, true);


--
-- Name: ivas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.ivas_id_seq', 1, false);


--
-- Name: marcas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.marcas_id_seq', 56, true);


--
-- Name: medios_pagos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.medios_pagos_id_seq', 1, false);


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

SELECT pg_catalog.setval('public.planes_pagos_id_seq', 1, false);


--
-- Name: preguntas_frecuentes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.preguntas_frecuentes_id_seq', 1, false);


--
-- Name: productos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.productos_id_seq', 916, true);


--
-- Name: productos_variaciones_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.productos_variaciones_id_seq', 1, false);


--
-- Name: propiedades_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.propiedades_id_seq', 6, true);


--
-- Name: punto_ventas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.punto_ventas_id_seq', 3, true);


--
-- Name: rubros_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.rubros_id_seq', 8, true);


--
-- Name: stocks_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.stocks_id_seq', 14, true);


--
-- Name: sucursales_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.sucursales_id_seq', 2, true);


--
-- Name: transportistas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.transportistas_id_seq', 1, false);


--
-- Name: usuarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuarios_id_seq', 7, true);


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

