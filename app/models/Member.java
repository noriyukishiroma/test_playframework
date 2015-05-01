package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class Member extends Model{

	@Id
	@Constraints.Min(10)
	public Long id;

	@Constraints.Required
	public String name;

	public String email;
	public static Finder<Long, Member > find = new Finder<Long, Member>(
			Long.class, Member.class
			);


}