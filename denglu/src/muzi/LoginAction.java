package muzi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		LoginActionForm laf = (LoginActionForm)form;
				
		String username = laf.getUsername();
		String pwd = laf.getPassword();
		
		UserManager usermanager = new UserManager();
		
		try{
			usermanager.login(username, pwd);
			return mapping.findForward("success");
		}catch (UserNotFoundException e) {
			e.printStackTrace();
			request.setAttribute("msg", "您输入的用户名：" + username + "不存在!");
		}catch (PasswordErrorException e){
			e.printStackTrace();
			request.setAttribute("msg","您输入的密码错误!");
		}
	    return mapping.findForward("error");

	}

	
}
