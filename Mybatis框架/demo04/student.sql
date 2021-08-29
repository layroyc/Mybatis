/*
 Navicat Premium Data Transfer

 Source Server         : wy
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : ssm2

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 24/05/2021 19:34:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'hh', '男', 1);
INSERT INTO `student` VALUES (2, 'bb', '男', 1);
INSERT INTO `student` VALUES (3, 'wq', '女', 1);
INSERT INTO `student` VALUES (4, 'tt', '女', 2);
INSERT INTO `student` VALUES (5, 'qq', '男', 2);
INSERT INTO `student` VALUES (6, 'cxk', '男', 1);
INSERT INTO `student` VALUES (7, 'wy', '男', 3);

SET FOREIGN_KEY_CHECKS = 1;
