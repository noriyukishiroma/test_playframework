package controllers;

//import models.Member;
//import play.db.DB;
import models.Member;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;


public class Application extends Controller {

	public static Result index() {
		return ok(index.render("Your new application is ready."));
	}

	public static Result print_member(){
		Member member = new Member();
		member.name = "hoge";
		member.email = "hoge@example.com";
		member.save();
		return ok(member.id + ":" + member.name + ":" + member.email);


/**
		//メンバー一覧取得してコンソールに出力
		List<Member> members = Member.find.all();
		for (Member member : members ) {
			System.out.println(member.id + ":" + member.name + ":" + member.email);
		}
**/

	}

}