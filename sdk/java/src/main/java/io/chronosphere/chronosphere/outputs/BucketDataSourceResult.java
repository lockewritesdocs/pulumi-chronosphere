// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketDataSourceResult {
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Map<String,String> labels;
    private @Nullable String name;
    private @Nullable String slug;

    private BucketDataSourceResult() {}
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> slug() {
        return Optional.ofNullable(this.slug);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketDataSourceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private @Nullable Map<String,String> labels;
        private @Nullable String name;
        private @Nullable String slug;
        public Builder() {}
        public Builder(BucketDataSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.slug = defaults.slug;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder slug(@Nullable String slug) {
            this.slug = slug;
            return this;
        }
        public BucketDataSourceResult build() {
            final var o = new BucketDataSourceResult();
            o.description = description;
            o.id = id;
            o.labels = labels;
            o.name = name;
            o.slug = slug;
            return o;
        }
    }
}