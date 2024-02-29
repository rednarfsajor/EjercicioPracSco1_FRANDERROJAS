{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 -- Crear la base de datos para la librer\'eda\
CREATE DATABASE IF NOT EXISTS libreria_db;\
USE libreria_db;\
\
-- Tabla para almacenar la informaci\'f3n de los libros\
CREATE TABLE IF NOT EXISTS libros (\
    id INT AUTO_INCREMENT PRIMARY KEY,\
    titulo VARCHAR(100) NOT NULL,\
    autor VARCHAR(100) NOT NULL,\
    precio DECIMAL(10, 2) NOT NULL,\
    categoria VARCHAR(50) NOT NULL\
);\
\
-- Tabla para almacenar la informaci\'f3n de los clientes\
CREATE TABLE IF NOT EXISTS clientes (\
    id INT AUTO_INCREMENT PRIMARY KEY,\
    nombre VARCHAR(100) NOT NULL,\
    email VARCHAR(100) NOT NULL,\
    mensaje TEXT\
);\
\
-- Insertar datos de ejemplo en la tabla de libros (opcional)\
INSERT INTO libros (titulo, autor, precio, categoria) VALUES\
    ('El nombre del viento', 'Patrick Rothfuss', 25.99, 'Fantas\'eda'),\
    ('Cien a\'f1os de soledad', 'Gabriel Garc\'eda M\'e1rquez', 19.99, 'Realismo m\'e1gico'),\
    ('1984', 'George Orwell', 15.50, 'Ciencia ficci\'f3n');\
\
-- Verificar la creaci\'f3n de las tablas\
SHOW TABLES;\
}