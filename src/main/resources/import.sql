INSERT INTO meios_de_transporte (id_mt, nome_transporte, custo) VALUES (1, 'PUBLICO', 4.00);
INSERT INTO meios_de_transporte (id_mt, nome_transporte, custo) VALUES (2, 'FRETADO', 12.52);

INSERT INTO fretados (id_fretado, horario_de_partida, capacidade) VALUES (1, '23:00:00', 42);
INSERT INTO rotas (id_rota, custo, tempo_decorrido, distancia) VALUES (1, 100.55, '1:15:00', 60);
INSERT INTO fretados_rotas(id_fretado, id_rota) VALUES (1, 1);

INSERT INTO usuarios (id_usuario, primeiro_nome, sobrenome, cep, rua, numero, complemento, cargo, horario_entrada, horario_saida, gasto_com_transporte, id_mt, id_fretado) VALUES (1, 'Yuri', 'Matheus', '08230300', 'Rua Naim', 26, '', 'funcionario', '23:00:00', '8:00:00', 250.40, 2, 1);

INSERT INTO usuarios (id_usuario, primeiro_nome, sobrenome, cep, rua, numero, complemento, cargo, horario_entrada, horario_saida, gasto_com_transporte, id_mt, id_fretado) VALUES (2, 'Gabriel', 'Ronei', '08230300', 'Rua Naim', 26, '', 'funcionario', '23:00:00', '8:00:00', 250.40, 2, 1);

INSERT INTO usuarios (id_usuario, primeiro_nome, sobrenome, cep, rua, numero, complemento, cargo, horario_entrada, horario_saida, gasto_com_transporte, id_mt, id_fretado) VALUES (3, 'Leonardo', 'Freitas', '08230300', 'Rua Naim', 26, '', 'funcionario', '23:00:00', '8:00:00', 250.40, 2, 1);

INSERT INTO usuarios (id_usuario, primeiro_nome, sobrenome, cep, rua, numero, complemento, cargo, horario_entrada, horario_saida, gasto_com_transporte, id_mt, id_fretado) VALUES (4, 'Leo', 'Toledo', '08230300', 'Rua Naim', 26, '', 'funcionario', '23:00:00', '8:00:00', 250.40, 2, 1);

INSERT INTO usuarios (id_usuario, primeiro_nome, sobrenome, cep, rua, numero, complemento, cargo, horario_entrada, horario_saida, gasto_com_transporte, id_mt, id_fretado) VALUES (5, 'Yago', 'Henrique', '08230300', 'Rua Naim', 26, '', 'funcionario', '23:00:00', '8:00:00', 250.40, 2, 1);

INSERT INTO usuarios (id_usuario, primeiro_nome, sobrenome, cep, rua, numero, complemento, cargo, horario_entrada, horario_saida, gasto_com_transporte, id_mt, id_fretado) VALUES (6, 'Joao', 'Pedro', '08230300', 'Rua Naim', 26, '', 'funcionario', '23:00:00', '8:00:00', 250.40, 2, 1);