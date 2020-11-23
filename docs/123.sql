-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.5.4-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- sodamdb 데이터베이스 구조 내보내기
DROP DATABASE IF EXISTS `sodamdb`;
CREATE DATABASE IF NOT EXISTS `sodamdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sodamdb`;

-- 테이블 sodamdb.tmk_basket 구조 내보내기
DROP TABLE IF EXISTS `tmk_basket`;
CREATE TABLE IF NOT EXISTS `tmk_basket` (
  `bno` int(11) NOT NULL AUTO_INCREMENT COMMENT '장바구니 번호',
  `uno` int(11) NOT NULL COMMENT '사용자번호',
  `pno` int(11) NOT NULL COMMENT '상품 번호',
  `bcnt` int(11) NOT NULL COMMENT '상품수량',
  `bcdt` date NOT NULL COMMENT '생성일',
  PRIMARY KEY (`bno`),
  KEY `FK_tmk_user_TO_tmk_basket` (`uno`),
  KEY `FK_tmk_product_TO_tmk_basket` (`pno`),
  CONSTRAINT `FK_tmk_product_TO_tmk_basket` FOREIGN KEY (`pno`) REFERENCES `tmk_product` (`pno`),
  CONSTRAINT `FK_tmk_user_TO_tmk_basket` FOREIGN KEY (`uno`) REFERENCES `tmk_user` (`uno`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='장바구니';

-- 테이블 데이터 sodamdb.tmk_basket:~6 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_basket` DISABLE KEYS */;
INSERT INTO `tmk_basket` (`bno`, `uno`, `pno`, `bcnt`, `bcdt`) VALUES
	(1, 1, 2, 3, '2020-11-18'),
	(2, 1, 1, 12, '2020-11-18'),
	(3, 2, 3, 2, '2020-11-18'),
	(4, 7, 3, 15, '2020-11-18'),
	(5, 10, 17, 9, '2020-11-18'),
	(6, 10, 18, 3, '2020-11-18');
/*!40000 ALTER TABLE `tmk_basket` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_category 구조 내보내기
DROP TABLE IF EXISTS `tmk_category`;
CREATE TABLE IF NOT EXISTS `tmk_category` (
  `sno` int(11) NOT NULL COMMENT '가게 번호',
  `ctno` int(11) NOT NULL COMMENT '카테고리번호',
  PRIMARY KEY (`sno`,`ctno`),
  KEY `FK_tmk_category_list_TO_tmk_category` (`ctno`),
  CONSTRAINT `FK_tmk_category_list_TO_tmk_category` FOREIGN KEY (`ctno`) REFERENCES `tmk_category_list` (`ctno`),
  CONSTRAINT `FK_tmk_store_info_TO_tmk_category` FOREIGN KEY (`sno`) REFERENCES `tmk_store_info` (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='카테고리';

-- 테이블 데이터 sodamdb.tmk_category:~9 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_category` DISABLE KEYS */;
INSERT INTO `tmk_category` (`sno`, `ctno`) VALUES
	(1, 1),
	(1, 2),
	(2, 3),
	(3, 1),
	(4, 5),
	(5, 4),
	(6, 6),
	(7, 1),
	(7, 2);
/*!40000 ALTER TABLE `tmk_category` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_category_list 구조 내보내기
DROP TABLE IF EXISTS `tmk_category_list`;
CREATE TABLE IF NOT EXISTS `tmk_category_list` (
  `ctno` int(11) NOT NULL AUTO_INCREMENT COMMENT '카테고리번호',
  `ctname` varchar(50) NOT NULL COMMENT '카테고리명',
  PRIMARY KEY (`ctno`),
  UNIQUE KEY `UIX_tmk_category_list` (`ctname`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='관리자_카테고리';

-- 테이블 데이터 sodamdb.tmk_category_list:~6 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_category_list` DISABLE KEYS */;
INSERT INTO `tmk_category_list` (`ctno`, `ctname`) VALUES
	(2, '과일'),
	(6, '국/반찬/메인요리'),
	(5, '빵/떡/간식'),
	(3, '정육/계란'),
	(1, '채소'),
	(4, '해산물');
/*!40000 ALTER TABLE `tmk_category_list` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_discount 구조 내보내기
DROP TABLE IF EXISTS `tmk_discount`;
CREATE TABLE IF NOT EXISTS `tmk_discount` (
  `cuno` int(11) NOT NULL AUTO_INCREMENT COMMENT '쿠폰번호',
  `cuname` varchar(50) NOT NULL COMMENT '쿠폰명',
  `cuprice` int(11) NOT NULL COMMENT '할인금액',
  `cuexp` date NOT NULL COMMENT '유효기간',
  `cuint` varchar(255) NOT NULL COMMENT '쿠폰설명',
  PRIMARY KEY (`cuno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='할인쿠폰';

-- 테이블 데이터 sodamdb.tmk_discount:~5 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_discount` DISABLE KEYS */;
INSERT INTO `tmk_discount` (`cuno`, `cuname`, `cuprice`, `cuexp`, `cuint`) VALUES
	(1, '신규가입쿠폰', 3000, '2020-11-18', '신규가입축하 쿠폰입니다.'),
	(2, '개업기념쿠폰', 5000, '2020-11-18', '개업기념'),
	(3, '명절기념쿠폰', 1000, '2020-11-18', '새해복 많이 받으세요'),
	(4, '가정의달쿠폰', 500, '2020-11-18', '가정에 충실하세요'),
	(5, '미적용', 0, '2020-11-18', '쿠폰미적용');
/*!40000 ALTER TABLE `tmk_discount` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_mtm 구조 내보내기
DROP TABLE IF EXISTS `tmk_mtm`;
CREATE TABLE IF NOT EXISTS `tmk_mtm` (
  `qno` int(11) NOT NULL AUTO_INCREMENT COMMENT '문의 번호',
  `uno` int(11) NOT NULL COMMENT '사용자번호',
  `title` varchar(50) NOT NULL COMMENT '제목',
  `content` mediumtext NOT NULL COMMENT '내용',
  `COL` date NOT NULL COMMENT '등록일',
  `qtype` int(11) NOT NULL COMMENT '문의유형',
  `qstatus` int(11) NOT NULL COMMENT '처리상태',
  PRIMARY KEY (`qno`),
  UNIQUE KEY `UIX_tmk_mtm` (`uno`),
  CONSTRAINT `FK_tmk_user_TO_tmk_mtm` FOREIGN KEY (`uno`) REFERENCES `tmk_user` (`uno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='1:1문의\r\n\r\n처리상태\r\n- 0 : 처리전\r\n- 1 : 처리완료\r\n\r\n문의유형\r\n- 0 : 배송\r\n- 1 : 포인트\r\n- 2 : 결제/환불\r\n- 3 : 쿠폰\r\n- 4 : 상품문의\r\n- 5 : 기타';

-- 테이블 데이터 sodamdb.tmk_mtm:~3 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_mtm` DISABLE KEYS */;
INSERT INTO `tmk_mtm` (`qno`, `uno`, `title`, `content`, `COL`, `qtype`, `qstatus`) VALUES
	(1, 1, '문의사항있습니다', '문의입니다', '2020-11-18', 1, 0),
	(2, 10, '음식이 상한거같아요', '방금 구입한 빵 상한거같아요', '2020-11-18', 4, 0),
	(3, 8, '반찬이 상한거같아요', '반찬 맛이 이상해요', '2020-11-18', 4, 1);
/*!40000 ALTER TABLE `tmk_mtm` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_my_counpon 구조 내보내기
DROP TABLE IF EXISTS `tmk_my_counpon`;
CREATE TABLE IF NOT EXISTS `tmk_my_counpon` (
  `mcuno` int(11) NOT NULL AUTO_INCREMENT COMMENT '할인쿠폰번호',
  `uno` int(11) NOT NULL COMMENT '사용자번호',
  `cuno` int(11) NOT NULL COMMENT '쿠폰번호',
  `mcudt` date NOT NULL COMMENT '발급일',
  `mcu_status` int(11) DEFAULT NULL COMMENT '사용여부',
  PRIMARY KEY (`mcuno`),
  KEY `FK_tmk_user_TO_tmk_my_counpon` (`uno`),
  KEY `FK_tmk_discount_TO_tmk_my_counpon` (`cuno`),
  CONSTRAINT `FK_tmk_discount_TO_tmk_my_counpon` FOREIGN KEY (`cuno`) REFERENCES `tmk_discount` (`cuno`),
  CONSTRAINT `FK_tmk_user_TO_tmk_my_counpon` FOREIGN KEY (`uno`) REFERENCES `tmk_user` (`uno`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='할인쿠폰발급\r\n\r\n사용여부\r\n- 0 : 사용후\r\n- 1 : 사용전';

-- 테이블 데이터 sodamdb.tmk_my_counpon:~6 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_my_counpon` DISABLE KEYS */;
INSERT INTO `tmk_my_counpon` (`mcuno`, `uno`, `cuno`, `mcudt`, `mcu_status`) VALUES
	(1, 1, 1, '2020-11-18', 1),
	(2, 7, 3, '2020-11-18', 1),
	(3, 10, 4, '2020-11-18', 1),
	(4, 9, 2, '2020-11-18', 0),
	(5, 5, 1, '2020-11-18', 1),
	(6, 6, 2, '2020-11-18', 1);
/*!40000 ALTER TABLE `tmk_my_counpon` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_notice 구조 내보내기
DROP TABLE IF EXISTS `tmk_notice`;
CREATE TABLE IF NOT EXISTS `tmk_notice` (
  `nno` int(11) NOT NULL AUTO_INCREMENT COMMENT '공지번호',
  `ntitle` varchar(50) NOT NULL COMMENT '제목',
  `ncontent` mediumtext NOT NULL COMMENT '내용',
  `ndate` date NOT NULL COMMENT '등록일',
  `nv_cnt` int(11) DEFAULT NULL COMMENT '조회수',
  PRIMARY KEY (`nno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='공지사항';

-- 테이블 데이터 sodamdb.tmk_notice:~3 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_notice` DISABLE KEYS */;
INSERT INTO `tmk_notice` (`nno`, `ntitle`, `ncontent`, `ndate`, `nv_cnt`) VALUES
	(1, '긴급공지입니다.', '긴급입니다', '2020-11-18', NULL),
	(2, '사장님이 미쳤어요', '할인 이벤트 합니다', '2020-11-18', NULL),
	(3, '긴급점검 공지', '금일 10시부터 익일 10시까지 점검합니다', '2020-11-18', NULL);
/*!40000 ALTER TABLE `tmk_notice` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_order 구조 내보내기
DROP TABLE IF EXISTS `tmk_order`;
CREATE TABLE IF NOT EXISTS `tmk_order` (
  `ono` int(11) NOT NULL AUTO_INCREMENT COMMENT '주문 번호',
  `uno` int(11) NOT NULL COMMENT '사용자번호',
  `odt` date NOT NULL COMMENT '주문일',
  `request` varchar(255) DEFAULT NULL COMMENT '요청사항',
  `dcmp` varchar(50) DEFAULT NULL COMMENT '배송사',
  `tran_no` varchar(255) DEFAULT NULL COMMENT '운송장번호',
  `dstatus` int(11) NOT NULL COMMENT '배송상태',
  PRIMARY KEY (`ono`),
  KEY `FK_tmk_user_TO_tmk_order` (`uno`),
  CONSTRAINT `FK_tmk_user_TO_tmk_order` FOREIGN KEY (`uno`) REFERENCES `tmk_user` (`uno`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='주문';

-- 테이블 데이터 sodamdb.tmk_order:~4 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_order` DISABLE KEYS */;
INSERT INTO `tmk_order` (`ono`, `uno`, `odt`, `request`, `dcmp`, `tran_no`, `dstatus`) VALUES
	(1, 5, '2020-11-18', NULL, '한진택배', NULL, 0),
	(2, 9, '2020-11-18', NULL, '우체국', NULL, 0),
	(3, 6, '2020-11-18', NULL, '대한통운', NULL, 0),
	(4, 10, '2020-11-18', NULL, '로젠택배', NULL, 0);
/*!40000 ALTER TABLE `tmk_order` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_order_product 구조 내보내기
DROP TABLE IF EXISTS `tmk_order_product`;
CREATE TABLE IF NOT EXISTS `tmk_order_product` (
  `ono` int(11) NOT NULL COMMENT '주문 번호',
  `pno` int(11) NOT NULL COMMENT '상품 번호',
  `price` int(11) NOT NULL COMMENT '가격(개별)',
  `op_cnt` int(11) NOT NULL COMMENT '수량',
  PRIMARY KEY (`ono`,`pno`),
  KEY `FK_tmk_product_TO_tmk_order_product` (`pno`),
  CONSTRAINT `FK_tmk_order_TO_tmk_order_product` FOREIGN KEY (`ono`) REFERENCES `tmk_order` (`ono`),
  CONSTRAINT `FK_tmk_product_TO_tmk_order_product` FOREIGN KEY (`pno`) REFERENCES `tmk_product` (`pno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='주문항목';

-- 테이블 데이터 sodamdb.tmk_order_product:~8 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_order_product` DISABLE KEYS */;
INSERT INTO `tmk_order_product` (`ono`, `pno`, `price`, `op_cnt`) VALUES
	(1, 1, 3000, 1),
	(1, 14, 20000, 1),
	(2, 12, 5000, 2),
	(2, 20, 18000, 1),
	(3, 3, 12000, 3),
	(3, 5, 2000, 5),
	(4, 15, 15000, 2),
	(4, 18, 5000, 3);
/*!40000 ALTER TABLE `tmk_order_product` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_payment 구조 내보내기
DROP TABLE IF EXISTS `tmk_payment`;
CREATE TABLE IF NOT EXISTS `tmk_payment` (
  `pmno` int(11) NOT NULL AUTO_INCREMENT COMMENT '결제수단번호',
  `pmname` varchar(50) NOT NULL COMMENT '결제수단명',
  PRIMARY KEY (`pmno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='결제수단';

-- 테이블 데이터 sodamdb.tmk_payment:~3 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_payment` DISABLE KEYS */;
INSERT INTO `tmk_payment` (`pmno`, `pmname`) VALUES
	(1, '카카오페이'),
	(2, '네이버페이'),
	(3, '휴대폰');
/*!40000 ALTER TABLE `tmk_payment` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_pay_info 구조 내보내기
DROP TABLE IF EXISTS `tmk_pay_info`;
CREATE TABLE IF NOT EXISTS `tmk_pay_info` (
  `ono` int(11) NOT NULL COMMENT '주문 번호',
  `pmno` int(11) NOT NULL COMMENT '결제수단번호',
  `mcuno` int(11) DEFAULT NULL COMMENT '할인쿠폰번호',
  `tprice` int(11) NOT NULL COMMENT '총상품금액',
  `dis_price` int(11) NOT NULL COMMENT '할인금액',
  `lst_price` int(11) NOT NULL COMMENT '최종결제금액',
  `dprice` int(11) NOT NULL COMMENT '배송비',
  `pdt` date NOT NULL COMMENT '결제일',
  PRIMARY KEY (`ono`),
  UNIQUE KEY `UIX_tmk_pay_info` (`ono`),
  UNIQUE KEY `UIX_tmk_pay_info2` (`mcuno`),
  KEY `FK_tmk_payment_TO_tmk_pay_info` (`pmno`),
  CONSTRAINT `FK_tmk_my_counpon_TO_tmk_pay_info` FOREIGN KEY (`mcuno`) REFERENCES `tmk_my_counpon` (`mcuno`),
  CONSTRAINT `FK_tmk_order_TO_tmk_pay_info` FOREIGN KEY (`ono`) REFERENCES `tmk_order` (`ono`),
  CONSTRAINT `FK_tmk_payment_TO_tmk_pay_info` FOREIGN KEY (`pmno`) REFERENCES `tmk_payment` (`pmno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='결제';

-- 테이블 데이터 sodamdb.tmk_pay_info:~3 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_pay_info` DISABLE KEYS */;
INSERT INTO `tmk_pay_info` (`ono`, `pmno`, `mcuno`, `tprice`, `dis_price`, `lst_price`, `dprice`, `pdt`) VALUES
	(1, 1, 1, 23000, 3000, 22500, 2500, '2020-11-18'),
	(2, 2, NULL, 28000, 0, 30500, 2500, '2020-11-18'),
	(3, 3, 2, 46000, 5000, 43500, 2500, '2020-11-18');
/*!40000 ALTER TABLE `tmk_pay_info` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_product 구조 내보내기
DROP TABLE IF EXISTS `tmk_product`;
CREATE TABLE IF NOT EXISTS `tmk_product` (
  `pno` int(11) NOT NULL AUTO_INCREMENT COMMENT '상품 번호',
  `sno` int(11) NOT NULL COMMENT '가게 번호',
  `pname` varchar(50) NOT NULL COMMENT '상품명',
  `price` int(11) NOT NULL COMMENT '가격',
  `stock` int(11) NOT NULL COMMENT '재고여부',
  `photo` varchar(255) DEFAULT NULL COMMENT '사진',
  `pint` mediumtext DEFAULT NULL COMMENT '상품소개',
  `pcdt` date NOT NULL COMMENT '생성일',
  PRIMARY KEY (`pno`),
  KEY `FK_tmk_store_info_TO_tmk_product` (`sno`),
  CONSTRAINT `FK_tmk_store_info_TO_tmk_product` FOREIGN KEY (`sno`) REFERENCES `tmk_store_info` (`sno`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='상품';

-- 테이블 데이터 sodamdb.tmk_product:~21 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_product` DISABLE KEYS */;
INSERT INTO `tmk_product` (`pno`, `sno`, `pname`, `price`, `stock`, `photo`, `pint`, `pcdt`) VALUES
	(1, 1, '시금치', 3000, 1, NULL, '신선합니다', '2020-11-18'),
	(2, 1, '사과', 1500, 1, NULL, '빨갛습니다', '2020-11-18'),
	(3, 2, '말고기', 12000, 1, NULL, '어제 잡았습니다', '2020-11-18'),
	(4, 2, '소고기', 9000, 1, NULL, '신선합니다', '2020-11-18'),
	(5, 3, '비트', 2000, 1, 'https://media.mercola.com/imageserver/public/2019/february/beets-health-benefits-saag.jpg', '비트비트', '2020-11-18'),
	(6, 3, '샐러리', 1500, 1, NULL, '샐러드 재료', '2020-11-18'),
	(7, 4, '소보루빵', 2500, 1, NULL, '소보루', '2020-11-18'),
	(8, 4, '앙버터빵', 4500, 1, NULL, '앙버터', '2020-11-18'),
	(9, 5, '가물치', 20000, 1, 'https://blog.kakaocdn.net/dn/WKjTQ/btqx1fjxT3h/jS8NEbcqdzhgVjsqcHa4Gk/img.jpg', '가물가물치', '2020-11-18'),
	(10, 5, '전복', 5000, 1, NULL, '진주전복', '2020-11-18'),
	(11, 6, '김치', 20000, 1, NULL, '배추김치', '2020-11-18'),
	(12, 6, '계란말이', 5000, 1, NULL, '유기농 계란 사용', '2020-11-18'),
	(13, 6, '장조림', 7000, 1, NULL, '한우 장조림', '2020-11-18'),
	(14, 7, '레드향1박스', 20000, 1, NULL, '품질좋은 레드향', '2020-11-18'),
	(15, 7, '샤인머스켓', 15000, 1, NULL, '당도 최고 보장', '2020-11-18'),
	(16, 7, '골드키위', 7000, 1, NULL, '골드색 보장', '2020-11-18'),
	(17, 2, '이베리코 목살', 27000, 1, NULL, '국산 이베리코 직수입', '2020-11-18'),
	(18, 4, '크로플', 5000, 1, NULL, '크로와상 + 와플 압축', '2020-11-18'),
	(19, 5, '광어', 12000, 1, NULL, '요청시 회떠드립니다', '2020-11-18'),
	(20, 5, '감성돔', 18000, 1, NULL, '감성보장', '2020-11-18'),
	(21, 1, '대파', 2000, 1, NULL, '큰파', '2020-11-18');
/*!40000 ALTER TABLE `tmk_product` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_refund 구조 내보내기
DROP TABLE IF EXISTS `tmk_refund`;
CREATE TABLE IF NOT EXISTS `tmk_refund` (
  `ono` int(11) NOT NULL COMMENT '주문 번호',
  `ref_reason` mediumtext NOT NULL COMMENT '환불사유',
  `ref_date` date NOT NULL COMMENT '처리일',
  `ref_status` int(11) NOT NULL COMMENT '처리상태',
  PRIMARY KEY (`ono`),
  CONSTRAINT `FK_tmk_pay_info_TO_tmk_refund` FOREIGN KEY (`ono`) REFERENCES `tmk_pay_info` (`ono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='환불\r\n\r\n처리상태\r\n- 0 : 처리전\r\n- 1 : 처리완료';

-- 테이블 데이터 sodamdb.tmk_refund:~1 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_refund` DISABLE KEYS */;
INSERT INTO `tmk_refund` (`ono`, `ref_reason`, `ref_date`, `ref_status`) VALUES
	(1, '단순변심', '2020-11-18', 0),
	(2, '유통기한이 지남', '2020-11-18', 0);
/*!40000 ALTER TABLE `tmk_refund` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_review 구조 내보내기
DROP TABLE IF EXISTS `tmk_review`;
CREATE TABLE IF NOT EXISTS `tmk_review` (
  `rno` int(11) NOT NULL AUTO_INCREMENT COMMENT '리뷰번호',
  `sno` int(11) NOT NULL COMMENT '가게 번호',
  `uno` int(11) NOT NULL COMMENT '사용자번호',
  `rcontent` mediumtext NOT NULL COMMENT '내용',
  `rscore` int(11) NOT NULL COMMENT '가게평가점수',
  `cdt` date NOT NULL COMMENT '등록일',
  PRIMARY KEY (`rno`),
  KEY `FK_tmk_store_info_TO_tmk_review` (`sno`),
  KEY `FK_tmk_user_TO_tmk_review` (`uno`),
  CONSTRAINT `FK_tmk_store_info_TO_tmk_review` FOREIGN KEY (`sno`) REFERENCES `tmk_store_info` (`sno`),
  CONSTRAINT `FK_tmk_user_TO_tmk_review` FOREIGN KEY (`uno`) REFERENCES `tmk_user` (`uno`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='리뷰';

-- 테이블 데이터 sodamdb.tmk_review:~7 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_review` DISABLE KEYS */;
INSERT INTO `tmk_review` (`rno`, `sno`, `uno`, `rcontent`, `rscore`, `cdt`) VALUES
	(1, 1, 1, '만족합니다', 5, '2020-11-18'),
	(2, 5, 10, '신선합니다', 4, '2020-11-18'),
	(3, 4, 4, '상했어요', 1, '2020-11-18'),
	(4, 2, 8, '말고기 싫어요', 2, '2020-11-18'),
	(5, 3, 7, '채소 싫어요', 1, '2020-11-18'),
	(6, 6, 3, '엄마가 해준 맛이에요', 5, '2020-11-18'),
	(7, 7, 2, '제가 생각한 레드향이 아니에요', 2, '2020-11-18');
/*!40000 ALTER TABLE `tmk_review` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_rgb 구조 내보내기
DROP TABLE IF EXISTS `tmk_rgb`;
CREATE TABLE IF NOT EXISTS `tmk_rgb` (
  `uno` int(11) NOT NULL COMMENT '사용자번호',
  `rno` int(11) NOT NULL COMMENT '리뷰번호',
  `rtype` int(11) DEFAULT NULL COMMENT '평가유형',
  `rcdt` date NOT NULL COMMENT '생성일',
  PRIMARY KEY (`uno`,`rno`),
  KEY `FK_tmk_review_TO_tmk_rgb` (`rno`),
  CONSTRAINT `FK_tmk_review_TO_tmk_rgb` FOREIGN KEY (`rno`) REFERENCES `tmk_review` (`rno`),
  CONSTRAINT `FK_tmk_user_TO_tmk_rgb` FOREIGN KEY (`uno`) REFERENCES `tmk_user` (`uno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='리뷰평가';

-- 테이블 데이터 sodamdb.tmk_rgb:~4 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_rgb` DISABLE KEYS */;
INSERT INTO `tmk_rgb` (`uno`, `rno`, `rtype`, `rcdt`) VALUES
	(5, 1, 1, '2020-11-18'),
	(7, 4, 1, '2020-11-18'),
	(8, 6, 0, '2020-11-18'),
	(10, 3, 0, '2020-11-18');
/*!40000 ALTER TABLE `tmk_rgb` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_sc 구조 내보내기
DROP TABLE IF EXISTS `tmk_sc`;
CREATE TABLE IF NOT EXISTS `tmk_sc` (
  `scno` int(11) NOT NULL AUTO_INCREMENT COMMENT '게시글 번호',
  `sctype` int(11) NOT NULL COMMENT '문의유형',
  `sctitle` varchar(50) NOT NULL COMMENT '제목',
  `sccontent` mediumtext NOT NULL COMMENT '내용',
  PRIMARY KEY (`scno`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='고객센터\r\n\r\n문의유형\r\n- 0 : 구입문의\r\n- 1 : 판매문의\r\n- 2 : 계정문의';

-- 테이블 데이터 sodamdb.tmk_sc:~2 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_sc` DISABLE KEYS */;
INSERT INTO `tmk_sc` (`scno`, `sctype`, `sctitle`, `sccontent`) VALUES
	(1, 0, '환불이 하고싶어요', '환불 가능합니다.'),
	(2, 1, '상품 등록이 안돼요', '상품 등록이 안됩니다.'),
	(3, 0, '쿠폰 적용이 안돼요', '쿠폰 적용이 안됩니다.');
/*!40000 ALTER TABLE `tmk_sc` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_store_info 구조 내보내기
DROP TABLE IF EXISTS `tmk_store_info`;
CREATE TABLE IF NOT EXISTS `tmk_store_info` (
  `sno` int(11) NOT NULL AUTO_INCREMENT COMMENT '가게 번호',
  `uno` int(11) NOT NULL COMMENT '사용자번호',
  `sname` varchar(50) NOT NULL COMMENT '상호명',
  `sint` mediumtext DEFAULT NULL COMMENT '가게소개',
  `spst` varchar(6) DEFAULT NULL COMMENT '우편번호',
  `saddr` varchar(255) DEFAULT NULL COMMENT '기본주소',
  `s_det_addr` varchar(255) DEFAULT NULL COMMENT '상세주소',
  `dyesno` int(11) NOT NULL COMMENT '배송여부',
  `sphoto` varchar(255) DEFAULT NULL COMMENT '가게사진',
  `edt` datetime DEFAULT NULL COMMENT '종료 영업시간',
  `sdt` datetime DEFAULT NULL COMMENT '시작 영업시간',
  `scdt` date NOT NULL COMMENT '생성일',
  PRIMARY KEY (`sno`),
  KEY `FK_tmk_user_TO_tmk_store_info` (`uno`),
  CONSTRAINT `FK_tmk_user_TO_tmk_store_info` FOREIGN KEY (`uno`) REFERENCES `tmk_user` (`uno`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='가게\r\n\r\n배송여부\r\n- 0 : 안됨\r\n- 1 : 됨';

-- 테이블 데이터 sodamdb.tmk_store_info:~7 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_store_info` DISABLE KEYS */;
INSERT INTO `tmk_store_info` (`sno`, `uno`, `sname`, `sint`, `spst`, `saddr`, `s_det_addr`, `dyesno`, `sphoto`, `edt`, `sdt`, `scdt`) VALUES
	(1, 2, '소담청과', '안녕하세요 소담청과입니다.', '1111', '서울시', '강남대로 9길', 1, NULL, '2020-11-18 14:56:20', '2020-11-18 14:56:21', '2020-11-18'),
	(2, 6, '임꺽정말고기', '안녕하세요 말고기 전문점입니다.', '2222', '충주시', '충주대로', 1, NULL, '2020-11-18 15:28:33', '2020-11-18 15:28:33', '2020-11-18'),
	(3, 2, '비트채소가게', '안녕하세요 ', '3333', '서울시', '논현동', 1, NULL, '2020-11-18 15:51:05', '2020-11-18 15:51:06', '2020-11-18'),
	(4, 8, '내일은제빵왕', '안녕하세용 빵전문 빵집입니다', '2323', '서울시', '서울로', 1, 'https://newsimg.hankookilbo.com/2019/06/13/201906131771312569_8.jpg', '2020-11-18 15:57:47', '2020-11-18 15:57:47', '2020-11-18'),
	(5, 7, '가물가물치', '안녕하세요 가물치 전문점입니다', '2222', '서울시', '경복궁로', 1, NULL, '2020-11-18 15:59:20', '2020-11-18 15:59:21', '2020-11-18'),
	(6, 10, '이혜정 반찬 전문점', '얼마나 맛있게요', '5555', '인천광역시', '인천로', 1, NULL, '2020-11-18 16:00:07', '2020-11-18 16:00:08', '2020-11-18'),
	(7, 9, '청춘청과', '청춘이다', '1111', '전주', '청춘대로', 1, NULL, '2020-11-18 16:00:54', '2020-11-18 16:00:54', '2020-11-18');
/*!40000 ALTER TABLE `tmk_store_info` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_user 구조 내보내기
DROP TABLE IF EXISTS `tmk_user`;
CREATE TABLE IF NOT EXISTS `tmk_user` (
  `uno` int(11) NOT NULL AUTO_INCREMENT COMMENT '사용자번호',
  `name` varchar(50) NOT NULL COMMENT '이름',
  `email` varchar(40) NOT NULL COMMENT '이메일',
  `pwd` varchar(50) NOT NULL COMMENT '비밀번호',
  `pst` varchar(6) DEFAULT NULL COMMENT '우편번호',
  `addr` varchar(255) DEFAULT NULL COMMENT '기본주소',
  `det_addr` varchar(255) DEFAULT NULL COMMENT '상세주소',
  `tel` varchar(30) DEFAULT NULL COMMENT '전화번호',
  `birth` varchar(8) DEFAULT NULL COMMENT '생일',
  `status` int(11) NOT NULL COMMENT '계정상태',
  `auth` int(11) NOT NULL COMMENT '권한',
  `uphoto` varchar(255) DEFAULT NULL COMMENT '사진',
  `rdt` date NOT NULL COMMENT '가입일',
  PRIMARY KEY (`uno`),
  UNIQUE KEY `UIX_tmk_user` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='사용자';

-- 테이블 데이터 sodamdb.tmk_user:~10 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_user` DISABLE KEYS */;
INSERT INTO `tmk_user` (`uno`, `name`, `email`, `pwd`, `pst`, `addr`, `det_addr`, `tel`, `birth`, `status`, `auth`, `uphoto`, `rdt`) VALUES
	(1, '권구현', 'test123@gmail.com', '1', '1111', '화성시', '동탄대로28길', '010-2222-2222', '950130', 1, 1, NULL, '2020-11-18'),
	(2, '이성권', 'test223@gmail.com', '1', '1111', '오산시', '주공3단지', '010-2222-2222', '950130', 1, 2, NULL, '2020-11-18'),
	(3, '이재현', 'test333@gmail.com', '1', '1111', '수원시', '광교산', '010-2222-2222', '950130', 1, 6, NULL, '2020-11-18'),
	(4, '김성태', 'test444@gmail.com', '1', '1111', '서울시', '서초구', '010-2222-2222', '950130', 1, 9, NULL, '2020-11-18'),
	(5, '홍길동', 'hong123@gmail.com', '1', '1111', '강원도', '철원', '010-4445-3352', '870220', 1, 1, NULL, '2020-11-18'),
	(6, '임꺽정', 'em123@gmail.com', '1', '2323', '충주시', '충주대로', '010-222-3232', '710203', 1, 2, NULL, '2020-11-18'),
	(7, '김생선', 'fish123@asda.com', '1', '232', '포항시', '서해', '010-2222-3333', '990101', 1, 2, NULL, '2020-11-18'),
	(8, '김탁구', 'kimtak9@naver.com', '1', '2222', '서울시', '동작구', '010-2222-1111', '770101', 1, 2, NULL, '2020-11-18'),
	(9, '이청춘', 'chung222@naddd.com', '1', '32323', '청주', '청춘대로', '010-6776-3333', '880101', 1, 2, NULL, '2020-11-18'),
	(10, '빅마마', 'mama123@gggg.com', '1', '2222', '전주시', '전주로', '010-6566-6666', '870101', 1, 2, NULL, '2020-11-18');
/*!40000 ALTER TABLE `tmk_user` ENABLE KEYS */;

-- 테이블 sodamdb.tmk_wishlist 구조 내보내기
DROP TABLE IF EXISTS `tmk_wishlist`;
CREATE TABLE IF NOT EXISTS `tmk_wishlist` (
  `uno` int(11) NOT NULL COMMENT '사용자번호',
  `pno` int(11) NOT NULL COMMENT '상품 번호',
  `wcdt` date NOT NULL COMMENT '생성일',
  PRIMARY KEY (`uno`,`pno`),
  KEY `FK_tmk_product_TO_tmk_wishlist` (`pno`),
  CONSTRAINT `FK_tmk_product_TO_tmk_wishlist` FOREIGN KEY (`pno`) REFERENCES `tmk_product` (`pno`),
  CONSTRAINT `FK_tmk_user_TO_tmk_wishlist` FOREIGN KEY (`uno`) REFERENCES `tmk_user` (`uno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='상품찜';

-- 테이블 데이터 sodamdb.tmk_wishlist:~2 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tmk_wishlist` DISABLE KEYS */;
INSERT INTO `tmk_wishlist` (`uno`, `pno`, `wcdt`) VALUES
	(1, 1, '2020-11-18'),
	(2, 4, '2020-11-18'),
	(4, 1, '2020-11-18'),
	(4, 19, '2020-11-18'),
	(5, 11, '2020-11-18'),
	(7, 3, '2020-11-18'),
	(10, 12, '2020-11-18'),
	(10, 16, '2020-11-18');
/*!40000 ALTER TABLE `tmk_wishlist` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
