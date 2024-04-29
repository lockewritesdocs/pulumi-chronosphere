// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.chronosphere.chronosphere.CollectionArgs;
import io.chronosphere.chronosphere.Utilities;
import io.chronosphere.chronosphere.inputs.CollectionState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="chronosphere:index/collection:Collection")
public class Collection extends com.pulumi.resources.CustomResource {
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="notificationPolicyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notificationPolicyId;

    public Output<Optional<String>> notificationPolicyId() {
        return Codegen.optional(this.notificationPolicyId);
    }
    @Export(name="slug", refs={String.class}, tree="[0]")
    private Output<String> slug;

    public Output<String> slug() {
        return this.slug;
    }
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> teamId;

    public Output<Optional<String>> teamId() {
        return Codegen.optional(this.teamId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Collection(String name) {
        this(name, CollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Collection(String name, CollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Collection(String name, CollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/collection:Collection", name, args == null ? CollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Collection(String name, Output<String> id, @Nullable CollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/collection:Collection", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Collection get(String name, Output<String> id, @Nullable CollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Collection(name, id, state, options);
    }
}