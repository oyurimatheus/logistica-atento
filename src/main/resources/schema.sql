    CREATE TABLE usuarios(
    id_usuario              INTEGER,
    primeiro_nome           VARCHAR(50) NOT NULL,
    sobrenome               VARCHAR(50) NOT NULL,
    cep                     VARCHAR(9) NOT NULL,
    rua                     VARCHAR(50) NOT NULL,
    numero                  VARCHAR(5) NOT NULL,
    complemento             VARCHAR(10),
    cargo                   VARCHAR(20),
    horario_entrada			    DATE,
    horario_saida			      DATE,
    gasto_com_transporte    DECIMAL(10,2),
    id_mt                   INTEGER NOT NULL,
    id_fretado              INTEGER NOT NULL,

    CONSTRAINT pk_id_usuario PRIMARY KEY (id_usuario),
    CONSTRAINT ck_cargo_usuario CHECK( cargo IN ('candidato', 'funcionario'))
);

CREATE TABLE meios_de_transporte(
    id_mt            INTEGER,
    nome_transporte  VARCHAR(50) NOT NULL,
    custo            DECIMAL(10,2) NOT NULL,

    CONSTRAINT pk_id_mt PRIMARY KEY (id_mt)
);

CREATE TABLE fretados(
    id_fretado          INTEGER,
    horario_de_partida  DATE NOT NULL,
    capacidade          INTEGER(2) NOT NULL,

    CONSTRAINT pk_id_fretado PRIMARY KEY (id_fretado)
);

CREATE TABLE rotas(
    id_rota         INTEGER,
    custo           DECIMAL(10,2) NOT NULL,
    tempo_decorrido DATE NOT NULL,
    distancia       INTEGER NOT NULL,

    CONSTRAINT pk_id_rota PRIMARY KEY (id_rota)
);

CREATE TABLE fretados_rotas(
    id_fretado INTEGER NOT NULL,
    id_rota    INTEGER NOT NULL,

    CONSTRAINT pk_id_rota PRIMARY KEY (id_fretado, id_rota)
);

ALTER TABLE usuarios
ADD CONSTRAINT fk_id_mt_usuarios
   FOREIGN KEY (id_mt)
   REFERENCES meios_de_transporte (id_mt);

ALTER TABLE usuarios
ADD CONSTRAINT fk_id_fretado_usuarios
   FOREIGN KEY (id_fretado)
   REFERENCES fretados (id_fretado);

ALTER TABLE fretados_rotas
ADD CONSTRAINT fk_id_fretado_fretados_rotas
   FOREIGN KEY (id_fretado)
   REFERENCES fretados (id_fretado);

ALTER TABLE fretados_rotas
ADD CONSTRAINT fk_id_rota_fretados_rotas
   FOREIGN KEY (id_rota)
   REFERENCES rotas (id_rota);