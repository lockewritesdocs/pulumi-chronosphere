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

    public sealed class OpsgenieAlertNotifierResponderGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("username")]
        public Input<string>? Username { get; set; }

        public OpsgenieAlertNotifierResponderGetArgs()
        {
        }
        public static new OpsgenieAlertNotifierResponderGetArgs Empty => new OpsgenieAlertNotifierResponderGetArgs();
    }
}