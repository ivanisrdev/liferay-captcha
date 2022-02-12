<%@ include file="/init.jsp" %>

<liferay-ui:success key="success" message="formcaptchaweb.form.success" />
<liferay-ui:error exception="<%=Exception.class%>" key="error" message="formcaptchaweb.form.error"/>
<liferay-ui:error exception="<%= CaptchaException.class %>" key="error" message="captcha-verification-failed" />

<section id="form-captcha-web">

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
						<%@ include file="/action/form.jspf" %>
					</article>
				</div>
			</div>
		</div>
	</div>

</section>

