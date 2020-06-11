/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50648
Source Host           : 127.0.0.1:3306
Source Database       : lotto_security

Target Server Type    : MYSQL
Target Server Version : 50648
File Encoding         : 65001

Date: 2020-05-23 07:50:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(100) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` varchar(100) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `name` varchar(180) NOT NULL,
  `options` varchar(500) DEFAULT NULL,
  `level` int(2) NOT NULL DEFAULT '1',
  `status` int(2) NOT NULL DEFAULT '1',
  `sort` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '2020-05-23 04:26:59', null, null, null, null, '系统设置', null, '1', '1', '35');
INSERT INTO `sys_menu` VALUES ('2', '2020-05-23 04:27:22', null, null, null, '1', '用户管理', null, '2', '1', '0');
INSERT INTO `sys_menu` VALUES ('3', '2020-05-23 04:27:53', null, null, null, '1', '权限管理', null, '2', '1', '1');
INSERT INTO `sys_menu` VALUES ('4', '2020-05-23 04:28:09', null, null, null, '1', '菜单管理', null, '2', '1', '2');
INSERT INTO `sys_menu` VALUES ('5', '2020-05-23 04:28:35', null, null, null, '1', '资源管理', null, '2', '1', '3');
INSERT INTO `sys_menu` VALUES ('6', '2020-05-23 04:28:56', null, null, null, null, '商品中心', null, '1', '1', '0');
INSERT INTO `sys_menu` VALUES ('7', '2020-05-23 04:29:22', null, null, null, '6', '商品管理', null, '2', '1', '0');
INSERT INTO `sys_menu` VALUES ('8', '2020-05-23 04:29:50', null, null, null, null, '店铺中心', null, '1', '1', '10');
INSERT INTO `sys_menu` VALUES ('9', '2020-05-23 04:30:08', null, null, null, '8', '店铺管理', null, '2', '1', '0');
INSERT INTO `sys_menu` VALUES ('10', '2020-05-23 04:30:24', null, null, null, null, '会员中心', null, '1', '1', '15');
INSERT INTO `sys_menu` VALUES ('11', '2020-05-23 04:30:48', null, null, null, '10', '会员管理', null, '2', '1', '0');
INSERT INTO `sys_menu` VALUES ('12', '2020-05-23 04:31:01', null, null, null, null, '订单中心', null, '1', '1', '20');
INSERT INTO `sys_menu` VALUES ('13', '2020-05-23 04:31:17', null, null, null, '12', '订单管理', null, '2', '1', '0');
INSERT INTO `sys_menu` VALUES ('14', '2020-05-23 04:31:46', null, null, null, null, '运营中心', null, '1', '1', '25');
INSERT INTO `sys_menu` VALUES ('15', '2020-05-23 04:32:07', null, null, null, '14', '活动设置', null, '2', '1', '0');
INSERT INTO `sys_menu` VALUES ('16', '2020-05-23 04:32:52', null, null, null, '14', '优惠券设置', null, '2', '1', '1');
INSERT INTO `sys_menu` VALUES ('17', '2020-05-23 04:34:35', null, null, null, null, '内容中心', null, '1', '1', '30');
INSERT INTO `sys_menu` VALUES ('18', '2020-05-23 04:35:16', null, null, null, '17', 'BANNER管理', null, '2', '1', '0');
INSERT INTO `sys_menu` VALUES ('19', '2020-05-23 04:36:27', null, null, null, null, '品牌中心', null, '1', '1', '5');
INSERT INTO `sys_menu` VALUES ('20', '2020-05-23 04:36:38', null, null, null, '19', '品牌管理', null, '2', '1', '0');

-- ----------------------------
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(100) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` varchar(100) DEFAULT NULL,
  `name` varchar(180) NOT NULL,
  `url` varchar(180) NOT NULL,
  `status` int(2) NOT NULL DEFAULT '1',
  `sort` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resource
-- ----------------------------
INSERT INTO `sys_resource` VALUES ('1', '2020-05-23 06:21:51', null, null, null, '加载菜单树', '/api/load/menus', '1', '1');
INSERT INTO `sys_resource` VALUES ('2', '2020-05-23 06:25:43', null, null, null, '首页数据', '/api/hello', '1', '0');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(100) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` varchar(100) DEFAULT NULL,
  `code` varchar(180) NOT NULL,
  `name` varchar(180) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '2020-05-23 04:02:20', null, null, null, 'ADMIN', '管理员');
INSERT INTO `sys_role` VALUES ('2', '2020-05-23 04:02:36', null, null, null, 'OM', '运营经理');
INSERT INTO `sys_role` VALUES ('3', '2020-05-23 04:03:34', null, null, null, 'PM', '产品经理');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(100) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` varchar(100) DEFAULT NULL,
  `role_id` bigint(20) NOT NULL,
  `menu_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_rid_mid` (`role_id`,`menu_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1', '2020-05-23 04:41:58', null, null, null, '1', '1');
INSERT INTO `sys_role_menu` VALUES ('2', '2020-05-23 04:42:08', null, null, null, '1', '2');
INSERT INTO `sys_role_menu` VALUES ('3', '2020-05-23 04:42:14', null, null, null, '1', '3');
INSERT INTO `sys_role_menu` VALUES ('4', '2020-05-23 04:42:19', null, null, null, '1', '4');
INSERT INTO `sys_role_menu` VALUES ('5', '2020-05-23 04:42:23', null, null, null, '1', '5');
INSERT INTO `sys_role_menu` VALUES ('6', '2020-05-23 04:42:31', null, null, null, '1', '6');
INSERT INTO `sys_role_menu` VALUES ('7', '2020-05-23 04:42:36', null, null, null, '1', '7');
INSERT INTO `sys_role_menu` VALUES ('8', '2020-05-23 04:42:45', null, null, null, '1', '8');
INSERT INTO `sys_role_menu` VALUES ('9', '2020-05-23 04:42:51', null, null, null, '1', '9');
INSERT INTO `sys_role_menu` VALUES ('10', '2020-05-23 04:43:18', null, null, null, '1', '10');
INSERT INTO `sys_role_menu` VALUES ('11', '2020-05-23 04:41:58', null, null, null, '1', '11');
INSERT INTO `sys_role_menu` VALUES ('12', '2020-05-23 04:42:08', null, null, null, '1', '12');
INSERT INTO `sys_role_menu` VALUES ('13', '2020-05-23 04:42:14', null, null, null, '1', '13');
INSERT INTO `sys_role_menu` VALUES ('14', '2020-05-23 04:42:19', null, null, null, '1', '14');
INSERT INTO `sys_role_menu` VALUES ('15', '2020-05-23 04:42:23', null, null, null, '1', '15');
INSERT INTO `sys_role_menu` VALUES ('16', '2020-05-23 04:42:31', null, null, null, '1', '16');
INSERT INTO `sys_role_menu` VALUES ('17', '2020-05-23 04:42:36', null, null, null, '1', '17');
INSERT INTO `sys_role_menu` VALUES ('18', '2020-05-23 04:42:45', null, null, null, '1', '18');
INSERT INTO `sys_role_menu` VALUES ('19', '2020-05-23 04:42:51', null, null, null, '1', '19');
INSERT INTO `sys_role_menu` VALUES ('20', '2020-05-23 04:43:18', null, null, null, '1', '20');
INSERT INTO `sys_role_menu` VALUES ('21', '2020-05-23 04:42:31', null, null, null, '2', '6');
INSERT INTO `sys_role_menu` VALUES ('22', '2020-05-23 04:42:36', null, null, null, '2', '7');
INSERT INTO `sys_role_menu` VALUES ('23', '2020-05-23 04:42:45', null, null, null, '2', '8');
INSERT INTO `sys_role_menu` VALUES ('24', '2020-05-23 04:42:51', null, null, null, '2', '9');
INSERT INTO `sys_role_menu` VALUES ('25', '2020-05-23 04:43:18', null, null, null, '2', '10');
INSERT INTO `sys_role_menu` VALUES ('26', '2020-05-23 04:41:58', null, null, null, '2', '11');
INSERT INTO `sys_role_menu` VALUES ('27', '2020-05-23 04:42:08', null, null, null, '2', '12');
INSERT INTO `sys_role_menu` VALUES ('28', '2020-05-23 04:42:14', null, null, null, '2', '13');
INSERT INTO `sys_role_menu` VALUES ('29', '2020-05-23 04:42:19', null, null, null, '2', '14');
INSERT INTO `sys_role_menu` VALUES ('30', '2020-05-23 04:42:23', null, null, null, '2', '15');
INSERT INTO `sys_role_menu` VALUES ('31', '2020-05-23 04:42:31', null, null, null, '2', '16');
INSERT INTO `sys_role_menu` VALUES ('32', '2020-05-23 04:42:36', null, null, null, '2', '17');
INSERT INTO `sys_role_menu` VALUES ('33', '2020-05-23 04:42:45', null, null, null, '2', '18');
INSERT INTO `sys_role_menu` VALUES ('34', '2020-05-23 04:42:51', null, null, null, '2', '19');
INSERT INTO `sys_role_menu` VALUES ('35', '2020-05-23 04:43:18', null, null, null, '2', '20');
INSERT INTO `sys_role_menu` VALUES ('36', '2020-05-23 04:42:31', null, null, null, '3', '6');
INSERT INTO `sys_role_menu` VALUES ('37', '2020-05-23 04:42:36', null, null, null, '3', '7');
INSERT INTO `sys_role_menu` VALUES ('38', '2020-05-23 04:42:45', null, null, null, '3', '8');
INSERT INTO `sys_role_menu` VALUES ('39', '2020-05-23 04:42:51', null, null, null, '3', '9');
INSERT INTO `sys_role_menu` VALUES ('40', '2020-05-23 04:43:18', null, null, null, '3', '10');
INSERT INTO `sys_role_menu` VALUES ('41', '2020-05-23 04:41:58', null, null, null, '3', '11');
INSERT INTO `sys_role_menu` VALUES ('42', '2020-05-23 04:42:08', null, null, null, '3', '12');
INSERT INTO `sys_role_menu` VALUES ('43', '2020-05-23 04:42:14', null, null, null, '3', '13');
INSERT INTO `sys_role_menu` VALUES ('44', '2020-05-23 04:42:19', null, null, null, '3', '14');
INSERT INTO `sys_role_menu` VALUES ('45', '2020-05-23 04:42:23', null, null, null, '3', '15');
INSERT INTO `sys_role_menu` VALUES ('46', '2020-05-23 04:42:31', null, null, null, '3', '16');
INSERT INTO `sys_role_menu` VALUES ('47', '2020-05-23 04:42:36', null, null, null, '3', '17');
INSERT INTO `sys_role_menu` VALUES ('48', '2020-05-23 04:42:45', null, null, null, '3', '18');
INSERT INTO `sys_role_menu` VALUES ('49', '2020-05-23 04:42:51', null, null, null, '3', '19');

-- ----------------------------
-- Table structure for sys_role_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_resource`;
CREATE TABLE `sys_role_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(100) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` varchar(100) DEFAULT NULL,
  `role_id` bigint(20) NOT NULL,
  `resource_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uq_rid_sid` (`role_id`,`resource_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_resource
-- ----------------------------
INSERT INTO `sys_role_resource` VALUES ('1', '2020-05-23 06:26:23', null, null, null, '1', '2');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(100) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` varchar(100) DEFAULT NULL,
  `username` varchar(180) NOT NULL,
  `password` varchar(180) NOT NULL,
  `nickname` varchar(180) DEFAULT NULL,
  `avatar` varchar(180) DEFAULT NULL,
  `status` int(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '2020-05-23 02:49:48', null, null, null, '18969553171', '$2a$10$BqEbrCe8XPovUcIvJhFLEu6oHOxhcGoR.WUKbKmmEDqTt5wAEHMT2', 'baicai', null, '1');
INSERT INTO `sys_user` VALUES ('2', '2020-05-23 04:49:04', null, null, null, '18912345678', '$2a$10$BqEbrCe8XPovUcIvJhFLEu6oHOxhcGoR.WUKbKmmEDqTt5wAEHMT2', 'zhanglin', null, '1');
INSERT INTO `sys_user` VALUES ('3', '2020-05-23 04:49:26', null, null, null, '18987654321', '$2a$10$BqEbrCe8XPovUcIvJhFLEu6oHOxhcGoR.WUKbKmmEDqTt5wAEHMT2', 'lupeng', null, '1');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(100) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` varchar(100) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_uid_rid` (`user_id`,`role_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '2020-05-23 04:04:58', null, null, null, '1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '2020-05-23 04:50:09', null, null, null, '2', '2');
INSERT INTO `sys_user_role` VALUES ('3', '2020-05-23 04:50:20', null, null, null, '3', '3');
