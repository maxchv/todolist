INSERT INTO todolist(title, description, priority, created, last_update, done)
    VALUES
      ('Купить молока', 'Два литра', 2, current_timestamp(), current_timestamp(), FALSE),
      ('Выгулять собаку', 'Под дождем', 1, current_timestamp(), current_timestamp(), FALSE),
      ('Выучить Android', 'Хотя бы половину', 0, current_timestamp(), current_timestamp(), FALSE),
      ('Поспать', 'Как минимум два часа', 0, current_timestamp(), current_timestamp(), FALSE);