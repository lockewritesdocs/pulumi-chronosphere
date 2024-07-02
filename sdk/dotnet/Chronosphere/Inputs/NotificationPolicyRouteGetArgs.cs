// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Chronosphere.Inputs
{

    public sealed class NotificationPolicyRouteGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("groupBy")]
        public Input<Inputs.NotificationPolicyRouteGroupByGetArgs>? GroupBy { get; set; }

        [Input("notifiers")]
        private InputList<string>? _notifiers;
        public InputList<string> Notifiers
        {
            get => _notifiers ?? (_notifiers = new InputList<string>());
            set => _notifiers = value;
        }

        [Input("repeatInterval")]
        public Input<string>? RepeatInterval { get; set; }

        [Input("severity", required: true)]
        public Input<string> Severity { get; set; } = null!;

        public NotificationPolicyRouteGetArgs()
        {
        }
        public static new NotificationPolicyRouteGetArgs Empty => new NotificationPolicyRouteGetArgs();
    }
}