/*
 Navicat Premium Data Transfer

 Source Server         : r
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 18/05/2021 20:27:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `upassword` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'root', 'root');
INSERT INTO `user` VALUES (2, 'admin', '123456');
INSERT INTO `user` VALUES (3, '小王', '123456');
INSERT INTO `user` VALUES (4, 'roy', '1108');
INSERT INTO `user` VALUES (5, '小源', '123456');
INSERT INTO `user` VALUES (6, 'wy', '123456');
INSERT INTO `user` VALUES (7, '小小', '123456');
INSERT INTO `user` VALUES (8, 'try', '123');
INSERT INTO `user` VALUES (9, 'yr', '456');
INSERT INTO `user` VALUES (10, '朗朗', '123456');

SET FOREIGN_KEY_CHECKS = 1;
