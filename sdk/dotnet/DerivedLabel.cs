// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi
{
    [PulumiResourceType("chronosphere:index/derivedLabel:DerivedLabel")]
    public partial class DerivedLabel : global::Pulumi.CustomResource
    {
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("existingLabelPolicy")]
        public Output<string?> ExistingLabelPolicy { get; private set; } = null!;

        [Output("labelName")]
        public Output<string> LabelName { get; private set; } = null!;

        [Output("metricLabel")]
        public Output<Outputs.DerivedLabelMetricLabel> MetricLabel { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;


        /// <summary>
        /// Create a DerivedLabel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DerivedLabel(string name, DerivedLabelArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/derivedLabel:DerivedLabel", name, args ?? new DerivedLabelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DerivedLabel(string name, Input<string> id, DerivedLabelState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/derivedLabel:DerivedLabel", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DerivedLabel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DerivedLabel Get(string name, Input<string> id, DerivedLabelState? state = null, CustomResourceOptions? options = null)
        {
            return new DerivedLabel(name, id, state, options);
        }
    }

    public sealed class DerivedLabelArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("existingLabelPolicy")]
        public Input<string>? ExistingLabelPolicy { get; set; }

        [Input("labelName", required: true)]
        public Input<string> LabelName { get; set; } = null!;

        [Input("metricLabel", required: true)]
        public Input<Inputs.DerivedLabelMetricLabelArgs> MetricLabel { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public DerivedLabelArgs()
        {
        }
        public static new DerivedLabelArgs Empty => new DerivedLabelArgs();
    }

    public sealed class DerivedLabelState : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("existingLabelPolicy")]
        public Input<string>? ExistingLabelPolicy { get; set; }

        [Input("labelName")]
        public Input<string>? LabelName { get; set; }

        [Input("metricLabel")]
        public Input<Inputs.DerivedLabelMetricLabelGetArgs>? MetricLabel { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public DerivedLabelState()
        {
        }
        public static new DerivedLabelState Empty => new DerivedLabelState();
    }
}