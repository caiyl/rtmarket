/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/12/28 12:28:44                          */
/*==============================================================*/


drop table if exists rt_buss_event;

drop table if exists rt_cust_point;

drop table if exists rt_mene_event;

drop table if exists rt_menu_map;

drop table if exists rt_point;

drop table if exists rt_rule;

drop table if exists rt_rule_event;

drop table if exists rt_rule_point_list;

/*==============================================================*/
/* Table: rt_buss_event                                         */
/*==============================================================*/
create table rt_buss_event
(
   id                   varchar(32) not null,
   event_name           varchar(255) not null,
   event_src            varchar(50),
   event_type           varchar(50),
   display              char(1),
   operator             varchar(50),
   operate_time         timestamp,
   modify_operetor      varchar(50),
   modify_time          timestamp,
   remark               varchar(255),
   primary key (id)
);

alter table rt_buss_event comment '用于定义一个事件';

/*==============================================================*/
/* Table: rt_cust_point                                         */
/*==============================================================*/
create table rt_cust_point
(
   id                   varchar(32) not null,
   cust_id              varchar(50),
   point_code           varchar(50),
   point_value          varchar(255),
   primary key (id)
);

alter table rt_cust_point comment '客户指标表';

/*==============================================================*/
/* Table: rt_mene_event                                         */
/*==============================================================*/
create table rt_mene_event
(
   id                   varchar(32) not null,
   menu_id              varchar(32) not null,
   event_id             varchar(32) not null,
   primary key (id)
);

/*==============================================================*/
/* Table: rt_menu_map                                           */
/*==============================================================*/
create table rt_menu_map
(
   id                   varchar(32) not null,
   menu_name            varchar(255) not null,
   path                 varchar(255) not null,
   location             varchar(255) not null,
   remark               varchar(255),
   primary key (id)
);

alter table rt_menu_map comment '菜单名与页面的点击位置映射配置表';

/*==============================================================*/
/* Table: rt_point                                              */
/*==============================================================*/
create table rt_point
(
   id                   varchar(32) not null,
   point_name           varchar(255),
   point_code           varchar(50),
   from_tab             varchar(50),
   from_col             varchar(50),
   point_type           varchar(50),
   point_data_type      varchar(50),
   state                char(1),
   operator             varchar(50),
   operate_time         timestamp,
   modify_operator      varchar(50),
   modify_time          timestamp,
   primary key (id)
);

alter table rt_point comment '用于配置规则和查找指标的值';

/*==============================================================*/
/* Table: rt_rule                                               */
/*==============================================================*/
create table rt_rule
(
   id                   varchar(32) not null,
   rule_name            varchar(255) not null,
   rule_code            varchar(50),
   event_display        char(1),
   validate_flag        char(1),
   operator             varchar(50),
   operate_time         timestamp,
   modify_operator      varchar(50),
   modify_time          timestamp,
   remakr               varchar(255),
   primary key (id)
);

alter table rt_rule comment '规则定义表';

/*==============================================================*/
/* Table: rt_rule_event                                         */
/*==============================================================*/
create table rt_rule_event
(
   id                   varchar(32) not null,
   rule_id              varchar(32),
   event_id             varchar(32),
   primary key (id)
);

/*==============================================================*/
/* Table: rt_rule_point_list                                    */
/*==============================================================*/
create table rt_rule_point_list
(
   id                   varchar(32) not null,
   rule_id              varchar(32),
   point                varchar(255),
   primary key (id)
);

