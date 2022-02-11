package com.sample.form.captcha.web.portlet;

import com.sample.form.captcha.web.constants.FormCaptchaWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import javax.portlet.Portlet;
import org.osgi.service.component.annotations.Component;

/**
 * @author Ivan
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=" + FormCaptchaWebPortletKeys.WIDGET_DISPLAY_CATEGORY,
		"com.liferay.portlet.header-portlet-css=" + FormCaptchaWebPortletKeys.WIDGET_CSS_FILE,
		"com.liferay.portlet.instanceable=" + FormCaptchaWebPortletKeys.WIDGET_INSTANCEABLE,
		"javax.portlet.display-name=" + FormCaptchaWebPortletKeys.WIDGET_DISPLAY_NAME,
		"javax.portlet.init-param.template-path=" + FormCaptchaWebPortletKeys.TEMPLATE_JSP,
		"javax.portlet.init-param.view-template=" + FormCaptchaWebPortletKeys.VIEW_JSP,
		"javax.portlet.name=" + FormCaptchaWebPortletKeys.WIDGET_NAME,
		"javax.portlet.resource-bundle=" + FormCaptchaWebPortletKeys.WIDGET_RESOURCE_LANGUAGE,
		"javax.portlet.security-role-ref=" + FormCaptchaWebPortletKeys.WIDGET_SECURITY_ROLE
	},
	service = Portlet.class
)
public class FormCaptchaWebPortlet extends MVCPortlet {
}