// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.DerivedMetricQueryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DerivedMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final DerivedMetricArgs Empty = new DerivedMetricArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="queries", required=true)
    private Output<List<DerivedMetricQueryArgs>> queries;

    public Output<List<DerivedMetricQueryArgs>> queries() {
        return this.queries;
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    private DerivedMetricArgs() {}

    private DerivedMetricArgs(DerivedMetricArgs $) {
        this.description = $.description;
        this.metricName = $.metricName;
        this.name = $.name;
        this.queries = $.queries;
        this.slug = $.slug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DerivedMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DerivedMetricArgs $;

        public Builder() {
            $ = new DerivedMetricArgs();
        }

        public Builder(DerivedMetricArgs defaults) {
            $ = new DerivedMetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder queries(Output<List<DerivedMetricQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<DerivedMetricQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(DerivedMetricQueryArgs... queries) {
            return queries(List.of(queries));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public DerivedMetricArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.queries = Objects.requireNonNull($.queries, "expected parameter 'queries' to be non-null");
            return $;
        }
    }

}