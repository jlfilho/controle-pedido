-- Insert 1
INSERT INTO categoria (id, nome) VALUES (1, 'Eletrônico');

-- Insert 2
INSERT INTO categoria (id, nome) VALUES (2, 'Roupas');

INSERT INTO categoria (id, nome) VALUES (3, 'Acessórios');

-- Insert 3
INSERT INTO categoria (id, nome) VALUES (4, 'Livros');

-- Insert 4
INSERT INTO categoria (id, nome) VALUES (5, 'Jogos');

-- Insert 5
INSERT INTO categoria (id, nome) VALUES (6, 'Casa e Decoração');

-- Insert 6
INSERT INTO categoria (id, nome) VALUES (7, 'Esportes');

-- Insert 7
INSERT INTO categoria (id, nome) VALUES (8, 'Beleza');

-- Insert 8
INSERT INTO categoria (id, nome) VALUES (9, 'Alimentos');

-- Insert 9
INSERT INTO categoria (id, nome) VALUES (10, 'Automotivo');

-- Insert 10
INSERT INTO categoria (id, nome) VALUES (11, 'Brinquedos');

-- Insert 11
INSERT INTO categoria (id, nome) VALUES (12, 'Instrumentos Musicais');

-- Insert 12
INSERT INTO categoria (id, nome) VALUES (13, 'Saúde');

-- Insert 13
INSERT INTO categoria (id, nome) VALUES (14, 'Ferramentas');

-- Insert 14
INSERT INTO categoria (id, nome) VALUES (15, 'Artes e Artesanato');

-- Insert 15
INSERT INTO categoria (id, nome) VALUES (16, 'Móveis');

-- Produto

 INSERT INTO produto (id, nome, preco) VALUES (1, 'Smartphone', 599.99);

-- Exemplo 1
INSERT INTO produto (id, nome, preco) VALUES (2, 'Laptop', 999.99);

-- Exemplo 2
INSERT INTO produto (id, nome, preco) VALUES (3, 'Tablet', 299.99);

-- Exemplo 3
INSERT INTO produto (id, nome, preco) VALUES (4, 'Smartwatch', 149.99);

-- Exemplo 4
INSERT INTO produto (id, nome, preco) VALUES (5, 'Headphones', 79.99);

-- Exemplo 5
INSERT INTO produto (id, nome, preco) VALUES (6, 'Câmera Digital', 449.99);

-- Exemplo 6
INSERT INTO produto (id, nome, preco) VALUES (7, 'Teclado sem fio', 29.99);

-- Exemplo 7
INSERT INTO produto (id, nome, preco) VALUES (8, 'Mouse óptico', 19.99);

-- Exemplo 8
INSERT INTO produto (id, nome, preco) VALUES (9, 'Impressora a jato de tinta', 129.99);

-- Exemplo 9
INSERT INTO produto (id, nome, preco) VALUES (10, 'Console de videogame', 399.99);

-- Exemplo 10
INSERT INTO produto (id, nome, preco) VALUES (11, 'Monitor LED', 229.99);

-- Exemplo 11
INSERT INTO produto (id, nome, preco) VALUES (12, 'Fone de ouvido Bluetooth', 59.99);

-- Exemplo 12
INSERT INTO produto (id, nome, preco) VALUES (13, 'Roteador Wi-Fi', 79.99);

-- Exemplo 13
INSERT INTO produto (id, nome, preco) VALUES (14, 'Caixa de som Bluetooth', 39.99);

-- Exemplo 14
INSERT INTO produto (id, nome, preco) VALUES (15, 'Mochila para laptop', 49.99);

-- Exemplo 15
INSERT INTO produto (id, nome, preco) VALUES (16, 'Carregador portátil', 24.99);

-- Insert 1
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (1, 1);

-- Insert 2
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (2, 3);

-- Insert 3
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (1, 2);

-- Insert 4
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (3, 4);

-- Insert 5
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (2, 5);

-- Insert 6
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (1, 6);

-- Insert 7
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (3, 7);

-- Insert 8
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (2, 8);

-- Insert 9
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (1, 9);

-- Insert 10
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (3, 10);

-- Insert 11
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (2, 11);

-- Insert 12
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (1, 12);

-- Insert 13
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (3, 13);

-- Insert 14
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (2, 14);

-- Insert 15
INSERT INTO produto_categoria (CATEGORIA_ID, PRODUTO_ID) VALUES (1, 15);
