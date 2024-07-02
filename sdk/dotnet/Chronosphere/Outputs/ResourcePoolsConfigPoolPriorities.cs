// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Chronosphere.Outputs
{

    [OutputType]
    public sealed class ResourcePoolsConfigPoolPriorities
    {
        public readonly ImmutableArray<string> HighPriorityMatchRules;
        public readonly ImmutableArray<string> LowPriorityMatchRules;

        [OutputConstructor]
        private ResourcePoolsConfigPoolPriorities(
            ImmutableArray<string> highPriorityMatchRules,

            ImmutableArray<string> lowPriorityMatchRules)
        {
            HighPriorityMatchRules = highPriorityMatchRules;
            LowPriorityMatchRules = lowPriorityMatchRules;
        }
    }
}