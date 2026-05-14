# Roadmap

## Phase 0: Android Control Spike

- Create native Android app shell.
- Add AccessibilityService permission flow.
- Serialize current UI tree.
- Execute tap, type, scroll, back, and home.

## Phase 1: Agent MVP

- Add chat UI.
- Add OpenAI-compatible provider config.
- Add structured tool-call loop.
- Add tool-call timeline and local logs.
- Add manual approval for medium/high risk tools.

## Phase 2: Reliability

- Stable UI selectors.
- Retry and wait policies.
- Better error recovery.
- Task verification after actions.
- Exportable debug traces.

## Phase 3: Skills

- Add Markdown skill files.
- Load skills into prompt context.
- Add tool allowlists per skill.
- Provide starter skills for browser, settings, and messages.

## Phase 4: MCP

- Add MCP client support.
- Optionally expose Android tools as an MCP server.
- Provide examples for desktop agents calling TouchPilot.

## Phase 5: Local Inference

- Evaluate ExecuTorch, llama.cpp, and LiteRT.
- Start with small local models for routing and simple tool calls.
- Keep cloud/provider fallback available for complex tasks.
