// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Inputs
{

    public sealed class OtelMetricsIngestionResourceAttributesArgs : global::Pulumi.ResourceArgs
    {
        [Input("excludeKeys")]
        private InputList<string>? _excludeKeys;
        public InputList<string> ExcludeKeys
        {
            get => _excludeKeys ?? (_excludeKeys = new InputList<string>());
            set => _excludeKeys = value;
        }

        [Input("filterMode")]
        public Input<string>? FilterMode { get; set; }

        [Input("flattenMode")]
        public Input<string>? FlattenMode { get; set; }

        [Input("generateTargetInfo")]
        public Input<bool>? GenerateTargetInfo { get; set; }

        public OtelMetricsIngestionResourceAttributesArgs()
        {
        }
        public static new OtelMetricsIngestionResourceAttributesArgs Empty => new OtelMetricsIngestionResourceAttributesArgs();
    }
}