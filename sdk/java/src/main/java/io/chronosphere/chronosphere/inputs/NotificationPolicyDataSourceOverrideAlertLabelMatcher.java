// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NotificationPolicyDataSourceOverrideAlertLabelMatcher extends com.pulumi.resources.InvokeArgs {

    public static final NotificationPolicyDataSourceOverrideAlertLabelMatcher Empty = new NotificationPolicyDataSourceOverrideAlertLabelMatcher();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private NotificationPolicyDataSourceOverrideAlertLabelMatcher() {}

    private NotificationPolicyDataSourceOverrideAlertLabelMatcher(NotificationPolicyDataSourceOverrideAlertLabelMatcher $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyDataSourceOverrideAlertLabelMatcher defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyDataSourceOverrideAlertLabelMatcher $;

        public Builder() {
            $ = new NotificationPolicyDataSourceOverrideAlertLabelMatcher();
        }

        public Builder(NotificationPolicyDataSourceOverrideAlertLabelMatcher defaults) {
            $ = new NotificationPolicyDataSourceOverrideAlertLabelMatcher(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public NotificationPolicyDataSourceOverrideAlertLabelMatcher build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}