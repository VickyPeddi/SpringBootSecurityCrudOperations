package com.example.nanda.config;

import org.springframework.stereotype.Component;

@Component
public class Jwtfilter
//extends OncePerRequestFilter
{
//    @Autowired
//    private Jwtutil jwtutil;
//    @Autowired
//    public CustomUserdetailsservice customUserdetailsservice;
//
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
////get jwt
//        String header = request.getHeader("Authorization");
//        String username = null;
//        String jwttoken = null;
//        if (header != null && header.startsWith("Bearer")) {
//            jwttoken = header.substring(7);
//
//            try {
//                username = jwtutil.extractUsername(jwttoken);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            //security
//            UserDetails userDetails = customUserdetailsservice.loadUserByUsername(username);
//
//
//            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken
//                        = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//            } else {
//                System.out.println("Token is not validated");
//            }
//
//        }
//
//        filterChain.doFilter(request, response);
//
//        //bearer
//        //validate
//
//
//    }
//    @Autowired
//    public Jwtutil jwtutil;
//    @Autowired
//    public CustomUserdetailsservice customUserdetailsservice;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String header = request.getHeader("Authorization");
//        String username = null;
//        String token = null;
//        if (header != null) {
//            token = header.substring(7);
//            username = jwtutil.extractUsername(token);
//            System.out.println("Username is  " + username);
//        }
//        if (username != null) {
//            UserDetails byUsername = customUserdetailsservice.loadUserByUsername(username);
//            if (jwtutil.validateToken(token, byUsername)) {
//                UsernamePasswordAuthenticationToken ustoken = new UsernamePasswordAuthenticationToken(byUsername, null, byUsername.getAuthorities());
//                ustoken
//                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(ustoken);
//            }
//        }
//        filterChain.doFilter(request, response);
//    }
}
