<%@ include file="/init.jsp" %>

<portlet:actionURL var="formCaptchaWebActionURL" name="<%= MVCCommandNames.ACTION %>" secure="<%= request.isSecure() %>"/>
<portlet:resourceURL id="captcha" var="captchaResourceURL"/>

<liferay-ui:success key="success" message="formcaptchaweb.form.success" />
<liferay-ui:error exception="<%=Exception.class%>" key="error" message="formcaptchaweb.form.error"/>
<liferay-ui:error exception="<%= CaptchaException.class %>" key="error" message="captcha-verification-failed" />

<section id="forgot-username-web">

	<div class="container">
		<div class="content-wrapper">
			<div class="row justify-content-center">
				<div class="col-12 col-lg-6 bg-white align-self-center d-flex flex-column text-center">
					<article class="mt-60 mb-60 pl-30 pr-30">
						<h2 class="font-bold font-30 mb-30">
							<liferay-ui:message key="formcaptchaweb.title.h2"></liferay-ui:message>
						</h2>
						<p class="font-medium font-20 mb-15">
							<liferay-ui:message key="formcaptchaweb.subtext"></liferay-ui:message>
						</p>
						<aui:form action="${formCaptchaWebActionURL}" name="formCaptchaWeb" method="post">

							<aui:input name="email" id="email" type="email" cssClass="font-medium font-15" label="formcaptchaweb.form.label.email"
									   placeholder="formcaptchaweb.form.placehorder.email" required="true">
								<aui:validator name="email"/>
							</aui:input>
							<liferay-captcha:captcha url="<%= captchaResourceURL %>"/>
							<div class="d-flex justify-content-around align-items-center">
								<a href="#" class="font-20 font-bold button-link-dark-gray mb-30 mt-30">
									<liferay-ui:message key="formcaptchaweb.button.cancel"></liferay-ui:message>
								</a>
								<button id="forgotUserNameButton" class="font-20 font-bold button-link-pink mb-30 mt-30" type="submit">
									<liferay-ui:message key="formcaptchaweb.button.submit"></liferay-ui:message>
								</button>
							</div>

						</aui:form>
					</article>
				</div>
			</div>
		</div>
	</div>

</section>