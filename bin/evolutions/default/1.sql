# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table member (
  id                        bigint not null,
  name                      varchar(255),
  email                     varchar(255),
  constraint pk_member primary key (id))
;

create sequence member_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists member;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists member_seq;

