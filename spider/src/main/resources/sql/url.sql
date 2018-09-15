/*
 Navicat Premium Data Transfer

 Source Server         : l1
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : my_example

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 15/09/2018 15:30:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for url
-- ----------------------------
DROP TABLE IF EXISTS `url`;
CREATE TABLE `url`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `level` int(11) NULL DEFAULT NULL,
  `create` datetime(6) NULL DEFAULT NULL,
  `update` datetime(6) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
