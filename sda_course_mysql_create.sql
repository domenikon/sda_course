CREATE TABLE `students` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` varchar(50) NOT NULL,
	`surename` varchar(50) NOT NULL,
	`dob` DATE NOT NULL,
	`nationality` varchar(50) NOT NULL,
	PRIMARY KEY (`id`)
);



CREATE TABLE `student_group` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`student_id` INT NOT NULL,
	`group_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `schedule` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`monday` varchar(50) NOT NULL,
	`tuesday` varchar(50) NOT NULL,
	`wednesday` varchar(50) NOT NULL,
	`thursday` varchar(50) NOT NULL,
	`friday` varchar(50) NOT NULL,
	`saturday` varchar(50) NOT NULL,
	`sunday` varchar(50) NOT NULL,
	PRIMARY KEY (`id`)
);



CREATE TABLE `payments` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`student_id` INT NOT NULL,
	`course_id` INT NOT NULL,
	`invoice_value` FLOAT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `group` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`schedule_id` INT NOT NULL,
	`room_id` INT NOT NULL,
	`date_start` DATE NOT NULL,
	`date_finish` DATE NOT NULL,
	`course_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);



CREATE TABLE `course` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` varchar(50) NOT NULL,
	`topic` varchar(50) NOT NULL,
	`level` varchar(50) NOT NULL,
	PRIMARY KEY (`id`)
);



CREATE TABLE `room` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`address_id` INT NOT NULL,
	`max_size` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `address` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`city` varchar(50) NOT NULL,
	`street` varchar(50) NOT NULL,
	`number` INT NOT NULL,
	PRIMARY KEY (`id`)
);



ALTER TABLE `studet_group` ADD CONSTRAINT `studet_group_fk0` FOREIGN KEY (`id`) REFERENCES `students`(`id`);



ALTER TABLE `studet_group` ADD CONSTRAINT `studet_group_fk1` FOREIGN KEY (`group_id`) REFERENCES `group`(`id`);


ALTER TABLE `payments` ADD CONSTRAINT `payments_fk0` FOREIGN KEY (`student_id`) REFERENCES `students`(`id`);



ALTER TABLE `payments` ADD CONSTRAINT `payments_fk1` FOREIGN KEY (`course_id`) REFERENCES `course`(`id`);



ALTER TABLE `group` ADD CONSTRAINT `group_fk0` FOREIGN KEY (schedule_id) REFERENCES `schedule`(`id`);



ALTER TABLE `group` ADD CONSTRAINT `group_fk1` FOREIGN KEY (`room_id`) REFERENCES `room`(`id`);



ALTER TABLE `group` ADD CONSTRAINT `group_fk2` FOREIGN KEY (`course_id`) REFERENCES `course`(`id`);



ALTER TABLE `room` ADD CONSTRAINT `room_fk0` FOREIGN KEY (`address_id`) REFERENCES `address`(`id`);

