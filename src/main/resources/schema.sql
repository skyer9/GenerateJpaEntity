CREATE TABLE `posts` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `content` text NOT NULL,
  `title` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
);
