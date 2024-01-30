DROP DATABASE IF EXISTS `Spring_AM_01`;
CREATE DATABASE `Spring_AM_01`;
USE `Spring_AM_01`;

# article 테이블 생성
CREATE TABLE article(
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    title CHAR(100) NOT NULL,
    `body` TEXT NOT NULL
);

CREATE TABLE `member`(
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    loginId CHAR(50) NOT NULL UNIQUE,
    loginPw CHAR(100) NOT NULL,
    `name` CHAR(30) NOT NULL,
    nickname CHAR(50) NOT NULL,
    cellphoneNum INT(20) NOT NULL UNIQUE,
    email CHAR(50) NOT NULL
);

# article TD 생성
INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목1',
`body` = '내용1';

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목2',
`body` = '내용2';

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목3',
`body` = '내용3';

INSERT INTO
`member` 
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'test1',
loginPw = 'test1',
`name` = 'testname1',
nickname = 'testnickname',
cellphoneNum = '01011112222',
email = 'test1@gmail.com';

INSERT INTO
`member` 
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'test2',
loginPw = 'test2',
`name` = 'testname2',
nickname = 'testnickname',
cellphoneNum = '01022223333',
email = 'test2@gmail.com';

INSERT INTO
`member` 
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'test3',
loginPw = 'test3',
`name` = 'testname3',
nickname = 'testnickname3',
cellphoneNum = '01033334444',
email = 'test3@gmail.com';

SELECT *
FROM article;

SELECT *
FROM `member`;