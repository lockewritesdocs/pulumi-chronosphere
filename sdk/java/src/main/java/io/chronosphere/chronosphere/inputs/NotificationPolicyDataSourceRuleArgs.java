// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationPolicyDataSourceRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPolicyDataSourceRuleArgs Empty = new NotificationPolicyDataSourceRuleArgs();

    @Import(name="notifiers")
    private @Nullable Output<List<String>> notifiers;

    public Optional<Output<List<String>>> notifiers() {
        return Optional.ofNullable(this.notifiers);
    }

    @Import(name="repeatInterval")
    private @Nullable Output<String> repeatInterval;

    public Optional<Output<String>> repeatInterval() {
        return Optional.ofNullable(this.repeatInterval);
    }

    @Import(name="severity", required=true)
    private Output<String> severity;

    public Output<String> severity() {
        return this.severity;
    }

    private NotificationPolicyDataSourceRuleArgs() {}

    private NotificationPolicyDataSourceRuleArgs(NotificationPolicyDataSourceRuleArgs $) {
        this.notifiers = $.notifiers;
        this.repeatInterval = $.repeatInterval;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyDataSourceRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyDataSourceRuleArgs $;

        public Builder() {
            $ = new NotificationPolicyDataSourceRuleArgs();
        }

        public Builder(NotificationPolicyDataSourceRuleArgs defaults) {
            $ = new NotificationPolicyDataSourceRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder notifiers(@Nullable Output<List<String>> notifiers) {
            $.notifiers = notifiers;
            return this;
        }

        public Builder notifiers(List<String> notifiers) {
            return notifiers(Output.of(notifiers));
        }

        public Builder notifiers(String... notifiers) {
            return notifiers(List.of(notifiers));
        }

        public Builder repeatInterval(@Nullable Output<String> repeatInterval) {
            $.repeatInterval = repeatInterval;
            return this;
        }

        public Builder repeatInterval(String repeatInterval) {
            return repeatInterval(Output.of(repeatInterval));
        }

        public Builder severity(Output<String> severity) {
            $.severity = severity;
            return this;
        }

        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        public NotificationPolicyDataSourceRuleArgs build() {
            $.severity = Objects.requireNonNull($.severity, "expected parameter 'severity' to be non-null");
            return $;
        }
    }

}