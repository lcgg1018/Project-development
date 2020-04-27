/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : clothesppsdb

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 21/04/2020 00:36:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account_receivable_detail
-- ----------------------------
DROP TABLE IF EXISTS `account_receivable_detail`;
CREATE TABLE `account_receivable_detail`  (
  `clientele_id` int(11) NOT NULL COMMENT '客户ID\r\n',
  `invoices_date` datetime(0) NOT NULL COMMENT '单据日期',
  `invoices_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '单据编号',
  `Increase_due` float(255, 0) NULL DEFAULT NULL COMMENT '增加应付款',
  `Advance_payment_increase` float(255, 0) NULL DEFAULT NULL COMMENT '增加预付款',
  `Balance_payable` float(255, 0) NULL DEFAULT NULL COMMENT '应付款余额',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for accounts_payable_details
-- ----------------------------
DROP TABLE IF EXISTS `accounts_payable_details`;
CREATE TABLE `accounts_payable_details`  (
  `expenditure_num` int(11) NOT NULL COMMENT '供应商ID',
  `invoices_date` datetime(0) NOT NULL COMMENT '单据日期',
  `invoices_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '单据编号',
  `Increase_due` float(255, 0) NULL DEFAULT NULL COMMENT '增加应付款',
  `Advance_payment_increase` float(255, 0) NULL DEFAULT NULL COMMENT '增加预付款',
  `Balance_payable` float(255, 0) NULL DEFAULT NULL COMMENT '应付款余额',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cancel_after_verification
-- ----------------------------
DROP TABLE IF EXISTS `cancel_after_verification`;
CREATE TABLE `cancel_after_verification`  (
  `sourceList_num` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '源单编号\r\n',
  `professional_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '业务类别\r\n',
  `invoices_date` datetime(0) NULL DEFAULT NULL COMMENT '单据日期',
  `confirmed_money` float(255, 0) NULL DEFAULT NULL COMMENT '已核销金额',
  `unfinished_money` float(255, 0) NULL DEFAULT NULL COMMENT '未核销金额',
  `clientele_id` int(11) NULL DEFAULT NULL COMMENT '客户ID',
  INDEX `sourceList_num`(`sourceList_num`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cash_statement
-- ----------------------------
DROP TABLE IF EXISTS `cash_statement`;
CREATE TABLE `cash_statement`  (
  `account_id` int(11) NOT NULL COMMENT '账户编号',
  `date` datetime(0) NOT NULL COMMENT '日期',
  `invoices_num` varchar(0) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '单据编号',
  `business_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '业务类型',
  `income` float(255, 0) NULL DEFAULT NULL COMMENT '收入',
  `disburse` float(255, 0) NULL DEFAULT NULL COMMENT '支出',
  `account_balance` float(255, 0) NULL DEFAULT NULL COMMENT '账户余额',
  `dealings` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '客户编号/供应商编号',
  `payee` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '收款人',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  INDEX `account_id_foreign_key`(`account_id`) USING BTREE,
  CONSTRAINT `account_id_foreign_key` FOREIGN KEY (`account_id`) REFERENCES `pay_account` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for customer_statement
-- ----------------------------
DROP TABLE IF EXISTS `customer_statement`;
CREATE TABLE `customer_statement`  (
  `clientele_id` int(11) NOT NULL COMMENT '客户ID',
  `invoices_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '单据编号',
  `invoices_date` datetime(0) NOT NULL COMMENT '单据日期',
  `business_category` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '业务类别',
  `sourceList_num` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '源销货订单号',
  `sales_amount` float NULL DEFAULT NULL COMMENT '销售金额',
  `discount_amount` float NULL DEFAULT NULL COMMENT '优惠金额',
  `pay_the_piper` float NULL DEFAULT NULL COMMENT '客户承担费用',
  `amount_receivable` float NOT NULL COMMENT '应收金额',
  `Actual_amount_received` float NOT NULL COMMENT '实际收款金额',
  `Receivable_balance` float NULL DEFAULT NULL COMMENT '应收款余额',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for money_transfer
-- ----------------------------
DROP TABLE IF EXISTS `money_transfer`;
CREATE TABLE `money_transfer`  (
  `out_account_id` int(255) NOT NULL COMMENT '转出账户',
  `shift_to_account_id` int(255) NOT NULL COMMENT '转入账户',
  `money` float(255, 0) NOT NULL COMMENT '金额',
  `clearing_form_id` int(255) NOT NULL COMMENT '结算方式',
  `settle_num` int(255) NOT NULL COMMENT '结算号',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  INDEX `out_account_id_foreign_key`(`out_account_id`) USING BTREE,
  INDEX `shift_to_account_id_foreign_key`(`shift_to_account_id`) USING BTREE,
  INDEX `clearing_form_id_foreign_key`(`clearing_form_id`) USING BTREE,
  CONSTRAINT `clearing_form_id_foreign_key` FOREIGN KEY (`clearing_form_id`) REFERENCES `payment_method` (`clearing_form_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `out_account_id_foreign_key` FOREIGN KEY (`out_account_id`) REFERENCES `pay_account` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `shift_to_account_id_foreign_key` FOREIGN KEY (`shift_to_account_id`) REFERENCES `pay_account` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for other_expenses
-- ----------------------------
DROP TABLE IF EXISTS `other_expenses`;
CREATE TABLE `other_expenses`  (
  `expenditure_num` int(11) NOT NULL AUTO_INCREMENT COMMENT '支出编号',
  `supplier_id` varchar(0) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '供应商ID',
  `invoices_date` datetime(0) NOT NULL COMMENT '单据日期',
  `spending_category_id` int(255) NOT NULL COMMENT '支持类别',
  `money` float(255, 0) NOT NULL COMMENT '金额',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`expenditure_num`) USING BTREE,
  INDEX `Spendingcategory_foreign_key`(`spending_category_id`) USING BTREE,
  CONSTRAINT `Spendingcategory_foreign_key` FOREIGN KEY (`spending_category_id`) REFERENCES `spending_category` (`spendingcategory_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for other_income_and_expenditure_details
-- ----------------------------
DROP TABLE IF EXISTS `other_income_and_expenditure_details`;
CREATE TABLE `other_income_and_expenditure_details`  (
  `date` datetime(0) NOT NULL COMMENT '日期',
  `invoices_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '单据编号',
  `Income_category` tinyint(255) NOT NULL COMMENT '收支类别',
  `Balance_of_project` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '收支项目',
  `income` float(255, 0) NULL DEFAULT NULL COMMENT '收入',
  `disburse` float(255, 0) NULL DEFAULT NULL COMMENT '支出',
  `dealings` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '客户ID/供应商ID',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注\r\n'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for other_revenue
-- ----------------------------
DROP TABLE IF EXISTS `other_revenue`;
CREATE TABLE `other_revenue`  (
  `expenditure_num` int(11) NOT NULL AUTO_INCREMENT COMMENT '支入编号',
  `supplier_id` varchar(0) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '供应商ID',
  `invoices_date` datetime(0) NOT NULL COMMENT '单据日期',
  `spending_category_id` int(255) NOT NULL COMMENT '支持类别',
  `money` float(255, 0) NOT NULL COMMENT '金额',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`expenditure_num`) USING BTREE,
  INDEX `Spendingcategory_foreign_key`(`spending_category_id`) USING BTREE,
  CONSTRAINT `other_revenue_ibfk_1` FOREIGN KEY (`spending_category_id`) REFERENCES `spending_category` (`spendingcategory_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pay_account
-- ----------------------------
DROP TABLE IF EXISTS `pay_account`;
CREATE TABLE `pay_account`  (
  `account_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '账户ID',
  `pay_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '汇款类型',
  `Remittances_account` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '汇款账号',
  PRIMARY KEY (`account_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `settlement_account_id` int(11) NOT NULL COMMENT '结算账户\r\n',
  `Unit_sales_id` int(11) NOT NULL COMMENT '销货单位ID\r\n',
  `
payee` int(11) NOT NULL COMMENT '收款人\r\n',
  `receivable_amount` float NOT NULL COMMENT '收款金额\r\n',
  `clearing_form` int(11) NOT NULL COMMENT '结算方式\r\n',
  `settle_num` int(11) NOT NULL COMMENT '结算号\r\n',
  `invoices_date` datetime(0) NOT NULL COMMENT '单据日期',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  PRIMARY KEY (`Unit_sales_id`) USING BTREE,
  INDEX `settlement_account_id`(`settlement_account_id`) USING BTREE,
  INDEX `clearing_form_foreign_key`(`clearing_form`) USING BTREE,
  CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`clearing_form`) REFERENCES `payment_method` (`clearing_form_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`settlement_account_id`) REFERENCES `pay_account` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for payment_method
-- ----------------------------
DROP TABLE IF EXISTS `payment_method`;
CREATE TABLE `payment_method`  (
  `clearing_form_id` int(11) NOT NULL COMMENT 'ID',
  `clearing_form` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '结算方式\r\n',
  PRIMARY KEY (`clearing_form_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for procurement_sell_expenses
-- ----------------------------
DROP TABLE IF EXISTS `procurement_sell_expenses`;
CREATE TABLE `procurement_sell_expenses`  (
  `supplier_id` int(11) NOT NULL COMMENT '供应商ID',
  `spending_category_id` int(11) NOT NULL COMMENT '支出类别',
  `money` float(255, 0) NOT NULL COMMENT '金额',
  `unpaid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '未付费用',
  `sourceList_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '源单号',
  `expenditure_num` int(255) NULL DEFAULT NULL COMMENT '其他支出单编号',
  `payment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '付款',
  `payment_status` tinyint(1) NULL DEFAULT NULL COMMENT '付款状态',
  PRIMARY KEY (`supplier_id`) USING BTREE,
  INDEX `spending_category_id_foreign_key`(`spending_category_id`) USING BTREE,
  INDEX `expenditure_num_foreign_key`(`expenditure_num`) USING BTREE,
  INDEX `sourceList_num_foreign_key`(`sourceList_num`) USING BTREE,
  CONSTRAINT `expenditure_num_foreign_key` FOREIGN KEY (`expenditure_num`) REFERENCES `other_expenses` (`expenditure_num`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sourceList_num_foreign_key` FOREIGN KEY (`sourceList_num`) REFERENCES `cancel_after_verification` (`sourceList_num`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `spending_category_id_foreign_key` FOREIGN KEY (`spending_category_id`) REFERENCES `spending_category` (`spendingcategory_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for profit
-- ----------------------------
DROP TABLE IF EXISTS `profit`;
CREATE TABLE `profit`  (
  `date` datetime(0) NOT NULL COMMENT '日期',
  `sales_revenue` float NOT NULL COMMENT '销售收入金额',
  `sales_discount` float NULL DEFAULT NULL COMMENT '减：销售优惠金额',
  `sales_collection_discount` float NULL DEFAULT NULL COMMENT '减：收款折扣',
  `selling_cost` float NOT NULL COMMENT '销售成本',
  `selling_discount_amount` float NULL DEFAULT NULL COMMENT '减：买货优惠金额',
  `selling_payment_discount` float NULL DEFAULT NULL COMMENT '减：付款折扣',
  `retained_profits` float NOT NULL COMMENT '净利润'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for receipt
-- ----------------------------
DROP TABLE IF EXISTS `receipt`;
CREATE TABLE `receipt`  (
  `settlement_account_id` int(11) NOT NULL COMMENT '结算账户\r\n',
  `Unit_sales_id` int(11) NOT NULL COMMENT '销货单位ID\r\n',
  `
payee` int(11) NOT NULL COMMENT '收款人\r\n',
  `receivable_amount` float NOT NULL COMMENT '收款金额\r\n',
  `clearing_form` int(11) NOT NULL COMMENT '结算方式\r\n',
  `settle_num` int(11) NOT NULL COMMENT '结算号\r\n',
  `invoices_date` datetime(0) NOT NULL COMMENT '单据日期',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  PRIMARY KEY (`Unit_sales_id`) USING BTREE,
  INDEX `settlement_account_id`(`settlement_account_id`) USING BTREE,
  INDEX `clearing_form_foreign_key`(`clearing_form`) USING BTREE,
  CONSTRAINT `clearing_form_foreign_key` FOREIGN KEY (`clearing_form`) REFERENCES `payment_method` (`clearing_form_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `settlement_account_id` FOREIGN KEY (`settlement_account_id`) REFERENCES `pay_account` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for spending_category
-- ----------------------------
DROP TABLE IF EXISTS `spending_category`;
CREATE TABLE `spending_category`  (
  `spendingcategory_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '支出类别ID',
  `Spending category_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '类别名称',
  PRIMARY KEY (`spendingcategory_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for supplier_statement
-- ----------------------------
DROP TABLE IF EXISTS `supplier_statement`;
CREATE TABLE `supplier_statement`  (
  `supplier_id` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '供应商ID',
  `invoices_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '单据编号',
  `invoices_date` datetime(0) NOT NULL COMMENT '单据日期',
  `business_category` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '业务类别',
  `purchase_amount` float NOT NULL COMMENT '采购金额',
  `discount_amount` float NULL DEFAULT NULL COMMENT '优惠金额',
  `amount_receivable` float NOT NULL COMMENT '应收金额',
  `Actual_amount_received` float NOT NULL COMMENT '实际收款金额',
  `Receivable_balance` float NULL DEFAULT NULL COMMENT '应收款余额',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
