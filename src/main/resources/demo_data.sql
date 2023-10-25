insert into users(name, username, password)
values ('John Doe', 'johndoe@gmail.com', '$2a$10$TCsub/lmFFJgBvtNcoHpreDq01nWbjzvgQFvLpQviZBkZCxgZajoe'),
       ('Mike Smith', 'mikesmith@gmail.com', '$2a$10$jMbLI/LYN0eCwn/Olkaw8uEuBfVet0P9gu6cSbYB2IlIIzvzJMkc6');


insert into tasks(title, description, status, expiration_date)
values ('Buy cheese', null, 'TODO', '2023-01-29 12:00:00'),
       ('Do homework', 'Math, Phusics, Literature', 'IN_PROGRESS', '2023-01-31 00:00:00'),
       ('Clean rooms', null, 'DONE', null),
       ('Call Mike', 'Ask about meeting', 'TODO', '2023-02-01 00:00:00');

insert into users_tasks(task_id, user_id)
values (1, 2),
       (2, 2),
       (3, 2),
       (4, 1);

insert into users_roles(user_id, role)
values (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER');