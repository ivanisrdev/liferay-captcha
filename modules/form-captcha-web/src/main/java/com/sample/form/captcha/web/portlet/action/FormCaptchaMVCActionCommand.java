package com.sample.form.captcha.web.portlet.action;

import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.sample.form.captcha.web.constants.FormCaptchaWebPortletKeys;
import com.sample.form.captcha.web.constants.MVCCommandNames;
import org.osgi.service.component.annotations.Component;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * @author Ivan Sánchez
 */
@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + FormCaptchaWebPortletKeys.WIDGET_NAME,
                "mvc.command.name=" + MVCCommandNames.ACTION_CAPTCHA
        },
        service = MVCActionCommand.class
)
public class FormCaptchaMVCActionCommand extends BaseMVCActionCommand {

    private static final Log LOG = LogFactoryUtil.getLog(FormCaptchaMVCActionCommand.class);

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        LOG.info("Inside FormCaptchaMVCActionCommand");

        String email = ParamUtil.getString(actionRequest, FormCaptchaWebPortletKeys.PARAM_EMAIL);
        LOG.debug("email param: " + email);

        try {
            CaptchaUtil.check(actionRequest);
            LOG.info("CAPTCHA verification successful.");
        } catch (CaptchaException captchaException) {
            SessionErrors.add(actionRequest, "captcha-verification-failed");
            LOG.error("CAPTCHA verification failed.");
        }
    }
}

