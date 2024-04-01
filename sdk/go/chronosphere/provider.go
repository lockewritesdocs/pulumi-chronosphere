// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package chronosphere

import (
	"context"
	"reflect"

	"github.com/chronosphereio/pulumi-chronosphere/sdk/go/chronosphere/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the chronosphere package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	ApiToken        pulumi.StringPtrOutput `pulumi:"apiToken"`
	EntityNamespace pulumi.StringPtrOutput `pulumi:"entityNamespace"`
	Org             pulumi.StringPtrOutput `pulumi:"org"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.ApiToken == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "CHRONOSPHERE_API_TOKEN"); d != nil {
			args.ApiToken = pulumi.StringPtr(d.(string))
		}
	}
	if args.Org == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "CHRONOSPHERE_ORG", "CHRONOSPHERE_ORG_NAME"); d != nil {
			args.Org = pulumi.StringPtr(d.(string))
		}
	}
	if args.ApiToken != nil {
		args.ApiToken = pulumi.ToSecret(args.ApiToken).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apiToken",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:chronosphere", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	ApiToken        *string `pulumi:"apiToken"`
	EntityNamespace *string `pulumi:"entityNamespace"`
	Org             *string `pulumi:"org"`
	Unstable        *bool   `pulumi:"unstable"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	ApiToken        pulumi.StringPtrInput
	EntityNamespace pulumi.StringPtrInput
	Org             pulumi.StringPtrInput
	Unstable        pulumi.BoolPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func (o ProviderOutput) ApiToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiToken }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) EntityNamespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.EntityNamespace }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) Org() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Org }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}