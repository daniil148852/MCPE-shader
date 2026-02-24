$input a_position, a_color0
$output v_color, v_pos

#include <bgfx_shader.sh>

void main() {
    v_color = a_color0;
    v_pos = mul(u_modelViewProj, vec4(a_position, 1.0));
    gl_Position = v_pos;
}
