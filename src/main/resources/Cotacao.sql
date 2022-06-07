CREATE TABLE cotacao (
    id_cotacao varchar(64) not null,
    id_moeda varchar(64) not null,
    dt_Data date not null,
    vr_valor decimal(14,4) null,
    PRIMARY KEY pk_cotacao (id_cotacao)
);