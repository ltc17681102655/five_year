CREATE
DATABASE `ds_0` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

CREATE TABLE `user_0`
(
    `id`       bigint(64) NOT NULL,
    `memberId` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `city`     varchar(20)                                            NOT NULL,
    `name`     varchar(20)                                            NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_1`
(
    `id`       bigint(64) NOT NULL,
    `memberId` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `city`     varchar(20)                                            NOT NULL,
    `name`     varchar(20)                                            NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_2`
(
    `id`       bigint(64) NOT NULL,
    `memberId` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `city`     varchar(20)                                            NOT NULL,
    `name`     varchar(20)                                            NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_3`
(
    `id`       bigint(64) NOT NULL,
    `memberId` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `city`     varchar(20)                                            NOT NULL,
    `name`     varchar(20)                                            NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
