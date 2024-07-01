// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Outputs
{

    [OutputType]
    public sealed class OtelMetricsIngestionResourceAttributes
    {
        public readonly ImmutableArray<string> ExcludeKeys;
        public readonly string? FilterMode;
        public readonly string? FlattenMode;
        public readonly bool? GenerateTargetInfo;

        [OutputConstructor]
        private OtelMetricsIngestionResourceAttributes(
            ImmutableArray<string> excludeKeys,

            string? filterMode,

            string? flattenMode,

            bool? generateTargetInfo)
        {
            ExcludeKeys = excludeKeys;
            FilterMode = filterMode;
            FlattenMode = flattenMode;
            GenerateTargetInfo = generateTargetInfo;
        }
    }
}