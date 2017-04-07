CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(128) COLLATE utf8_persian_ci NOT NULL,
  `password` varchar(128) COLLATE utf8_persian_ci NOT NULL,
  `first_name` varchar(128) COLLATE utf8_persian_ci NOT NULL,
  `last_name` varchar(128) COLLATE utf8_persian_ci NOT NULL,
  `email` varchar(128) COLLATE utf8_persian_ci NOT NULL,
  `role` int(11) NOT NULL,
  `identifier` varchar(128) COLLATE utf8_persian_ci NOT NULL,
  `is_active` bit(1) NOT NULL,
  `activation_identifier` varchar(128) COLLATE utf8_persian_ci NOT NULL,
  `registration_date` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_mx10rs1vdna2kd1fxj80koofl` (`activation_identifier`),
  UNIQUE KEY `UK_6dotkott2kjsp8vw4d0m25fb7` (`email`),
  UNIQUE KEY `UK_qxbxprw69rusb9ap6ydm5ndue` (`identifier`),
  UNIQUE KEY `UK_k8d0f2n7n88w1a16yhua64onx` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;


CREATE TABLE `sessions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `identifier` varchar(128) COLLATE utf8_persian_ci NOT NULL,
  `creation_date` datetime NOT NULL,
  `expiration_date` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_nbapa2r485p734m7dfnycu049` (`identifier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

ALTER TABLE `organization_manager`.`sessions`
ADD INDEX `id_idx` (`user_id` ASC);
ALTER TABLE `organization_manager`.`sessions`
ADD CONSTRAINT `id`
  FOREIGN KEY (`user_id`)
  REFERENCES `organization_manager`.`users` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;




