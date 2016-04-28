/*
 * Copyright 2016 Instil Software.
 */

package co.instil.jenkins.plugins.pipeline.dsl;

import hudson.Extension;
import org.jenkinsci.plugins.pipelinedsl.PipelineDSLGlobal;

/**
 *
 */
@Extension
public class SendEmailNotificationOnFailure extends PipelineDSLGlobal {

    @Override
    public String getFunctionName() {
        return "sendEmailNotificationOnFailure";
    }

}
