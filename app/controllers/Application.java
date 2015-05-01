package controllers;

import play.db.DB;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render("Your new application is ready."));
	}

	/**
    Connection connection = DB.getConnection();
    try {
        PreparedStatement sql = connection.preparedStatement("select * from member");
        ResultSet rs = sql.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("name") + ":" + rs.getString("email"));
        }
    } catch (SQLException e) {
        e.printStatckTrace();
    }
	 **/


	Connection connection = DB.getConnection();
	{
		Member member = new Member();
		member.name = "hoge";
		member.email = "hoge@example.com";
		member.save();
		//メンバー一覧取得してコンソールに出力
		List<Member> members = Member.find.all();
		for (Member member : members) {
			System.out.println(member.id + ":" + member.name + ":" + member.email);
		}
	}
}