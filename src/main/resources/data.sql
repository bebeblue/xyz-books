INSERT INTO library.publisher(publisher_id, name) VALUES 
(1, "McSweeney’s"),
(2, 'Penguin Random House'),
(3, 'Top Shelf Productions');

INSERT INTO library.book(book_id, title, isbn13, price, year, image_url, edition, publisher_id) VALUES 
(1, 'Doughnuts And Doom', '978-1-603095-13-6', 100.0, '2022', '/images/image1', 'Book 3', 1),
(2, 'The Bend Of Luck', '978-1-603095-09-9', 19.99, '2021', '/images/image2', 'Book 2', 2),
(3, 'The Underwater Welder', '978-1-60309-392-7', 29.99, '2020', '/images/image3', 'Book 1', 3),
(4, 'The Delicacy', '978-1-60309-492-4', 30.25, '2020', '/images/image3', 'Book 1', 3);

INSERT INTO library.author(author_id, first_name, last_name, middle_name_or_initial) VALUES
(1, 'Hannah','Templer','P.'),
(2, 'Marguerite','Duras','Z.'),
(3, 'Iceberg','Slim','Nash'),
(4, 'Camille','Paglia','Byron'),
(5, 'Peter','Hoey',''),
(6, 'Maria','Hoey',''),
(7, 'Jeff','Lemire',''),
(8, 'James','Albon','');

INSERT INTO book_author(book_id, author_id) VALUES 
(1,1),
(1,2),
(1,3),
(1,4),
(2,5),
(2,6),
(3,7),
(4,8);