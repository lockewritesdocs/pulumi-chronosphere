// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BlackholeAlertNotifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlackholeAlertNotifierArgs Empty = new BlackholeAlertNotifierArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    private BlackholeAlertNotifierArgs() {}

    private BlackholeAlertNotifierArgs(BlackholeAlertNotifierArgs $) {
        this.name = $.name;
        this.slug = $.slug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlackholeAlertNotifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlackholeAlertNotifierArgs $;

        public Builder() {
            $ = new BlackholeAlertNotifierArgs();
        }

        public Builder(BlackholeAlertNotifierArgs defaults) {
            $ = new BlackholeAlertNotifierArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public BlackholeAlertNotifierArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}