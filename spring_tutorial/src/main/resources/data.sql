---- rolesテーブル
INSERT IGNORE INTO roles (role_id, role_name) VALUES 
	(1, 'ROLE_GENERAL'),
	(2, 'ROLE_ADMIN');
	
	
-- usersテーブル
INSERT IGNORE INTO users (user_id, user_name, password, role_id) VALUES
	(1, '侍太郎', '$2a$10$2JNjTwZBwo7fprL2X4sv.OEKqxnVtsVQvuXDkI8xVGix.U3W5B7CO', 1),
	(2, '侍花子', '$2a$10$2JNjTwZBwo7fprL2X4sv.OEKqxnVtsVQvuXDkI8xVGix.U3W5B7CO', 2),
	(3, '侍義勝', 'password', 1),
	(4, '侍幸美', 'password', 1),
	(5, '侍雅', 'password', 1);