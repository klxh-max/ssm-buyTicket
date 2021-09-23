/*
SQLyog Professional v12.08 (32 bit)
MySQL - 5.5.62 : Database - ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm`;

/*Table structure for table `film` */

DROP TABLE IF EXISTS `film`;

CREATE TABLE `film` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `film_id` varchar(50) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL COMMENT '名字',
  `director` varchar(50) DEFAULT NULL COMMENT '导演',
  `player` varchar(500) DEFAULT NULL COMMENT '主演',
  `type` varchar(50) DEFAULT NULL COMMENT '类型',
  `country` varchar(50) DEFAULT NULL COMMENT '制片国家',
  `length` int(11) DEFAULT NULL COMMENT '片长(分钟)',
  `synopsis` varchar(1000) DEFAULT NULL COMMENT '剧情介绍',
  `play_time` date DEFAULT NULL COMMENT '上映时间',
  `img_path` varchar(100) DEFAULT NULL COMMENT '宣传图地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `film` */

insert  into `film`(`id`,`film_id`,`name`,`director`,`player`,`type`,`country`,`length`,`synopsis`,`play_time`,`img_path`) values (1,'1111','肖申克的救赎','弗兰克·德拉邦特','蒂姆·罗宾斯 / 摩根·弗里曼 / 鲍勃·冈顿 / 威廉姆·赛德勒 / 克兰西·布朗 ','剧情 / 犯罪','美国',142,'一场谋杀案使银行家安迪（蒂姆•罗宾斯 Tim Robbins 饰）蒙冤入狱，谋杀妻子及其情人的指控将囚禁他终生。在肖申克监狱的首次现身就让监狱“大哥”瑞德（摩根•弗里曼 Morgan Freeman 饰）对他另眼相看。瑞德帮助他搞到一把石锤和一幅女明星海报，两人渐成患难 之交。很快，安迪在监狱里大显其才，担当监狱图书管理员，并利用自己的金融知识帮助监狱官避税，引起了典狱长的注意，被招致麾下帮助典狱长洗黑钱。偶然一次，他得知一名新入狱的小偷能够作证帮他洗脱谋杀罪。燃起一丝希望的安迪找到了典狱长，希望他能帮自己翻案。阴险伪善的狱长假装答应安迪，背后却派人杀死小偷，让他唯一能合法出狱的希望泯灭。沮丧的安迪并没有绝望，在一个电闪雷鸣的风雨夜，一场暗藏几十年的越狱计划让他自我救赎，重获自由！老朋友瑞德在他的鼓舞和帮助下，也勇敢地奔向自由。','2021-06-21','/img/1111.png'),(2,'2222','霸王别姬','陈凯歌','张国荣 / 张丰毅 / 巩俐 / 葛优 / 英达 / 更多...','动画剧情 / 爱情 / 同性','中国大陆 / 中国香港',171,'段小楼（张丰毅）与程蝶衣（张国荣）是一对打小一起长大的师兄弟，两人一个演生，一个饰旦，一向配合天衣无缝，尤其一出《霸王别姬》，更是誉满京城，为此，两人约定合演一辈子《霸王别姬》。但两人对戏剧与人生关系的理解有本质不同，段小楼深知戏非人生，程蝶衣则是人戏不分。','2021-06-21','/img/2222.png'),(3,'3333','阿甘正传','罗伯特·泽米吉斯','汤姆·汉克斯 / 罗宾·怀特 / 加里·西尼斯 / 麦凯尔泰·威廉逊 / 莎莉·菲尔德 / 更多...','剧情 / 爱情','美国',142,'阿甘（汤姆·汉克斯 饰）于二战结束后不久出生在美国南方阿拉巴马州一个闭塞的小镇，他先天弱智，智商只有75，然而他的妈妈是一个性格坚强的女性，她常常鼓励阿甘“傻人有傻福”，要他自强不息。','2021-06-21','/img/3333.png'),(4,'4444','这个杀手不太冷','吕克·贝松','让·雷诺 / 娜塔莉·波特曼 / 加里·奥德曼 / 丹尼·爱罗 / 彼得·阿佩尔 / 更多...','剧情 / 动作 / 犯罪','法国 / 美国',110,'里昂（让·雷诺饰）是名孤独的职业杀手，受人雇佣。一天，邻居家小姑娘马蒂尔达（纳塔丽·波特曼饰)敲开他的房门，要求在他那里暂避杀身之祸。原来邻居家的主人是警方缉毒组的眼线，只因贪污了一小包毒品而遭恶警（加里·奥德曼饰）杀害全家的惩罚。马蒂尔达得到里昂的留救，幸免于难，并留在里昂那里。里昂教小女孩使枪，她教里昂法文，两人关系日趋亲密，相处融洽。','2021-06-21','/img/4444.png'),(5,'5555','泰坦尼克号','詹姆斯·卡梅隆','莱昂纳多·迪卡普里奥 / 凯特·温丝莱特 / 比利·赞恩 / 凯西·贝茨 / 弗兰西丝·费舍 / 更多...','剧情 / 爱情 / 灾难','美国 / 墨西哥 / 澳大利亚 / 加拿大',194,'1912年4月10日，号称 “世界工业史上的奇迹”的豪华客轮泰坦尼克号开始了自己的处女航，从英国的南安普顿出发驶往美国纽约。富家少女罗丝（凯特•温丝莱特）与母亲及未婚夫卡尔坐上了头等舱；另一边，放荡不羁的少年画家杰克（莱昂纳多·迪卡普里奥）也在码头的一场赌博中赢得了下等舱的船票。','2021-06-21','/img/5555.png'),(6,'6666','美丽人生','罗伯托·贝尼尼','罗伯托·贝尼尼 / 尼可莱塔·布拉斯基 / 乔治·坎塔里尼 / 朱斯蒂诺·杜拉诺 / 赛尔乔·比尼·布斯特里克','剧情 / 喜剧 / 爱情 / 战争','意大利',116,'犹太青年圭多（罗伯托·贝尼尼）邂逅美丽的女教师多拉（尼可莱塔·布拉斯基），他彬彬有礼的向多拉鞠躬：“早安！公主！”。历经诸多令人啼笑皆非的周折后，天遂人愿，两人幸福美满的生活在一起。','2021-06-21','/img/6666.png'),(7,'7777','千与千寻','宫崎骏','柊瑠美 / 入野自由 / 夏木真理 / 菅原文太 / 中村彰男 / 更多...','剧情 / 动画 / 奇幻','日本',125,'千寻和爸爸妈妈一同驱车前往新家，在郊外的小路上不慎进入了神秘的隧道——他们去到了另外一个诡异世界—一个中世纪的小镇。远处飘来食物的香味，爸爸妈妈大快朵颐，孰料之后变成了猪！这时小镇上渐渐来了许多样子古怪、半透明的人。','2021-06-21','/img/7777.png'),(8,'8888','辛德勒的名单','史蒂文·斯皮尔伯格','连姆·尼森 / 本·金斯利 / 拉尔夫·费因斯 / 卡罗琳·古多尔 / 乔纳森·萨加尔 / 更多...','剧情 / 历史 / 战争','美国',195,'1939年，波兰在纳粹德国的统治下，党卫军对犹太人进行了隔离统治。德国商人奥斯卡·辛德勒（连姆·尼森 Liam Neeson 饰）来到德军统治下的克拉科夫，开设了一间搪瓷厂，生产军需用品。凭着出众的社交能力和大量的金钱，辛德勒和德军建立了良好的关系，他的工厂雇用犹太人工作，大发战争财。','2021-06-21','/img/8888.png');

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `play_id` varchar(100) DEFAULT NULL,
  `seat_num` int(11) DEFAULT NULL,
  `seat` varchar(200) DEFAULT NULL,
  `user_id` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `order` */

insert  into `order`(`id`,`order_id`,`create_time`,`price`,`play_id`,`seat_num`,`seat`,`user_id`) values (1,'1111111111111',NULL,'50.00',NULL,2,'1-2,3-4',NULL),(2,'22222222',NULL,'50.00',NULL,2,'2-2,2-4',NULL);

/*Table structure for table `play` */

DROP TABLE IF EXISTS `play`;

CREATE TABLE `play` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `play_id` varchar(100) DEFAULT NULL,
  `play_time` datetime DEFAULT NULL,
  `lan_type` varchar(100) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `room_id` varchar(100) DEFAULT NULL,
  `room_name` varchar(100) DEFAULT NULL,
  `film_id` varchar(100) DEFAULT NULL,
  `film_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `play` */

insert  into `play`(`id`,`play_id`,`play_time`,`lan_type`,`price`,`room_id`,`room_name`,`film_id`,`film_name`) values (1,'1001','2021-06-25 20:00:00','中文','39.99','9001','VIP一号厅','1111','肖申克的救赎'),(2,'1002','2021-06-25 22:00:00','中文','38.00','9002','VIP二号厅','1111','肖申克的救赎'),(3,'1003','2021-06-25 23:00:00','中文','40.00','9003','VIP三号厅','2222','霸王别姬');

/*Table structure for table `room` */

DROP TABLE IF EXISTS `room`;

CREATE TABLE `room` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `room_id` varchar(100) DEFAULT NULL,
  `room_name` varchar(100) DEFAULT NULL,
  `situation` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `room` */

insert  into `room`(`id`,`room_id`,`room_name`,`situation`) values (1,'9001','VIP一号厅','[[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0]]'),(2,'9002','VIP二号厅','[[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0]]'),(3,'9003','VIP三号厅','[[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0]]');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `name` varchar(100) DEFAULT NULL,
  `age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`name`,`age`) values ('40岁开始学java',40),('dmc',19);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
