// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetState extends com.pulumi.resources.ResourceArgs {

    public static final DatasetState Empty = new DatasetState();

    @Import(name="configuration")
    private @Nullable Output<DatasetConfigurationArgs> configuration;

    public Optional<Output<DatasetConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    private DatasetState() {}

    private DatasetState(DatasetState $) {
        this.configuration = $.configuration;
        this.description = $.description;
        this.name = $.name;
        this.slug = $.slug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetState $;

        public Builder() {
            $ = new DatasetState();
        }

        public Builder(DatasetState defaults) {
            $ = new DatasetState(Objects.requireNonNull(defaults));
        }

        public Builder configuration(@Nullable Output<DatasetConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(DatasetConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
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

        public DatasetState build() {
            return $;
        }
    }

}