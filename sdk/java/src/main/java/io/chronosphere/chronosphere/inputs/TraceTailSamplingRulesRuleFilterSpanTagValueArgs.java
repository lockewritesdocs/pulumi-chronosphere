// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TraceTailSamplingRulesRuleFilterSpanTagValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceTailSamplingRulesRuleFilterSpanTagValueArgs Empty = new TraceTailSamplingRulesRuleFilterSpanTagValueArgs();

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private TraceTailSamplingRulesRuleFilterSpanTagValueArgs() {}

    private TraceTailSamplingRulesRuleFilterSpanTagValueArgs(TraceTailSamplingRulesRuleFilterSpanTagValueArgs $) {
        this.match = $.match;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceTailSamplingRulesRuleFilterSpanTagValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceTailSamplingRulesRuleFilterSpanTagValueArgs $;

        public Builder() {
            $ = new TraceTailSamplingRulesRuleFilterSpanTagValueArgs();
        }

        public Builder(TraceTailSamplingRulesRuleFilterSpanTagValueArgs defaults) {
            $ = new TraceTailSamplingRulesRuleFilterSpanTagValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TraceTailSamplingRulesRuleFilterSpanTagValueArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}